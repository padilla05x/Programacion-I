package co.edu.uniquindio.poo.model;

public class Producto {
    // Atributos
    private String nombre;
    private int precioCompra;
    private tipoProducto tipo;
    
    // Constructor
    public Producto(String nombre, int precioCompra, tipoProducto tipo){
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.tipo = tipo;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public tipoProducto getTipo() {
        return tipo;
    }

    public void setTipo(tipoProducto tipo) {
        this.tipo = tipo;
    }

    // Método para calcular el precio de venta
    public double calcularPrecioVenta(){
        if (tipo == tipoProducto.REFRIGERADOS) {
            return (precioCompra * 0.1) + precioCompra;
        } else if (tipo == tipoProducto.PERECEDEROS) {
            return (precioCompra * 0.15) + precioCompra;
        } else if (tipo == tipoProducto.NO_PERECEDEROS) {
            return (precioCompra * 0.05) + precioCompra;
        } else {
            return precioCompra; // En caso de que el tipo no este, devuelve el precio de compra
        }  
    }
}
