package ejercicio1;

public class Conductor {
	private String nombre;
	private int edad;
	
	public Conductor(String n, int e){
		nombre = n;
		edad = e;
	}
	public String toString(){
		return nombre + " - " + edad + " anyos ";
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
}
