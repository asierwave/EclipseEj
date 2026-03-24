package com.reparaciones.models;

import java.time.LocalDateTime;

/**
 * Modelo de solo lectura para la vista de la tabla de reparaciones.
 * Agrega datos de Reparacion, Tecnico, Componente y Reparacion_componente
 * en un único objeto listo para mostrar en la TableView admin.
 */
public class ReparacionResumen {

    private String idRep;
    private long imei;
    private String nombreTecnico;
    private LocalDateTime fechaFin;
    private String tipoComponente;
    private String observaciones;
    private boolean esIncidencia;
    private boolean esResuelto;
    private String incidencia;
    private String idRepAnterior;
    private int idTec;

    public ReparacionResumen(String idRep, long imei, String nombreTecnico,
                              LocalDateTime fechaFin, String tipoComponente,
                              String observaciones, boolean esIncidencia,
                              boolean esResuelto, String incidencia,
                              String idRepAnterior, int idTec) {
        this.idRep = idRep;
        this.imei = imei;
        this.nombreTecnico = nombreTecnico;
        this.fechaFin = fechaFin;
        this.tipoComponente = tipoComponente;
        this.observaciones = observaciones;
        this.esIncidencia = esIncidencia;
        this.esResuelto = esResuelto;
        this.incidencia = incidencia;
        this.idRepAnterior = idRepAnterior;
        this.idTec = idTec;
    }

    public String getIdRep() { return idRep; }
    public long getImei() { return imei; }
    public String getNombreTecnico() { return nombreTecnico; }
    public LocalDateTime getFechaFin() { return fechaFin; }
    public String getTipoComponente() { return tipoComponente; }
    public String getObservaciones() { return observaciones; }
    public boolean isEsIncidencia() { return esIncidencia; }
    public boolean isEsResuelto() { return esResuelto; }
    public String getIncidencia() { return incidencia; }
    public String getIdRepAnterior() { return idRepAnterior; }
    public int getIdTec() { return idTec; }

    public void setEsIncidencia(boolean esIncidencia) { this.esIncidencia = esIncidencia; }
    public void setIncidencia(String incidencia) { this.incidencia = incidencia; }
    public void setEsResuelto(boolean esResuelto) { this.esResuelto = esResuelto; }
}