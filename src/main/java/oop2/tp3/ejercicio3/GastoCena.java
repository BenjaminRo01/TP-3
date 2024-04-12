package oop2.tp3.ejercicio3;

public class GastoCena implements Gasto {
    private String nombre;
    private int monto;

    public GastoCena(int monto) {
        this.nombre = "Cena";
        this.monto = monto;
    }

    @Override
    public int sumarMontoComidas(int total) {
        return monto + total;
    }

    @Override
    public int sumarMontoTotal(int total) {
        return monto + total;
    }

    @Override
    public String obtenerNombre() {
        return this.nombre;
    }

    @Override
    public int obtenerMonto() {
        return this.monto;
    }

    @Override
    public String excesoDeGastoComida() {
        return monto > 5000 ? "X" : " ";
    }
}
