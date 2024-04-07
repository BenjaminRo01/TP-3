package oop2.tp3.ejercicio1;

public abstract class CalculadoraAquiler {
    public static final int CONSTANTE_PUNTOS = 1;
    protected Alquiler alquiler;
    protected int tipoLibro;

    public CalculadoraAquiler(Alquiler alquiler, int tipoLibro) {
        this.alquiler = alquiler;
        this.tipoLibro = tipoLibro;
    }

    public abstract double calcularMonto();

    public int calcularPuntos() {
        return CONSTANTE_PUNTOS;
    }
}

