package oop2.tp3.ejercicio1;

public class LibroRegular extends Libro {
    private static final int CONSTANTE_MIN_DIAS_ALQUILADOS = 2; //Constante minima de dias alquilados
    private static final int CONSTANTE_MONTO = 2;
    private static final double COEFICIENTE_COSTO_POR_DIA = 1.5;

    public LibroRegular(String nombre) {
        super(nombre);
    }

    @Override
    double calcularMontoAlquiler(int dias) {
        double monto = CONSTANTE_MONTO;
        if (dias > CONSTANTE_MIN_DIAS_ALQUILADOS) {
            monto += (dias - CONSTANTE_MIN_DIAS_ALQUILADOS) * COEFICIENTE_COSTO_POR_DIA;
        }
        return monto;
    }
}
