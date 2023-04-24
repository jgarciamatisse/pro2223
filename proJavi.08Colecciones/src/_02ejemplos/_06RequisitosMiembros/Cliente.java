package _02ejemplos._06RequisitosMiembros;

public class Cliente implements Comparable<Cliente>{
	private String dni;
	private String nombre;
	public Cliente(String dni, String nombre) {
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
		if(!(o instanceof Cliente)) return false;
		return this.dni.equals(((Cliente)o).dni);
	}
	@Override
	public int compareTo(Cliente c) {
		return this.dni.compareTo(c.dni);
	}
	
	
}






