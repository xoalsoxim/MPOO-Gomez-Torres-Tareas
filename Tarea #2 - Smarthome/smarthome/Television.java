package smarthome;

public class Television {

    private String marca;
    private boolean encendida;
    private int volumen;

    public Television(String marca, boolean encendida, int volumen) {
        this.marca = marca;
        this.encendida = encendida;
        this.volumen = volumen;
    }

    public void encender() {
        encendida = true;
    }

    public void apagar() {
        encendida = false;
    }

    public void cambiarVolumen(int volumen) {
        if (volumen >= 0 && volumen <= 100) {
            this.volumen = volumen;
        }
    }

    public double calcularConsumo() {
        return volumen * 0.02;
    }

    public void verEstadoActual() {
        System.out.println("Televisión | Marca=[" + marca + "] | Estado=["
                + (encendida ? "ENCENDIDA" : "APAGADA")
                + "] | Volumen=[" + volumen + "]");
    }

    public String getMarca() {
        return marca;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public int getVolumen() {
        return volumen;
    }
}