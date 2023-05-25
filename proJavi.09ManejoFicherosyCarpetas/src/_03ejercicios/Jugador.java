package _03ejercicios;

public class Jugador implements Comparable<Jugador> {
	private int dorsal;
	private String nombre;
	private double estatura;
	public Jugador(int dorsal, String nombre, double estatura) {
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.estatura = estatura;
	}
	@Override
	public int compareTo(Jugador j) {
		if(this.dorsal < j.dorsal) return -1;
		else if(this.dorsal > j.dorsal) return 1;
		else return 0;
	}
	@Override 
	public String toString() {
		return dorsal + "\n" + nombre + "\n" + estatura;
	}
}
