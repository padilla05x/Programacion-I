package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class Libro {
    private String titulo;
    private String codigo;
    private String isbn;
    private String autor;
    private String editorial;
    private LocalDate fechaDePublicacion;
    private int stock;
    private EstadoPrestamo estado;
    private Collection<DetallePrestamo> historialPrestamos;

    /**
    * Constructor
    */
    public Libro(String titulo, String codigo, String isbn, String autor, String editorial, LocalDate fechaDePublicacion, int stock, EstadoPrestamo estado) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaDePublicacion = fechaDePublicacion;
        this.stock = stock;
        this.estado = estado;
        historialPrestamos = new LinkedList<>();
    }

    /**
     * Metodos getters y setters
     */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public LocalDate getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(LocalDate fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public EstadoPrestamo getEstado() {
        return estado;
    }

    public void setEstado(EstadoPrestamo estado) {
        this.estado = estado;
    }

    public Collection<DetallePrestamo> getDetallesprestamos() {
        return historialPrestamos;
    }

    public void setDetallesprestamos(Collection<DetallePrestamo> historialPrestamos) {
        this.historialPrestamos = historialPrestamos;
    }

    /**
     * Metodo toString
     */
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", codigo=" + codigo + ", isbn=" + isbn + ", autor=" + autor + ", editorial="
                + editorial + ", fechaDePublicacion=" + fechaDePublicacion + ", stock=" + stock + "]";
    }
}