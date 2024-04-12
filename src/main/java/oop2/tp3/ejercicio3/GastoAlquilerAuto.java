package oop2.tp3.ejercicio3;

public class GastoAlquilerAuto implements Gasto {
    private String nombre;
    private int monto;

    public GastoAlquilerAuto(int monto) {
        this.nombre = "Alquiler de Autos";
        this.monto = monto;
    }

    @Override
    public int sumarMontoComidas(int total) {
        return total;
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
        return " ";
    }
}
