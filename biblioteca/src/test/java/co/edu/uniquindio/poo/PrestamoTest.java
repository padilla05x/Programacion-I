package co.edu.uniquindio.poo;
/**
 * Clase para probar el funcionamiento del código de la clase Prestamo
*/

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
 
import co.edu.uniquindio.poo.model.Prestamo;

public class PrestamoTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void CalcularDiasPrestamoTest() {
        LOG.info("Iniciando test testCalcularDiasPrestamo");

        // Crear un préstamo con fechas conocidas
        LocalDate fechaPrestamo = LocalDate.of(2024, 9, 1);
        LocalDate fechaEntrega = LocalDate.of(2024, 9, 5);
        double costoPorDia = 4.200;

        Prestamo prestamo = new Prestamo(fechaPrestamo, fechaEntrega, costoPorDia, null, null);

        // Verificar que el cálculo de días sea correcto
        assertEquals(4, prestamo.calcularDiasPrestamo());

        LOG.info("Finalizando test testCalcularDiasPrestamo");
    }


    @Test
    public void CalcularCostoTotalTest() {
        LOG.info("Iniciando test testCalcularCostoTotal");

        // Crear un préstamo
        LocalDate fechaPrestamo = LocalDate.of(2024, 9, 1);
        LocalDate fechaEntrega = LocalDate.of(2024, 9, 5);
        double costoPorDia = 4200;

        Prestamo prestamo = new Prestamo(fechaPrestamo, fechaEntrega, costoPorDia, null, null);

        // Calcular el costo total
        double costoTotal = prestamo.calcularCostoTotal();

        // Verificar que el costo total sea correcto
        assertEquals(16800, costoTotal, 0.01); // 4 días a 4.200 por día

        LOG.info("Finalizando test testCalcularCostoTotal");
    }
    
}
