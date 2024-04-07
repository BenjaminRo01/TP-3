package oop2.refactoring.collecting.ejemplo2;

import java.util.ArrayList;

public class Circulo extends Figura {

    @Override
    public void dibujar() {
        System.out.println("Dibujando el Circulo...");
    }

    @Override
    public void soloCirculos(ArrayList<Figura> figuras) {
        figuras.add(this);
    }

}
