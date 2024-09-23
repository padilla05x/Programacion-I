package co.edu.uniquindio.poo.model;

import java.util.Date;

public class Prestamo {
    private Double costo;
    private Date fechaEntrega;
    private Date fechaPrestamo;

    public Prestamo(Double costo, Date fechaEntrega, Date fechaPrestamo){
        this.costo = costo;
        this.fechaEntrega = fechaEntrega;
        this.fechaPrestamo = fechaPrestamo;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    @Override
    public String toString() {
        return "Prestamo [costo=" + costo + ", fechaEntrega=" + fechaEntrega + ", fechaPrestamo=" + fechaPrestamo + "]";
    }

}
