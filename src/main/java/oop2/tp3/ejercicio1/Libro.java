package oop2.tp3.ejercicio1;

public abstract class Libro {
    protected static final int CONSTANTE_PUNTOS = 1;
    protected String nombre;

    public Libro(String nombre) {
        this.nombre = nombre;
    }

    abstract double calcularMontoAlquiler(int dias);

    public int obtenerPuntosAlquiler(int dias) {
        return CONSTANTE_PUNTOS;
    }
}