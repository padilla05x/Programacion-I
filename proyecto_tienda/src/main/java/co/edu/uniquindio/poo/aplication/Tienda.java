package co.edu.uniquindio.poo.aplication;

import javax.swing.JOptionPane;

import co.edu.uniquindio.poo.model.Producto;
import co.edu.uniquindio.poo.model.tipoProducto;

/**
 * Programa Tienda
 *
 */
public class Tienda {
    public static void main(String[] args) {
       
        // Crear objetos de tipo Producto
        Producto producto1 = new Producto("Libra de arroz", 3500, tipoProducto.NO_PERECEDEROS);
        Producto producto2 = new Producto("Libra de carne", 14000, tipoProducto.PERECEDEROS);
        Producto producto3 = new Producto("six pack de pola", 20000, tipoProducto.REFRIGERADOS);

    // Mostrar productos en JOption
    JOptionPane.showMessageDialog(null, "Primer producto vendido: " + producto1.getNombre() + "\nPrecio de venta: $" + producto1.calcularPrecioVenta());
    
    JOptionPane.showMessageDialog(null, "Segundo producto vendido: " + producto2.getNombre() + "\nPrecio de venta: $" + producto2.calcularPrecioVenta());

    JOptionPane.showMessageDialog(null, "Tercer producto vendido: " + producto3.getNombre() + "\nPrecio de venta: $" + producto3.calcularPrecioVenta());

    }
}
