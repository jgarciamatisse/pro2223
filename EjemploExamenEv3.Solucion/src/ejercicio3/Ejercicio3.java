package ejercicio3;

public class Ejercicio3 {
	public static void main(String[] args) {
		Double[] pesos = { 95.0, 90.5, 77.0 };
		Double[] estaturas = { 1.75, 1.80, 1.60 };
		Double[] imcs = new Double[3];

		// Completar
		Utiles.combinarArrays(pesos, estaturas, imcs, (p, e) -> {
			return p / (e * e);
		});
//		Utiles.combinarArrays(pesos, estaturas, imcs, (p,e) -> p / (e * e));
		for (Double d : imcs) {
			System.out.format("%5.2f\n", d);
		}

		// Dados dos arrays de String, rellenar un tercer array
		// que contenga, en cada posición, el String más largo
		String[] nombres1 = { "Ana", "Raimundo", "Sol", "Almudena" };
		String[] nombres2 = { "Gabriela", "Luis", "Pedro", "Gonzalo" };
		String[] nombresLargos = new String[4];
		Utiles.combinarArrays(nombres1, nombres2, nombresLargos, new Operador<String>() {
			@Override
			public String operar(String o1, String o2) {
				if (o1.length() > o2.length())
					return o1;
				else
					return o2;
			}

		});
		Utiles.combinarArrays(nombres1, nombres2, nombresLargos, (x1,x2)-> {
			if (x1.length() > x2.length())
				return x1;
			else
				return x2;
		});

	}

}
