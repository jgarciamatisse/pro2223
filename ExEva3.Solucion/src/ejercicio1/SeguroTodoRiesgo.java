package ejercicio1;

public class SeguroTodoRiesgo extends SeguroRobo {	
	private double franquicia;
	
	public SeguroTodoRiesgo(int anyo, String matricula,  Conductor conductor, int antiguedad, double franquicia) {
		super(anyo,matricula, true, conductor, antiguedad);
		this.franquicia = franquicia;
	}
	
	@Override
	public String toString() {
		return "DAÑOS PROPIOS INCLUIDOS\n" + super.toString();
	}
	@Override
	public double calcularPrecio() {
		return 700 - (franquicia * 0.25);
	}


}
