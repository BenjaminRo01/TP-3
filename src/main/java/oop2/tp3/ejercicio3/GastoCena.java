package oop2.tp3.ejercicio3;

public class GastoCena implements Gasto {
    public static final int MONTO_EXCESO = 5000;
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
        return monto > MONTO_EXCESO;
    }
}
