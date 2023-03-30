package _02ejemplos._04genericidad;

public class JugadorBasket {
	private String nombre;
	private int dorsal;
	private double estatura;
	public JugadorBasket(String nombre, int dorsal, double estatura) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.estatura = estatura;
	}
	public String toString() {
		return nombre + " - " + dorsal + " - " + estatura;
	}

}
