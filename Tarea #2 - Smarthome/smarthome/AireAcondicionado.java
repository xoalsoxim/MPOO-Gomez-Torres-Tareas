package smarthome;

public class AireAcondicionado {

    private String marca;
    private boolean encendido;
    private double temperatura;

    public AireAcondicionado(String marca, boolean encendido, double temperatura) {
        this.marca = marca;
        this.encendido = encendido;
        this.temperatura = temperatura;
    }

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    public void ajustarTemperatura(double temperatura) {
        if (temperatura >= 16 && temperatura <= 30) {
            this.temperatura = temperatura;
        }
    }

    public double calcularConsumo() {
        return temperatura * 0.05;
    }

    public void verEstadoActual() {
        System.out.println("Aire acondicionado | Marca=[" + marca
                + "] | Estado=[" + (encendido ? "ENCENDIDO" : "APAGADO")
                + "] | Temperatura=[" + temperatura + "°C]");
    }

    public String getMarca() {
        return marca;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public double getTemperatura() {
        return temperatura;
    }
}