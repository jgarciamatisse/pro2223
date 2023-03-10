package _02ejemplos._01alumnos;

public class Profesor extends Persona{
	private String departamento;
	
	
	public Profesor(String dni, String nombre,  String departamento) {
		super(dni, nombre);
		this.departamento= departamento;
	}
	
	@Override 
	public String toString() {
		return super.toString() + " - " + departamento;
		
	}
	
}
