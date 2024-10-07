package co.edu.uniquindio.poo;
/**
 * Clase para probar el funcionamiento del código de la clase Biblioteca
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.Biblioteca;
import co.edu.uniquindio.poo.model.Bibliotecario;
import co.edu.uniquindio.poo.model.Estudiante;



public class BibliotecaTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void AgregarBibliotecarioTest() {
        LOG.info("Iniciando test testAgregarBibliotecario");
        
        Biblioteca biblioteca = new Biblioteca("Biblioteca UQ");
        Bibliotecario bibliotecario = new Bibliotecario("Rodolfo", "10003435", "31592343", null, 1200000, 2021);

        biblioteca.agregarBibliotecario(bibliotecario);

        assertTrue(biblioteca.verificarBibliotecario("10003435"));
        assertEquals(1, biblioteca.getListaBibliotecarios().size());

        // Intentar agregar el mismo bibliotecario de nuevo
        biblioteca.agregarBibliotecario(bibliotecario);
        assertEquals(1, biblioteca.getListaBibliotecarios().size());  // No debería aumentar el tamaño de la lista

        LOG.info("Finalizando test testAgregarBibliotecario");
    }


    @Test
    public void testAgregarEstudiante() {
        LOG.info("Iniciando test testAgregarEstudiante");

        Biblioteca biblioteca = new Biblioteca("UQ");
        Estudiante estudiante = new Estudiante("Santiago", "1112620", "30175949", "spr@gmail.com");

        biblioteca.agregarEstudiante(estudiante);

        assertTrue(biblioteca.verificarEstudiante("1112620"));
        assertEquals(1, biblioteca.getListaEstudiantes().size());

        LOG.info("Finalizando test testAgregarEstudiante");
    }
}
