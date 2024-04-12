package oop2.tp3.ejercicio1;

public class LibroLanzamiento extends Libro {
    private static final int CONSTANTE_MIN_DIAS_ALQUILADOS = 1; //Constante minima de dias alquilados
    private static final int COEFICIENTE_COSTO_POR_DIA = 3;

    public LibroLanzamiento(String nombre) {
        super(nombre);
    }

    @Override
    double calcularMontoAlquiler(int dias) {
        return dias * COEFICIENTE_COSTO_POR_DIA;
    }

    @Override
    public int obtenerPuntosAlquiler(int dias) {
        int puntos = CONSTANTE_PUNTOS;
        if (dias > CONSTANTE_MIN_DIAS_ALQUILADOS) {
            puntos++;
        }
        return puntos;
    }
}
