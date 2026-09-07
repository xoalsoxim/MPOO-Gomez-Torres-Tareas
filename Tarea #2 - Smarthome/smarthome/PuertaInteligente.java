package smarthome;

public class PuertaInteligente {

    private String ubicacion;
    private boolean abierta;
    private boolean bloqueada;

    public PuertaInteligente(String ubicacion, boolean abierta, boolean bloqueada) {
        this.ubicacion = ubicacion;
        this.abierta = abierta;
        this.bloqueada = bloqueada;
    }

    public void abrir() {
        if (!bloqueada) {
            abierta = true;
        }
    }

    public void cerrar() {
        abierta = false;
    }

    public void bloquear() {
        if (!abierta) {
            bloqueada = true;
        }
    }

    public void desbloquear() {
        bloqueada = false;
    }

    public double calcularTiempoApertura() {
        return abierta ? 5.0 : 0.0;
    }

    public void verEstadoActual() {
        System.out.println("Puerta inteligente | Ubicación=[" + ubicacion
                + "] | Estado=[" + (abierta ? "ABIERTA" : "CERRADA")
                + "] | Bloqueada=[" + (bloqueada ? "SÍ" : "NO") + "]");
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public boolean isBloqueada() {
        return bloqueada;
    }
}