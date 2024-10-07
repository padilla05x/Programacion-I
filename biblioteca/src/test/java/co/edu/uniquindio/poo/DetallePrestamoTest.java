package co.edu.uniquindio.poo;
/**
 * Clase para probar el funcionamiento del código de la clase DetallaPrestano
 */
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;


import co.edu.uniquindio.poo.model.EstadoPrestamo;
import co.edu.uniquindio.poo.model.Libro;

import co.edu.uniquindio.poo.model.DetallePrestamo;



public class DetallePrestamoTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void StockInsuficienteTest() {
        LOG.info("Iniciando test testStockInsuficiente");

        Libro libro1 = new Libro("Programación en Java", "001", "1234567890", "Autor Ejemplo", "Editorial Ejemplo", LocalDate.of(2020, 1, 1), 3, EstadoPrestamo.DISPONIBLE);  // Solo 2 libro en stock

        // Se pide una cantidad de 3 (excede el stock)
        DetallePrestamo detallePrestamo = new DetallePrestamo(2, libro1);

        detallePrestamo.ajustesNecesario();

        // El stock no debe cambiar porque la cantidad solicitada excede el stock
        assertEquals(1, libro1.getStock());  
        assertEquals(EstadoPrestamo.DISPONIBLE, libro1.getEstado());  // El estado sigue disponible, ya que no se realizó el ajuste

        LOG.info("Finalizando test testStockInsuficiente");
    }


    @Test
    public void testGetCantidad() {
        LOG.info("Iniciando test testGetCantidad");

        // Crear un libro de ejemplo
        Libro libro = new Libro("Programación I", "qwerty", "4577", "UQ", "Editoriall", LocalDate.of(2025, 1, 12), 10, EstadoPrestamo.DISPONIBLE);
        
        // Crear un detalle de préstamo con una cantidad de 3
        DetallePrestamo detallePrestamo = new DetallePrestamo(3, libro);

        // Verificar que el método getCantidad devuelve el valor
        assertEquals(3, detallePrestamo.getCantidad());

        LOG.info("Finalizando test testGetCantidad");
    }

}