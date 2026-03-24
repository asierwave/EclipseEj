package com.reparaciones.dao;

import com.reparaciones.models.Reparacion;
import com.reparaciones.models.ReparacionResumen;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ReparacionDAO {

    /**
     * Devuelve todas las reparaciones con datos agregados para la TableView admin.
     * LEFT JOIN en Reparacion para obtener el ID de la reparación que resolvió
     * la incidencia — si ninguna apunta a esta como anterior, el campo es NULL.
     */
    public List<ReparacionResumen> getReparacionesResumen() throws SQLException {
        List<ReparacionResumen> lista = new ArrayList<>();
        String sql = """
                SELECT r.ID_REP, r.IMEI, r.FECHA_FIN, r.ID_TEC,
                       t.NOMBRE AS nombre_tecnico,
                       c.TIPO AS tipo_componente,
                       rc.OBSERVACIONES,
                       rc.ES_INCIDENCIA,
                       rc.ES_RESUELTO,
                       rc.INCIDENCIA,
                       r.ID_REP_ANTERIOR AS id_rep_nueva
                FROM Reparacion r
                JOIN Tecnico t ON r.ID_TEC = t.ID_TEC
                JOIN Reparacion_componente rc ON r.ID_REP = rc.ID_REP
                JOIN Componente c ON rc.ID_COM = c.ID_COM
                ORDER BY r.ID_REP ASC
                """;
        try (Connection con = Conexion.getConexion();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new ReparacionResumen(
                        rs.getString("ID_REP"),
                        rs.getLong("IMEI"),
                        rs.getString("nombre_tecnico"),
                        rs.getTimestamp("FECHA_FIN").toLocalDateTime(),
                        rs.getString("tipo_componente"),
                        rs.getString("OBSERVACIONES"),
                        rs.getBoolean("ES_INCIDENCIA"),
                        rs.getBoolean("ES_RESUELTO"),
                        rs.getString("INCIDENCIA"),
                        rs.getString("id_rep_nueva"),
                        rs.getInt("ID_TEC")));
            }
        }
        return lista;
    }

    public List<Reparacion> getAll() throws SQLException {
        List<Reparacion> lista = new ArrayList<>();
        String sql = "SELECT * FROM Reparacion";
        try (Connection con = Conexion.getConexion();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(mapear(rs));
            }
        }
        return lista;
    }

    public List<Reparacion> getByImei(long imei) throws SQLException {
        List<Reparacion> lista = new ArrayList<>();
        String sql = "SELECT * FROM Reparacion WHERE IMEI = ?";
        try (Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setLong(1, imei);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(mapear(rs));
            }
        }
        return lista;
    }

    public String insertar(Reparacion r) throws SQLException {
        String idRep = generarId();
        String sql = "INSERT INTO Reparacion (ID_REP, FECHA_FIN, IMEI, ID_TEC) VALUES (?, ?, ?, ?)";
        try (Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, idRep);
            ps.setTimestamp(2, Timestamp.valueOf(r.getFechaFin()));
            ps.setLong(3, r.getImei());
            ps.setInt(4, r.getIdTec());
            ps.executeUpdate();
        }
        return idRep;
    }

    public int countByImei(long imei) throws SQLException {
        String sql = "SELECT COUNT(*) FROM Reparacion WHERE IMEI = ?";
        try (Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setLong(1, imei);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
                return rs.getInt(1);
        }
        return 0;
    }

    /**
     * Genera el ID de la reparación con formato RyyyyMMdd_N donde N es el índice
     * diario — reinicia a 1 cada día para reflejar el día exacto de la reparación.
     * Ejemplo: R20260310_1, R20260310_2
     */
    public String generarId() throws SQLException {
        String fechaHoy = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String sql = "SELECT COUNT(*) FROM Reparacion WHERE ID_REP LIKE ?";
        try (Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, "R" + fechaHoy + "_%");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int contador = rs.getInt(1) + 1;
                return "R" + fechaHoy + "_" + contador;
            }
        }
        return "R" + fechaHoy + "_1";
    }

    private Reparacion mapear(ResultSet rs) throws SQLException {
        return new Reparacion(
                rs.getString("ID_REP"),
                rs.getTimestamp("FECHA_FIN").toLocalDateTime(),
                rs.getLong("IMEI"),
                rs.getInt("ID_TEC"));
    }

    /**
     * Comprueba si alguna reparación apunta a esta como anterior.
     * Si existe referenciadora no se puede borrar — hay que borrar la
     * referenciadora primero.
     */
    public String getReferenciadora(String idRep) throws SQLException {
        String sql = "SELECT ID_REP FROM Reparacion WHERE ID_REP_ANTERIOR = ?";
        try (Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, idRep);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
                return rs.getString("ID_REP");
        }
        return null;
    }

    /**
     * Borra una reparación y su Reparacion_componente en transacción.
     * Si la reparación borrada tenía ID_REP_ANTERIOR, significa que era la que
     * resolvía una incidencia — se revierte ES_RESUELTO a FALSE en la anterior
     * para que vuelva a aparecer en rojo y con opción de borrar la incidencia.
     */
    public void eliminar(String idRep) throws SQLException {
        String sqlGetAnterior = "SELECT ID_REP_ANTERIOR FROM Reparacion WHERE ID_REP = ?";
        String sqlComp = "DELETE FROM Reparacion_componente WHERE ID_REP = ?";
        String sqlRep = "DELETE FROM Reparacion WHERE ID_REP = ?";
        String sqlRevertir = "UPDATE Reparacion_componente SET ES_RESUELTO = FALSE WHERE ID_REP = ?";

        try (Connection con = Conexion.getConexion()) {
            con.setAutoCommit(false);
            try {
                // Obtener la reparación anterior antes de borrar
                String idRepAnterior = null;
                try (PreparedStatement ps = con.prepareStatement(sqlGetAnterior)) {
                    ps.setString(1, idRep);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next())
                        idRepAnterior = rs.getString("ID_REP_ANTERIOR");
                }

                // Borrar componente y reparacion
                try (PreparedStatement ps1 = con.prepareStatement(sqlComp)) {
                    ps1.setString(1, idRep);
                    ps1.executeUpdate();
                }
                try (PreparedStatement ps2 = con.prepareStatement(sqlRep)) {
                    ps2.setString(1, idRep);
                    ps2.executeUpdate();
                }

                // Si tenía anterior, revertir ES_RESUELTO a FALSE
                if (idRepAnterior != null) {
                    try (PreparedStatement ps3 = con.prepareStatement(sqlRevertir)) {
                        ps3.setString(1, idRepAnterior);
                        ps3.executeUpdate();
                    }
                }

                con.commit();
            } catch (SQLException e) {
                con.rollback();
                throw e;
            }
        }
    }

}