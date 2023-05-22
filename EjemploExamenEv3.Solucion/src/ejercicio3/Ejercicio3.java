package ejercicio3;

public class Ejercicio3 {
	public static void main(String[] args) {
		Double[] pesos = {95.0, 90.5, 77.0};
		Double[] estaturas = {1.75, 1.80,1.60};
		Double[] imcs = new Double[3];

		//Completar 
		Utiles.combinarArrays(pesos, estaturas, imcs, (p,e) -> {
			return p / (e * e);
		});
		for(Double d: imcs) {
			System.out.format("%5.2f\n", d);
		}
		
	}

}
