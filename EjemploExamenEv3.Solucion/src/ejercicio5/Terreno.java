package ejercicio5;

public class Terreno implements Valorable {
	private String refCatastral;
	private int hectareas;
	public Terreno (String refCatastral, int hectareas) {
		this.refCatastral = refCatastral;
		this.hectareas = hectareas;
	}
	public double valorar () {
		return 1000 * hectareas;
	}
}
