package oop2.tp3.ejercicio1;

public class LibroRegular extends Libro {
    public LibroRegular(String nombre) {
        super(nombre);
    }

    @Override
    double calcularMontoAlquiler(int dias) {
        double monto = 2;
        if (dias > 2) {
            monto += (dias - 2) * 1.5;
        }
        return monto;
    }
}
