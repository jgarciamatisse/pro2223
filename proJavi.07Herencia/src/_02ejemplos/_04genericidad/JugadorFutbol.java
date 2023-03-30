package _02ejemplos._04genericidad;

public class JugadorFutbol {
	private String nombre;
	private int dorsal;
	private int goles;
	public JugadorFutbol(String nombre, int dorsal, int goles) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.goles = goles;
	}
	public String toString() {
		return nombre + " - " + dorsal + " - " + goles;
	}

}
