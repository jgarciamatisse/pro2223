package _02ejemplos;

public class _06MaximoDeUnArray {
	public static void main(String[] args) {
		int[] notas = {1, 8, 7, 4, 2, 9, 5, 1, 4 };
		
		int notaMaxima = notas[0]; //Suponemos que la nota mas grande es la 1a
		for (int i = 1; i < notas.length; i++) {
			if(notas[i] > notaMaxima) {
				notaMaxima = notas[i];
			}
		}
		
		//De otra forma:
		notaMaxima = -1; //Valor anormalmente bajo.
		for (int i = 0; i < notas.length; i++) {
			if(notas[i] > notaMaxima) {
				notaMaxima = notas[i];
			}
		}
	}
}
