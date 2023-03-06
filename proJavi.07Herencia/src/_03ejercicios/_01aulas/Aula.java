package _03ejercicios._01aulas;

public class Aula {
	private int codigo;
	private double longitud;
	private double anchura;
	
	public Aula(int codigo, double longitud, double anchura) {
		this.codigo = codigo;
		this.longitud = longitud;
		this.anchura = anchura;
		
	}
	
	public double superficie() {
		return longitud * anchura;
	}
	
	public double capacidad() {
		return superficie()  / 1.4;
	}
	
	@Override
	public String toString() {
		return String.format("%d - %5.2f m2 - %4.1f pers." , codigo, superficie(),capacidad());
	}

}
