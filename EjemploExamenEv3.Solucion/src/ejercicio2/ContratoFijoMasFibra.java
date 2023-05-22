package ejercicio2;

public class ContratoFijoMasFibra extends ContratoFijo{
	private int velocidad;
	public ContratoFijoMasFibra(String titular, String lineaPrincipal, int precioMinuto, int permanencia, int velocidad) {
		super(titular, lineaPrincipal, precioMinuto, permanencia);
		this.velocidad = velocidad;
	}

	@Override
	public double calcularPrecio(int minutosHablados) {
		return 10 + super.calcularPrecio(minutosHablados); 
	}
	
	@Override
	public double calcularCancelacion() {
		return super.calcularCancelacion() * 2;
	}
}
