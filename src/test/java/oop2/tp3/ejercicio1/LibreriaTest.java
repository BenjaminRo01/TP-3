package oop2.tp3.ejercicio1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class LibreriaTest {
    @Test
    public void testAlquilerLibroRegular() {
        //Inicialización
        int diasAlquilados = 5;
        LibroRegular elTunel = new LibroRegular("El Túnel");
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, diasAlquilados);
        Cliente cliente = new Cliente("Benjamin");

        //Ejercitación
        cliente.alquilar(alquilerElTunel);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();

        //Verificación
        Assert.assertEquals(resultado[0], 6.5); //total
        Assert.assertEquals(resultado[1], 1); //puntos por alquiler
    }

    @Test
    public void testAlquilerLibroNuevoLanzamiento() {
        int diasAlquilados = 1;
        LibroLanzamiento antesDelFin = new LibroLanzamiento("Antes del Fin");
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, diasAlquilados);
        Cliente cliente = new Cliente("Benjamin");

        cliente.alquilar(alquilerAntesDelFin);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();

        Assert.assertEquals(resultado[0], 3.0); //total
        Assert.assertEquals(resultado[1], 1); //puntos por alquiler
    }

    @Test
    public void testAlquilerLibroInfatil() {
        int diasAlquilados = 6;
        LibroInfantil pequeniosElefantes = new LibroInfantil("Pequeños Elefantes");
        CopiaLibro pequeniosElefantesCopia = new CopiaLibro(pequeniosElefantes);
        Alquiler alquilerPequeniosElefantes = new Alquiler(pequeniosElefantesCopia, diasAlquilados);
        Cliente cliente = new Cliente("Benjamin");

        cliente.alquilar(alquilerPequeniosElefantes);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();

        Assert.assertEquals(resultado[0], 6.0); //total
        Assert.assertEquals(resultado[1], 1); //puntos por alquiler
    }

    @Test
    public void testAlquilerLibros() {
        LibroLanzamiento antesDelFin = new LibroLanzamiento("Antes del Fin");
        CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);

        LibroInfantil pequeniosElefantes = new LibroInfantil("Pequeños Elefantes");
        CopiaLibro pequeniosElefantesCopia = new CopiaLibro(pequeniosElefantes);

        LibroRegular elTunel = new LibroRegular("El Túnel");
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);

        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Alquiler alquilerPequeniosElefantes = new Alquiler(pequeniosElefantesCopia, 6);
        Cliente cliente = new Cliente("Benjamin");

        cliente.alquilar(alquilerAntesDelFin);
        cliente.alquilar(alquilerElTunel);
        cliente.alquilar(alquilerPequeniosElefantes);
        Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();

        Assert.assertEquals(resultado[0], 21.5); //total
        Assert.assertEquals(resultado[1], 4); //puntos por alquiler
    }
}
