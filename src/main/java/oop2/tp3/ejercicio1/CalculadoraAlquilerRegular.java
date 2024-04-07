package oop2.tp3.ejercicio1;

public class CalculadoraAlquilerRegular extends CalculadoraAquiler {
    private static final int CONSTANTE_MIN_DIAS_ALQUILADOS = 2; //Constante minima de dias alquilados
    private static final int CONSTANTE_MONTO = 2;
    private static final double COEFICIENTE_COSTO_POR_DIA = 1.5;

    public CalculadoraAlquilerRegular(Alquiler alquiler, int tipoLibro) {
        super(alquiler, tipoLibro);
    }

    @Override
    public double calcularMonto() {
        double monto = CONSTANTE_MONTO;
        if (alquiler.diasAlquilados() > CONSTANTE_MIN_DIAS_ALQUILADOS) {
            monto += (alquiler.diasAlquilados() - CONSTANTE_MIN_DIAS_ALQUILADOS) * COEFICIENTE_COSTO_POR_DIA;
        }
        return monto;
    }
}