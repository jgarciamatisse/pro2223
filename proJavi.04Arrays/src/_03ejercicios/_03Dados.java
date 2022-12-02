package _03ejercicios;

public class _03Dados {
	final static int LANZAMIENTOS = 10000000;
	final static int MOSTRAR_CADA = 100000;

	public static void main(String[] args) {
		int[] cont = new int[7];
		for (int lanzamiento = 1; lanzamiento <= LANZAMIENTOS; lanzamiento++) {
			int dado = 1 + (int) (Math.random() * 6);

//			if(dado == 1) cont[1]++;
//			else if(dado == 2) cont[2]++;
//			else if(dado == 3) cont[3]++;
//			else if(dado == 4) cont[4]++;
//			else if(dado == 5) cont[5]++;
//			else cont[6]++;
			cont[dado]++;

			if (lanzamiento % MOSTRAR_CADA == 0) {
				// Mostrar porcentaje de veces que ha salido cada valor
				System.out.print(lanzamiento +  "--" );
				for (int i = 1; i < cont.length; i++) {
					System.out.format(" - %d: %6.2f ", i, 100.0 * cont[i] / lanzamiento);
				}
				System.out.println();

			}

		}

	}
}
