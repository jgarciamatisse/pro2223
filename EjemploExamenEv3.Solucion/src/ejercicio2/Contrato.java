package ejercicio2;

public abstract class Contrato {
	protected String titular;
	protected String lineaPrincipal;
	protected int precioMinuto;
	protected int permanencia;
	public Contrato(String titular, String lineaPrincipal, int precioMinuto, int permanencia) {
		this.titular = titular;
		this.lineaPrincipal = lineaPrincipal;
		this.precioMinuto = precioMinuto;
		this.permanencia = permanencia;
	}
	public abstract double calcularPrecio(int minutosHablados);
	public double calcularCancelacion() {
		return 10 * permanencia;
	}
	
	public String toString() {
		return titular + " " + precioMinuto + " " + calcularCancelacion();
	}
	
}
