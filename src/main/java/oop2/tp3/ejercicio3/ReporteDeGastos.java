package oop2.tp3.ejercicio3;

import java.time.LocalDate;
import java.util.List;

enum TipoDeGasto {
    CENA, DESAYUNO, ALQUILER_AUTO
}

class Gasto {
    TipoDeGasto tipoGasto;
    int monto;

    public Gasto(TipoDeGasto tipoGasto, int monto) {
        this.tipoGasto = tipoGasto;
        this.monto = monto;
    }
}

public class ReporteDeGastos {
    public ReporteDeGastos() {
    }

    public String imprimir(List<Gasto> gastos) {
        int total = 0;
        int gastosDeComida = 0;
        StringBuilder reporte = new StringBuilder();
        reporte = new StringBuilder("Expenses " + LocalDate.now() + "\n");

        for (Gasto gasto : gastos) {
            if (gasto.tipoGasto == TipoDeGasto.CENA || gasto.tipoGasto == TipoDeGasto.DESAYUNO) {
                gastosDeComida += gasto.monto;
            }

            String nombreGasto = "";
            switch (gasto.tipoGasto) {
                case CENA:
                    nombreGasto = "Cena";
                    break;
                case DESAYUNO:
                    nombreGasto = "Desayuno";
                    break;
                case ALQUILER_AUTO:
                    nombreGasto = "Alquiler de Autos";
                    break;
            }

            String marcaExcesoComidas = gasto.tipoGasto == TipoDeGasto.CENA && gasto.monto > 5000
                    || gasto.tipoGasto == TipoDeGasto.DESAYUNO && gasto.monto > 1000 ? "X" : " ";

            reporte.append(nombreGasto).append("\t").append(gasto.monto).append("\t").append(marcaExcesoComidas).append("\n");

            total += gasto.monto;
        }

        reporte.append("Gastos de comida: ").append(gastosDeComida).append("\n");
        reporte.append("Total de gastos: ").append(total);

        return reporte.toString();
    }
}
