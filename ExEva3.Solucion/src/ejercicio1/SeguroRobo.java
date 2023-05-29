package ejercicio1;

public class SeguroRobo extends Seguro {
	private int antiguedad;

	public SeguroRobo(int anyo, String matricula, boolean incendio, Conductor conductor, int antiguedad) {
		super(anyo, matricula, incendio, true, conductor);
		this.antiguedad = antiguedad;
	}
	
	public String toString() {
		return "ROBO INCLUIDO\n" + 
				super.toString() + "\n" + 
				"Antig�edad del vehiculo: " + antiguedad;
	}
	@Override
	public double calcularPrecio() {
		if(antiguedad > 5) return super.calcularPrecio() * 1.1;
		else return super.calcularPrecio() * 1.2;
	}

}
