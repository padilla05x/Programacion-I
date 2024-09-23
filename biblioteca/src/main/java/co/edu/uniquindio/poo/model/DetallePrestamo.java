package co.edu.uniquindio.poo.model;

public class DetallePrestamo {
    private Double subtotal;
    private int cantidad;

    public DetallePrestamo(Double subtotal, int cantidad) {
        this.subtotal = subtotal;
        this.cantidad = cantidad;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    

    
}
