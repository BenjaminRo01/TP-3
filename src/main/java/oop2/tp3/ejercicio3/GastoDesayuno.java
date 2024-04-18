package oop2.tp3.ejercicio3;

public class GastoDesayuno implements Gasto {
    private String nombre;
    private int monto;

    public GastoDesayuno(int monto) {
        this.nombre = "Desayuno";
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
    public String excesoDeGastoComida() {
        return monto > 1000 ? "X" : " ";
    }
}
