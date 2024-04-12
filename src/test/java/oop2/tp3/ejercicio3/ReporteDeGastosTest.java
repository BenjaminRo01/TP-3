package oop2.tp3.ejercicio3;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

public class ReporteDeGastosTest {
    @Test
    public void testReporte() {
        List<Gasto> gastos = List.of(
                new Gasto(TipoDeGasto.DESAYUNO, 23),
                new Gasto(TipoDeGasto.CENA, 50),
                new Gasto(TipoDeGasto.ALQUILER_AUTO, 100));

        var reporte = new ReporteDeGastos();

        String reporteEsperado = "Expenses " + LocalDate.now() + "\n" +
                "Desayuno" + "\t" + 23 + "\t" + " " + "\n" +
                "Cena" + "\t" + 50 + "\t" + " " + "\n" +
                "Alquiler de Autos" + "\t" + 100 + "\t" + " " + "\n" +
                "Gastos de comida: " + 73 + "\n" +
                "Total de gastos: " + 173;

        Assert.assertEquals(reporte.imprimir(gastos), reporteEsperado);
    }
}
