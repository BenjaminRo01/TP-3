package oop2.tp3.ejercicio3;

import java.time.LocalDate;
import java.util.List;

public class ReporteDeGastos {
    public String imprimir(List<Gasto> gastos, LocalDate fechaReporte) {
        int total = 0;
        int gastosDeComida = 0;
        StringBuilder reporte = new StringBuilder("Expenses " + fechaReporte + "\n");
        for (Gasto gasto : gastos) {
            gastosDeComida += gasto.montoComidas();
            String strExcesoGastoComida = gasto.excesoDeGastoComida() ? "X" : " ";
            reporte.append(gasto.obtenerNombre()).append("\t")
                    .append(gasto.obtenerMonto()).append("\t")
                    .append(strExcesoGastoComida).append("\n");
            total += gasto.monto();
        }
        reporte.append("Gastos de comida: ").append(gastosDeComida).append("\n");
        reporte.append("Total de gastos: ").append(total);
        return reporte.toString();
    }
}
