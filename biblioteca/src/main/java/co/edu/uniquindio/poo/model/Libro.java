package co.edu.uniquindio.poo.model;

public class Libro {
    private String titulo;
    private String codigo;
    private String isbn;
    private String autor;
    private String editorial;
    private String fecha;
    private Byte disponibilidad;

    public Libro(String titulo, String codigo, String isbn, String autor, String editorial, String fecha, byte disponibilidad){
        this.titulo = titulo;
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
        this.fecha = fecha;
        this.disponibilidad = disponibilidad;
    }

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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public byte getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(byte disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", codigo=" + codigo + ", isbn=" + isbn + ", autor=" + autor + ", editorial=" + editorial + ", fecha=" + fecha + ", disponibilidad=" + disponibilidad + "]";
    }

    
}
