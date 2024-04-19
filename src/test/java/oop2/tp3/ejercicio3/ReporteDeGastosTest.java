package oop2.tp3.ejercicio3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReporteDeGastosTest {
    @Test
    public void testReporteSinExcesoDeGastos() {
        List<Gasto> gastos = List.of(
                new GastoDesayuno(23),
                new GastoCena(50),
                new GastoAlquilerAuto(100));

        var reporte = new ReporteDeGastos();
        var fechaReporte = LocalDate.now();

        var reporteEsperado = "Expenses " + fechaReporte + "\n" +
                "Desayuno" + "\t" + 23 + "\t" + " " + "\n" +
                "Cena" + "\t" + 50 + "\t" + " " + "\n" +
                "Alquiler de Autos" + "\t" + 100 + "\t" + " " + "\n" +
                "Gastos de comida: " + 73 + "\n" +
                "Total de gastos: " + 173;
        assertEquals(reporte.imprimir(gastos, fechaReporte), reporteEsperado);
    }

    @Test
    public void testReporteConExcesoDeGastos() {
        List<Gasto> gastos = List.of(
                new GastoDesayuno(1200),
                new GastoCena(5500),
                new GastoAlquilerAuto(1000));

        var reporte = new ReporteDeGastos();
        var fechaReporte = LocalDate.now();

        String reporteEsperado = "Expenses " + fechaReporte + "\n" +
                "Desayuno" + "\t" + 1200 + "\t" + "X" + "\n" +
                "Cena" + "\t" + 5500 + "\t" + "X" + "\n" +
                "Alquiler de Autos" + "\t" + 1000 + "\t" + " " + "\n" +
                "Gastos de comida: " + 6700 + "\n" +
                "Total de gastos: " + 7700;

        assertEquals(reporte.imprimir(gastos, fechaReporte), reporteEsperado);
    }
}
