package ejercicio5;

public class Alumno {
	private String nombre;
	private String grupo;
	int edad;
	public Alumno (String nombre, String grupo, int edad) {
		this.nombre = nombre;
		this.grupo = grupo;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public String getGrupo() {
		return grupo;
	}
	public int getEdad() {
		return edad;
	}
	
}
