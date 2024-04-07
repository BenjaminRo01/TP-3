package oop2.tp3.ejercicio1;

public class FactoryCalculadoraAlquiler {
    public static CalculadoraAquiler crear(Alquiler alquiler) {
        int tipoLibro = alquiler.codigoPrecioLibro();
        switch (tipoLibro) {
            case Libro.REGULARES:
                return new CalculadoraAlquilerRegular(alquiler, tipoLibro);
            case Libro.NUEVO_LANZAMIENTO:
                return new CalculadoraAlquilerNuevoLanzamiento(alquiler, tipoLibro);
            case Libro.INFANTILES:
                return new CalculadoraAlquilerInfantil(alquiler, tipoLibro);
            default:
                throw new RuntimeException("Tipo de libro desconocido.");
        }
    }
}
