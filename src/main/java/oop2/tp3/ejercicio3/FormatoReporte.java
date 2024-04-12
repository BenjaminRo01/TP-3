package oop2.tp3.ejercicio3;

import java.time.LocalDate;

public class FormatoReporte {
    public static String formatoCabecera() {
        return "Expenses " + LocalDate.now() + "\n";
    }

    public static String formatoLineaGasto(Gasto gasto) {
        return gasto.obtenerNombre() + "\t" + gasto.obtenerMonto() + "\t" + gasto.excesoDeGastoComida() + "\n";
    }

    public static String formatoGastosDeComida(int total) {
        return "Gastos de comida: " + total + "\n";
    }

    public static String formatoTotal(int total) {
        return "Total de gastos: " + total;
    }
}
