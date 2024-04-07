package oop2.tp3.ejercicio1;

public class CalculadoraAlquilerNuevoLanzamiento extends CalculadoraAquiler {
    public CalculadoraAlquilerNuevoLanzamiento(Alquiler alquiler, int tipoLibro) {
        super(alquiler, tipoLibro);
    }

    @Override
    public double calcularMonto() {
        return alquiler.diasAlquilados() * 3;
    }

    @Override
    public int calcularPuntos() {
        int puntos = CONSTANTE_PUNTOS;
        if ((alquiler.copia().libro().codigoPrecio() == Libro.NUEVO_LANZAMIENTO)
                && alquiler.diasAlquilados() > 1) {
            puntos++;
        }
        return puntos;
    }
}
