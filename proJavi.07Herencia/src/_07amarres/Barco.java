package _07amarres;

public class Barco {
	protected String matricula;
	protected double eslora;
	protected int anyo;
	
	public Barco (String matricula, double eslora, int anyo) {
		this.matricula = matricula;
		this.eslora = eslora;
		this.anyo = anyo;
	}
	
	public String toString() {
		return matricula + " " + eslora + " m. - " + anyo;
	}
	
	public double getFactorAlquiler() {
		return 2 * eslora;
	}
	
}
