package oop2.tp3.ejercicio1;

public abstract class Libro {
    protected String nombre;

    public Libro(String nombre) {
        this.nombre = nombre;
    }

    public String nombre() {
        return nombre;
    }

    abstract double calcularMontoAlquiler(int dias);

    public int obtenerPuntosAlquiler(int dias) {
        return 1;
    }
}