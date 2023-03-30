package _02ejemplos._07ordenacion;

public class Vehiculo implements Comparable<Vehiculo> {
	private String matricula;
	private String marca;
	private String modelo;
	private int cilindrada;
	
	public Vehiculo(String matricula, String marca, String modelo, int cilindrada) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
	}

	@Override 
	public boolean equals(Object o) {
		return this == o || o instanceof Vehiculo 
				&& this.matricula.equals(((Vehiculo)o).matricula);
	}
	
	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	@Override
	public String toString() {
		return matricula + " - " + marca + " - " + modelo + " - " + cilindrada;
	}
	
	public int compareTo(Vehiculo v) {
		String letras1 = this.matricula.substring(4);
		String letras2 = v.matricula.substring(4);
		if(letras1.compareTo(letras2) < 0) return -1;
		else if(letras1.compareTo(letras2) > 0) return 1;
		else return this.matricula.compareTo(v.matricula);
	}

}
