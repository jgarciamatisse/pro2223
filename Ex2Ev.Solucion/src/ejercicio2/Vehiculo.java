package ejercicio2;

public class Vehiculo {
	private String matricula;
	private int litrosCombustible;
	private final static int CAPACIDAD = 50; 
	
	public Vehiculo(String matricula, int litrosCombustible) {
		this.matricula = matricula;
		this.litrosCombustible = litrosCombustible;
	}

	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Vehiculo)) return false;
		return this.matricula.equals(((Vehiculo)o).matricula);
	}
	//Añade al vehiculo la cantidad de combustible indicada, siempre que quepa.
	//Si no cabe la cantidad pone lo que quepa.
	//Devuelve la cantidad añadida.
	public int ponerCombustible(int cantidad) {
		int falta = CAPACIDAD - litrosCombustible;
		int poner = Math.min(cantidad, falta);
		litrosCombustible += poner;
		return poner;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public boolean estaLleno() {
		return litrosCombustible == CAPACIDAD;
	}
	public String toString() {
		return matricula + " - " + String.format("%3d", litrosCombustible);
	}
}
