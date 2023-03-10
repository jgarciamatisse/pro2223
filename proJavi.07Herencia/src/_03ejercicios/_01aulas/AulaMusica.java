package _03ejercicios._01aulas;

public class AulaMusica extends Aula {
	private boolean piano;

	public AulaMusica(int codigo, double longitud, double anchura, boolean piano) {
		super(codigo, longitud, anchura);
		this.piano = piano;
	}

	public boolean isPiano() {
		return piano;
	}

	public void setPiano(boolean piano) {
		this.piano = piano;
	}

	@Override
	public double capacidad() {
		double c = super.capacidad();
		if (piano) {
			c = c - 2;
		}
		return c;
	}

	public double capacidad2() {

		if (piano) {
			return super.capacidad() - 2;
		} else {
			return super.capacidad();
		}
	}
	
	@Override
	public String toString() {
		if (piano) {
			return super.toString() + " - Con piano";
		} else {
			return super.toString() + " - Sin piano";
		}
	}
	//De otra forma
	public String toString2() {
		return super.toString() + (piano? "- Con piano" : " - Sin piano");
	}
}






