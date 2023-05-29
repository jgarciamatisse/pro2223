package ejercicio1;

public class Seguro {
	private int anyo;
	private String matricula;
	private boolean incendio;
	private boolean lunas;
	private Conductor conductor;

	public Seguro(int anyo, String matricula, boolean incendio, boolean lunas, Conductor conductor) {
		this.anyo = anyo;
		this.matricula = matricula;
		this.incendio = incendio;
		this.lunas = lunas;
		this.conductor = conductor;
	}

	public double calcularPrecio() {
		double res = 250;
		if (conductor.getEdad() < 25) {
			res += 100;;
		}

		if (incendio && lunas) {
			res += 40;
		} else if (incendio) {
			res += 20;
		} else if (lunas) {
			res += 30;
		}

		return res;
	}

	@Override
	public String toString() {
		String sIncendio = "Excluido";
		if (incendio) sIncendio = "Incluido";

		String sLunas = "Excluido";
		if (lunas) sLunas = "Incluido";

		return "Anyo: " + anyo + 
				"\nMatricula: " + matricula + 
				"\nIncendio: " + sIncendio + 
				"\nLunas: " + sLunas + 
				"\nPrecio: " + calcularPrecio() + " €";
	}
}
