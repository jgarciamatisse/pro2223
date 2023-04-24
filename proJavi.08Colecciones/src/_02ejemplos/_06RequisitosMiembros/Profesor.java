package _02ejemplos._06RequisitosMiembros;

public class Profesor {
	private String dni;
	private String nombre;
	public Profesor(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public String toString() {
		return dni + " " + nombre;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Profesor)) return false;
		return this.dni.equals(((Profesor)o).dni);
	}
}






