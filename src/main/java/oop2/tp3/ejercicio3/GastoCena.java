package oop2.tp3.ejercicio3;

public class GastoCena implements Gasto {
    private String nombre;
    private int monto;

    public GastoCena(int monto) {
        this.nombre = "Cena";
        this.monto = monto;
    }

    @Override
    public int montoComidas() {
        return monto;
    }

    @Override
    public int monto() {
        return monto;
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
    public boolean excesoDeGastoComida() {
        return monto > 5000;
    }
}
