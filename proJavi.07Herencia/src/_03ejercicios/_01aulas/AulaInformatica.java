package _03ejercicios._01aulas;

public class AulaInformatica extends Aula {
	private int numOrdenadores;
	
	public AulaInformatica(int codigo, double longitud, double anchura, int numOrdenadores) {
		super(codigo, longitud, anchura);
		this.numOrdenadores = numOrdenadores;
	}
	//Supongamos que nos dijeran: "Todas las aulas de informatica tienen 10 x 20 metros"
//	public AulaInformatica(int codigo, int numOrdenadores) {
//		super(codigo, 10, 20);
//		this.numOrdenadores = numOrdenadores;
//	}
	
	public int getNumOrdenadores() {
		return numOrdenadores;
	}
	public void setNumOrdenadores(int numOrdenadores) {
		this.numOrdenadores = numOrdenadores;
	}
	
	@Override
	public double capacidad() {
		//Reescritura TOTAL
		return 2 * numOrdenadores;
	}
	
	@Override
	public String toString() {
		//Reescritura PARCIAL
		return super.toString() + " - " + numOrdenadores + " ordenadores";
	}
}









