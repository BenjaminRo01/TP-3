package oop2.tp3.ejercicio1;

public class LibroLanzamiento extends Libro {
    public LibroLanzamiento(String nombre) {
        super(nombre);
    }

    @Override
    double calcularMontoAlquiler(int dias) {
        return dias * 3;
    }

    @Override
    public int obtenerPuntosAlquiler(int dias) {
        int puntos = 1;
        if (dias > 1) {
            puntos++;
        }
        return puntos;
    }
}
