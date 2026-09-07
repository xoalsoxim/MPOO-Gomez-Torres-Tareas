package smarthome;

public class CasaInteligente {

    private Lampara lampara;
    private Television television;
    private AireAcondicionado aireAcondicionado;
    private Bocina bocina;
    private PuertaInteligente puerta;
    private ControlRemoto control;

    public CasaInteligente(Lampara lampara, Television television,
            AireAcondicionado aireAcondicionado, Bocina bocina,
            PuertaInteligente puerta, ControlRemoto control) {

        this.lampara = lampara;
        this.television = television;
        this.aireAcondicionado = aireAcondicionado;
        this.bocina = bocina;
        this.puerta = puerta;
        this.control = control;
    }

    public void mostrarEstado() {
        control.verEstadoActual();
    }

    public static void main(String[] args) {

        Lampara lampara = new Lampara("Sala", false, 50);

        Television television = new Television("Samsung", false, 20);

        AireAcondicionado aireAcondicionado =
                new AireAcondicionado("LG", false, 24);

        Bocina bocina = new Bocina("JBL", false, 25);

        PuertaInteligente puerta =
                new PuertaInteligente("Entrada", false, true);

        ControlRemoto control = new ControlRemoto();

        control.registrarLampara(lampara);
        control.registrarTelevision(television);
        control.registrarAireAcondicionado(aireAcondicionado);
        control.registrarBocina(bocina);
        control.registrarPuerta(puerta);

        CasaInteligente casa = new CasaInteligente(
                lampara,
                television,
                aireAcondicionado,
                bocina,
                puerta,
                control
        );

        System.out.println("===== ESTADO INICIAL =====");
        casa.mostrarEstado();

        System.out.println("\n===== PRUEBA INDIVIDUAL =====");
        lampara.encender();
        lampara.cambiarIntensidad(90);
        lampara.verEstadoActual();

        control.modoBienvenida();
        casa.mostrarEstado();

        control.modoNoche();
        casa.mostrarEstado();

        control.modoAhorro();
        casa.mostrarEstado();
    }
}