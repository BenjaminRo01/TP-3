package oop2.tp3.ejercicio1;

public abstract class CalculadoraAquiler {
    protected static final int CONSTANTE_PUNTOS = 1;
    protected Alquiler alquiler;

    public CalculadoraAquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    public abstract double calcularMonto();

    public int calcularPuntos() {
        return CONSTANTE_PUNTOS;
    }
}

