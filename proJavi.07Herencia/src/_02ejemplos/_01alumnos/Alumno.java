package _02ejemplos._01alumnos;

public class Alumno extends Persona{
	private int nia;
	private String grupo;
	
	
	public Alumno(String dni, String nombre, int nia, String grupo) {
		super(dni, nombre);
		this.nia = nia;
		this.grupo = grupo;
	}
	
	@Override 
	public String toString() {
//		return dni + " - " + nombre + " - " + nia + " - " + grupo;
//		return getDni() + " - " + getNombre() + " - " + nia + " - " + grupo;
		//Reescritura parcial
		return super.toString() + " - " + nia + " - " + grupo;
		
	}
	
}
