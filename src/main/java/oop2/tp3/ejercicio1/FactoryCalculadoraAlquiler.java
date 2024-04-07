package oop2.tp3.ejercicio1;

public class FactoryCalculadoraAlquiler {
    public static CalculadoraAquiler crear(Alquiler alquiler) {
        int tipoLibro = alquiler.codigoPrecioLibro();
        switch (tipoLibro) {
            case Libro.REGULARES:
                return new CalculadoraAlquilerRegular(alquiler);
            case Libro.NUEVO_LANZAMIENTO:
                return new CalculadoraAlquilerNuevoLanzamiento(alquiler);
            case Libro.INFANTILES:
                return new CalculadoraAlquilerInfantil(alquiler);
            default:
                throw new RuntimeException("Tipo de libro desconocido.");
        }
    }
}
