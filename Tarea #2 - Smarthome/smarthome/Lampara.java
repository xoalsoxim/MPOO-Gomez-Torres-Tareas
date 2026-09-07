package smarthome;

public class Lampara {

	
	private String nombre;
	private boolean encendida;
	private int intensidad;
	
	public Lampara(String nombre, boolean encendida, int intensidad) {
		this.nombre = nombre;
		this.encendida = encendida;
		this.intensidad = intensidad;	
	}
	
	public void encender() {
		encendida = true;
	}
	
	public void apagar() {
		encendida = false;
	}
		
	public void cambiarIntensidad(int intensidad) {
		if(intensidad >= 0 && intensidad <= 100) {
			this.intensidad = intensidad;
		}
	}
	
	public void verEstadoActual () {
		System.out.println("Lampara | Nombre [" + nombre + "] | Estado=[" + (encendida ? "ENCENDIDA" : "APAGADA")+ "] | Intensidad=[" + intensidad + "%]" );	
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean isEncendida() {
		return encendida;
	}
	
	public int getIntensidad() {
		return intensidad;
	}
	
}
