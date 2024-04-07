package oop2.tp3.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private List<Alquiler> alquileres = new ArrayList<Alquiler>();
    private String name;

    public Cliente(String nombre) {
        this.name = nombre;
    }

    public Object[] calcularDeudaYPuntosObtenidos() {
        Object[] resultado = new Object[2];
        double total = 0;
        int puntosAlquilerFrecuente = 0;
        for (Alquiler alquiler : alquileres) {
            CalculadoraAquiler calculadoraAquiler = getCalculadoraAquiler(alquiler);
            total += calculadoraAquiler.calcularMonto();
            puntosAlquilerFrecuente += calculadoraAquiler.calcularPuntos();
        }
        resultado[0] = total;
        resultado[1] = puntosAlquilerFrecuente;
        return resultado;
    }

    private static CalculadoraAquiler getCalculadoraAquiler(Alquiler alquiler) {
        int tipoLibro = alquiler.copia().libro().codigoPrecio();
        switch (alquiler.copia().libro().codigoPrecio()) {
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

    public void alquilar(Alquiler rental) {
        alquileres.add(rental);
    }
}