package oop2.tp3.ejercicio1;

public class CalculadoraAlquilerNuevoLanzamiento extends CalculadoraAquiler {
    private static final int CONSTANTE_MIN_DIAS_ALQUILADOS = 1; //Constante minima de dias alquilados
    private static final int COEFICIENTE_COSTO_POR_DIA = 3;

    public CalculadoraAlquilerNuevoLanzamiento(Alquiler alquiler) {
        super(alquiler);
    }

    @Override
    public double calcularMonto() {
        return alquiler.diasAlquilados() * COEFICIENTE_COSTO_POR_DIA;
    }

    @Override
    public int calcularPuntos() {
        int puntos = CONSTANTE_PUNTOS;
        if (alquiler.diasAlquilados() > CONSTANTE_MIN_DIAS_ALQUILADOS) {
            puntos++;
        }
        return puntos;
    }
}
