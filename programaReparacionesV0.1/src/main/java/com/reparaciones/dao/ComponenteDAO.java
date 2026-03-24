package com.reparaciones.dao;

import com.reparaciones.models.Componente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ComponenteDAO {

    public List<Componente> getAll() throws SQLException {
        List<Componente> lista = new ArrayList<>();
        String sql = "SELECT * FROM Componente";
        try (Connection con = Conexion.getConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(mapear(rs));
            }
        }
        return lista;
    }

    public List<Componente> getStockBajo() throws SQLException {
        List<Componente> lista = new ArrayList<>();
        String sql = "SELECT * FROM Componente WHERE STOCK <= STOCK_MINIMO";
        try (Connection con = Conexion.getConexion();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(mapear(rs));
            }
        }
        return lista;
    }

    public void insertar(Componente c) throws SQLException {
        String sql = "INSERT INTO Componente (TIPO, STOCK, STOCK_MINIMO, PRECIO_UNIDAD) " +
                     "VALUES (?, ?, ?, ?)";
        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, c.getTipo());
            ps.setInt(2, c.getStock());
            ps.setInt(3, c.getStockMinimo());
            ps.setBigDecimal(4, c.getPrecioUnidad());
            ps.executeUpdate();
        }
    }

    public void actualizar(Componente c) throws SQLException {
        String sql = "UPDATE Componente SET TIPO=?, STOCK=?, STOCK_MINIMO=?, " +
                     "PRECIO_UNIDAD=? WHERE ID_COM=?";
        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, c.getTipo());
            ps.setInt(2, c.getStock());
            ps.setInt(3, c.getStockMinimo());
            ps.setBigDecimal(4, c.getPrecioUnidad());
            ps.setInt(5, c.getIdCom());
            ps.executeUpdate();
        }
    }

    public void eliminar(int idCom) throws SQLException {
        String sql = "DELETE FROM Componente WHERE ID_COM = ?";
        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idCom);
            ps.executeUpdate();
        }
    }

    public void actualizarStock(int idCom, int cantidad) throws SQLException {
        String sql = "UPDATE Componente SET STOCK = STOCK + ? WHERE ID_COM = ?";
        try (Connection con = Conexion.getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, cantidad);
            ps.setInt(2, idCom);
            ps.executeUpdate();
        }
    }

    private Componente mapear(ResultSet rs) throws SQLException {
        return new Componente(
            rs.getInt("ID_COM"),
            rs.getString("TIPO"),
            rs.getTimestamp("FECHA_REGISTRO").toLocalDateTime(),
            rs.getInt("STOCK"),
            rs.getInt("STOCK_MINIMO"),
            rs.getBigDecimal("PRECIO_UNIDAD")
        );
    }
}