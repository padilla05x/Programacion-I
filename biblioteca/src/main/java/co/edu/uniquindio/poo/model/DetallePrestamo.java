package co.edu.uniquindio.poo.model;

import java.time.temporal.ChronoUnit;

/**
 * Clase DetallePrestamo es lo que va contener el prestamo
 */
public class DetallePrestamo {

    private double subtotal;
    private int cantidad;
    private Libro libro;
    private Prestamo prestamo;

    /**
    * Constructor
    */
    public DetallePrestamo(int cantidad, Libro libro) {
        this.libro=libro;
        this.cantidad = cantidad;
        this.subtotal=0;

    }

    /**
     * Metodos getters y setters
     */
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Metodo utilizado por la clase para calcular la diferencia entre dias y tomarlo como un dato long
     */
    public long calcularDiferenciaDias(){
        long diferencia=ChronoUnit.DAYS.between(prestamo.getFechaPrestamo(), prestamo.getFechaEntrega());
        return diferencia;
    }

    /**
     * Metodo para calcular el subtotal de cada libro teniendo en cuenta la diferencia en dias y el costo de cada dia de prestamo y su cantidad
     */
    public long calcularSubtotal(){
        long diferencia=calcularDiferenciaDias();
        long subtotal=(long)prestamo.getCostoPorDia()*diferencia;
        if(cantidad>1){
            subtotal*=cantidad;
        }
        return subtotal;
    }

    /**
     * Metodo necesario a la hora de crear cualquier prestamo (revisando disponibilidad)
     */
    public void ajustesNecesario(){
        int nuevoStock=libro.getStock() - cantidad;
        libro.setStock(nuevoStock);
        if(libro.getStock()==0){
            libro.setEstado(EstadoPrestamo.NO_DISPONIBLE);
        }else if(libro.getStock()>0){
            libro.setEstado(EstadoPrestamo.DISPONIBLE);
        }else if(libro.getStock()<cantidad){
            System.out.println("La cantidad excede el stock por lo tanto no se puede crear el prestamo");
        }

    }

    /**
    * Metodo toString
    */
    @Override
    public String toString() {
        return "DetallePrestamo [subtotal=" + subtotal + ", cantidad=" + cantidad + ", libro=" + libro + ", prestamo=" + prestamo + "]";
    }
}
