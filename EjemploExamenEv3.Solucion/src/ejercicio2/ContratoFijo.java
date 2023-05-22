package ejercicio2;

public class ContratoFijo extends Contrato {

	public ContratoFijo(String titular, String lineaPrincipal, int precioMinuto, int permanencia) {
		super(titular, lineaPrincipal, precioMinuto, permanencia);
	}
	
	@Override
	public double calcularPrecio(int minutosHablados) {
		return 16 + (minutosHablados * precioMinuto / 100.0); 
	}
}
