package co.edu.uniquindio.poo;
/**
 * Clase para probar el funcionamiento del código de la clase Bibliotecario
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.Bibliotecario;



public class BibliotecarioTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void CantidadPrestamosTest() {
        LOG.info("Iniciando test testCantidadPrestamos");

        Bibliotecario bibliotecario = new Bibliotecario("Carlos", "00567", "312478", "carlos@mail.com", 2500000, 2015);
        
        //(Un bibliotecario recien creado, con cero prestamos)
        assertEquals(0, bibliotecario.cantidadPrestamos()); 

        LOG.info("Finalizando test testCantidadPrestamos");
    }

    @Test
    public void CalcularAntiguedadTest() {
        LOG.info("Iniciando test testCalcularAntiguedad");

        Bibliotecario bibliotecario = new Bibliotecario("Carlos", "00567", "312478", "carlos@mail.com", 2500000, 2015);
        int antiguedadEsperada = LocalDate.now().getYear() - 2015;

        assertEquals(antiguedadEsperada, bibliotecario.calcularAntiguedad());

        LOG.info("Finalizando test testCalcularAntiguedad");
    }

}