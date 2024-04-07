package oop2.tp3.ejercicio1;

public class CalculadoraAquiler {
    private Alquiler alquiler;
    private int tipoLibro;

    public CalculadoraAquiler(Alquiler alquiler, int tipoLibro) {
        this.alquiler = alquiler;
        this.tipoLibro = tipoLibro;
    }

    public double calcularMonto() {
        double monto = 0;
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
        return monto;
    }

    public int calcularPuntos() {
        int puntos = 0;
        if ((alquiler.copia().libro().codigoPrecio() == Libro.NUEVO_LANZAMIENTO)
                && alquiler.diasAlquilados() > 1) {
            puntos++;
        }
        puntos++;
        return puntos;
    }
}
