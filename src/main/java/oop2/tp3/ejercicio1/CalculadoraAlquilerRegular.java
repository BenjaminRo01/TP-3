package oop2.tp3.ejercicio1;

public class CalculadoraAlquilerRegular extends CalculadoraAquiler {

    public CalculadoraAlquilerRegular(Alquiler alquiler, int tipoLibro) {
        super(alquiler, tipoLibro);
    }

    @Override
    public double calcularMonto() {
        double monto = 2;
        if (alquiler.diasAlquilados() > 2) {
            monto += (alquiler.diasAlquilados() - 2) * 1.5;
        }
        return monto;
    }

}