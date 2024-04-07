package oop2.tp3.ejercicio1;

public class CalculadoraAlquilerInfantil extends CalculadoraAquiler {
    public CalculadoraAlquilerInfantil(Alquiler alquiler, int tipoLibro) {
        super(alquiler, tipoLibro);
    }

    @Override
    public double calcularMonto() {
        double monto = 1.5;
        if (alquiler.diasAlquilados() > 3) {
            monto += (alquiler.diasAlquilados() - 3) * 1.5;
        }
        return monto;
    }
}
