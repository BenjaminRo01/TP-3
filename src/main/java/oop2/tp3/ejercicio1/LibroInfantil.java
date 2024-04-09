package oop2.tp3.ejercicio1;

public class LibroInfantil extends Libro {
    public LibroInfantil(String nombre) {
        super(nombre);
    }

    @Override
    double calcularMontoAlquiler(int dias) {
        double monto = 1.5;
        if (dias > 3) {
            monto += (dias - 3) * 1.5;
        }
        return monto;
    }
}
