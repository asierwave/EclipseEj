package com.reparaciones.models;

import java.time.LocalDateTime;

public class Reparacion {

    private String idRep;
    private LocalDateTime fechaFin;
    private long imei;
    private int idTec;

    public Reparacion(String idRep, LocalDateTime fechaFin, long imei, int idTec) {
        this.idRep = idRep;
        this.fechaFin = fechaFin;
        this.imei = imei;
        this.idTec = idTec;
    }

    public String getIdRep() { return idRep; }
    public void setIdRep(String idRep) { this.idRep = idRep; }

    public LocalDateTime getFechaFin() { return fechaFin; }
    public void setFechaFin(LocalDateTime fechaFin) { this.fechaFin = fechaFin; }

    public long getImei() { return imei; }
    public void setImei(long imei) { this.imei = imei; }

    public int getIdTec() { return idTec; }
    public void setIdTec(int idTec) { this.idTec = idTec; }
}