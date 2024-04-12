package oop2.tp3.ejercicio3;

interface Gasto {
    int sumarMontoComidas(int total);

    int sumarMontoTotal(int total);

    String obtenerNombre();

    int obtenerMonto();

    String excesoDeGastoComida();
}