package oop2.tp3.ejercicio1;

import java.util.List;

public class CalculadoraAquiler {
    private List<Alquiler> alquileres;

    public CalculadoraAquiler(List<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }

    public double calcularMonto() {
        double monto = 0;
        for (Alquiler alquiler : alquileres) {
            switch (alquiler.copia().libro().codigoPrecio()) {
                case Libro.REGULARES:
                    monto += 2;
                    if (alquiler.diasAlquilados() > 2)
                        monto += (alquiler.diasAlquilados() - 2) * 1.5;
                    break;
                case Libro.NUEVO_LANZAMIENTO:
                    monto += alquiler.diasAlquilados() * 3;
                    break;
                case Libro.INFANTILES:
                    monto += 1.5;
                    if (alquiler.diasAlquilados() > 3)
                        monto += (alquiler.diasAlquilados() - 3) * 1.5;
                    break;
            }
        }
        return monto;
    }

    public int calcularPuntos() {
        int puntos = 0;
        for (Alquiler alquiler : alquileres) {
            if ((alquiler.copia().libro().codigoPrecio() == Libro.NUEVO_LANZAMIENTO)
                    && alquiler.diasAlquilados() > 1) {
                puntos++;
            }
            puntos++;
        }
        return puntos;
    }
}
