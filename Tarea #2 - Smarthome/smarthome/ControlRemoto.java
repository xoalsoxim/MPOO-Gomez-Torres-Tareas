package smarthome;

public class ControlRemoto {

    private Lampara lampara;
    private Television television;
    private AireAcondicionado aireAcondicionado;
    private Bocina bocina;
    private PuertaInteligente puerta;

    public void registrarLampara(Lampara lampara) {
        this.lampara = lampara;
    }

    public void registrarTelevision(Television television) {
        this.television = television;
    }

    public void registrarAireAcondicionado(AireAcondicionado aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public void registrarBocina(Bocina bocina) {
        this.bocina = bocina;
    }

    public void registrarPuerta(PuertaInteligente puerta) {
        this.puerta = puerta;
    }

    public void modoBienvenida() {
        System.out.println("\n===== MODO BIENVENIDA =====");

        lampara.encender();
        lampara.cambiarIntensidad(80);

        television.encender();
        television.cambiarVolumen(30);

        aireAcondicionado.encender();
        aireAcondicionado.ajustarTemperatura(22);

        bocina.encender();
        bocina.cambiarVolumen(40);

        puerta.desbloquear();
        puerta.abrir();
    }

    public void modoNoche() {
        System.out.println("\n===== MODO NOCHE =====");

        lampara.cambiarIntensidad(20);

        television.apagar();

        aireAcondicionado.encender();
        aireAcondicionado.ajustarTemperatura(24);

        bocina.cambiarVolumen(15);

        puerta.cerrar();
        puerta.bloquear();
    }

    public void modoAhorro() {
        System.out.println("\n===== MODO AHORRO =====");

        lampara.apagar();
        television.apagar();

        aireAcondicionado.apagar();

        bocina.apagar();

        puerta.cerrar();
        puerta.bloquear();
    }

    public void verEstadoActual() {
        System.out.println("\n===== ESTADO ACTUAL =====");

        lampara.verEstadoActual();
        television.verEstadoActual();
        aireAcondicionado.verEstadoActual();
        bocina.verEstadoActual();
        puerta.verEstadoActual();
    }
}