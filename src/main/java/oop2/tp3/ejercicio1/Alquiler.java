package oop2.tp3.ejercicio1;

public class Alquiler {
    private CopiaLibro copia;
    private int diasAlquilados;

    public Alquiler(CopiaLibro copia, int diasAlquilados) {
        this.copia = copia;
        this.diasAlquilados = diasAlquilados;
    }

    public double calcularMonto() {
        return this.copia.libro().calcularMontoAlquiler(this.diasAlquilados);
    }

    public int obtenerPuntosAlquiler() {
        return this.copia.libro().obtenerPuntosAlquiler(this.diasAlquilados);
    }
}
