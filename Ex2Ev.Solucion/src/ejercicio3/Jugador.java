package ejercicio3;

public class Jugador {
	private int dorsal;
	private String nombre;
	private int goles;
	private double precio;
	
	public Jugador(int dorsal, String nombre, int goles, double precio) {
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.goles = goles;
		this.precio = precio;
	}

	public int getDorsal() {
		return dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public int getGoles() {
		return goles;
	}

	public double getPrecio() {
		return precio;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		else if(! (o instanceof Jugador)) return false;
		return this.dorsal == ((Jugador)o).dorsal;
	}
	public String toString() {
		return dorsal + " - " + nombre + " - " + goles + " - " + precio;
	}
	
	//Completar 
	public int compareTo(Jugador j) {
		if(this.precio < j.precio) {
			return 1;
		} else if(this.precio > j.precio) {
			return -1;
		} else return this.nombre.compareTo(j.nombre);
	}

}
