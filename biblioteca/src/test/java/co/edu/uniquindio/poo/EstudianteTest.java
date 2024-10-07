package co.edu.uniquindio.poo;
/**
 * Clase para probar el funcionamiento del código de la clase Estudainte
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.Estudiante;


public class EstudianteTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());


    @Test
    public void CrearEstudianteTest() {
        LOG.info("Iniciando test testCrearEstudiante");

        // Crear un estudiante
        Estudiante estudiante = new Estudiante("Santiago", "1121620", "301759", "spr@uqvirtual.edu.co");

        // Verificar que los datos sean correctos
        assertEquals("Santiago", estudiante.getNombre());
        assertEquals("1121620", estudiante.getCedula());
        assertEquals("301759", estudiante.getTelefono());
        assertEquals("spr@uqvirtual.edu.co", estudiante.getCorreo());

        LOG.info("Finalizando test testCrearEstudiante");
    }


    @Test
    public void ListaPrestamosInicializadaTest() {
        LOG.info("Iniciando test testListaPrestamosInicializada");

        // Crear un estudiante
        Estudiante estudiante = new Estudiante("Santiago", "1121620", "301759", "spr@uqvirtual.edu.co");

        // Verificar que la lista de préstamos esté vacía
        assertTrue(estudiante.getListaPrestamos().isEmpty());

        LOG.info("Finalizando test testListaPrestamosInicializada");
    }


}
