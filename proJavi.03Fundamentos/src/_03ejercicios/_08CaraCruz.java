package _03ejercicios;

public class _08CaraCruz {
	public static void main(String[] args) {
		int caras = 0, cruces = 0, monedas = 0;
		double porcCaras, porcCruz;
		do {
			double valor = Math.random();
			monedas ++;
			if(valor < 0.5) {
				caras++;
			} else {
				cruces++;
			}
			//Calcular porcentajes
			porcCaras = 100 * (double)caras / monedas;
			porcCruz = 100.0 * cruces / monedas;
			System.out.format("Caras : %d Porcentaje: %7.4f %n", caras, porcCaras);
			System.out.format("Cruces: %d Porcentaje: %7.4f %n", cruces, porcCruz);

			
//		} while(porcCaras > porcCruz && porcCaras - porcCruz >= 0.001 
//				|| porcCruz > porcCaras && porcCruz - porcCaras >= 0.001);
		
		} while (monedas < 1000000 || Math.abs(porcCaras - porcCruz) >= 0.001);
		
	}
}
