package co.edu.uniquindio.poo;
/**
 * Clase para probar el funcionamiento del código de la clase Libro
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.EstadoPrestamo;
import co.edu.uniquindio.poo.model.Libro;

public class LibroTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void CrearLibroTest() {
        LOG.info("Iniciando test testCrearLibro");

        // Crear un libro
        EstadoPrestamo estado = EstadoPrestamo.DISPONIBLE; // Asumiendo que el enum tiene este estado
        Libro libro = new Libro("100 años de programar", "001", "900876", "Gabo",  "Editorial X", LocalDate.of(1943, 4, 6), 10, estado);

        // Verificar que los datos sean correctos
        assertEquals("100 años de programar", libro.getTitulo());
        assertEquals("001", libro.getCodigo());
        assertEquals("900876", libro.getIsbn());
        assertEquals("Gabo", libro.getAutor());
        assertEquals("Editorial X", libro.getEditorial());
        assertEquals(LocalDate.of(1943, 4, 6), libro.getFechaDePublicacion());
        assertEquals(10, libro.getStock());
        assertEquals(estado, libro.getEstado());

        LOG.info("Finalizando test testCrearLibro");
    }


    @Test
    public void testActualizarStock() {
        LOG.info("Iniciando test testActualizarStock");

        // Crear un libro
        EstadoPrestamo estado = EstadoPrestamo.DISPONIBLE; // Asumiendo que el enum tiene este estado
        Libro libro = new Libro("100 años de programar", "001", "900876", "Gabo",  "Editorial X", LocalDate.of(1943, 4, 6), 10, estado);

        // Verificar el stock inicial
        assertEquals(10, libro.getStock());

        // Actualizar el stock
        libro.setStock(5);
        
        // Verificar que el stock se haya actualizado correctamente
        assertEquals(5, libro.getStock());

        LOG.info("Finalizando test testActualizarStock");
    }
}
