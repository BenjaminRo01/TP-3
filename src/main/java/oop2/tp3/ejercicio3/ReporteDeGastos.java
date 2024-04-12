package oop2.tp3.ejercicio3;

import java.util.List;

public class ReporteDeGastos {
    public String imprimir(List<Gasto> gastos) {
        int total = 0;
        int gastosDeComida = 0;
        StringBuilder reporte = new StringBuilder(FormatoReporte.formatoCabecera());
        for (Gasto gasto : gastos) {
            gastosDeComida = gasto.sumarMontoComidas(gastosDeComida);
            reporte.append(FormatoReporte.formatoLineaGasto(gasto));
            total = gasto.sumarMontoTotal(total);
        }

        reporte.append(FormatoReporte.formatoGastosDeComida(gastosDeComida));
        reporte.append(FormatoReporte.formatoTotal(total));

        return reporte.toString();
    }
}
