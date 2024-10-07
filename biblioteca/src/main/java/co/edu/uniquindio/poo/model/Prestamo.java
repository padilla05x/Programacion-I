package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.LinkedList;

public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaEntrega;
    private double costoPorDia;
    private LinkedList<DetallePrestamo> Detallesprestamos;


    /**
    * Constructor
    */
    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaEntrega, double costoPorDia, Estudiante estudiante, Bibliotecario bibliotecario) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.costoPorDia = costoPorDia;
        Detallesprestamos = new LinkedList<>();
    }

    /**
     * Getters y Setters
     */
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public double getCostoPorDia() {
        return costoPorDia;
    }

    public void setCostoPorDia(double costoPorDia) {
        this.costoPorDia = costoPorDia;
    }

    public LinkedList<DetallePrestamo> getDetallesprestamos() {
        return Detallesprestamos;
    }

    public void setDetallesprestamos(LinkedList<DetallePrestamo> Detallesprestamos) {
        this.Detallesprestamos = Detallesprestamos;
    }

    /**
     * Metodo que calcula los dias que el libro fue prestado
     */
    public long calcularDiasPrestamo() {
        long diasPrestamo = java.time.Duration.between(fechaPrestamo.atStartOfDay(), fechaEntrega.atStartOfDay()).toDays();
        return diasPrestamo;
    }

    /**
     * Metodod que calcula el costo total
     */
    public double calcularCostoTotal() {
        return calcularDiasPrestamo() * costoPorDia;
    }

    /**
     * Metodo que vincula los DetallesPrestamo a un Prestamo
     */
    public void agregarDetallesPrestamos(DetallePrestamo detallePrestamo) {
        getDetallesprestamos().add(detallePrestamo);
    }

}