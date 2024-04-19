package oop2.tp3.ejercicio3;

public class GastoAlquilerAuto implements Gasto {
    private String nombre;
    private int monto;

    public GastoAlquilerAuto(int monto) {
        this.nombre = "Alquiler de Autos";
        this.monto = monto;
    }

    @Override
    public int montoComidas() {
        return 0;
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
        return false;
    }
}
