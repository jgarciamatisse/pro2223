package _02ejemplos;

import java.util.Scanner;

public class _03MayoresQueLaMedia {
	public static void main(String[] args) {
		//El usuario introduce 3 notas y mostramos
		//cuales estan por encima de la media
		Scanner tec = new Scanner(System.in);
		int cont = 0, suma = 0;
		
		int[] nota = new int[10];
		
		while (cont < 10) {
			System.out.println("Nota " + (cont + 1) + ": ");
			nota[cont] = tec.nextInt();
			suma += nota[cont];
			cont++;
		}
		
		double media = suma / 10.0;
		System.out.println("Media: " + media);
		
		for (int i = 0; i < nota.length; i++) {
			if(nota[i] > media) System.out.println(nota[i] + " es mayor que la media");
		}
	}
}
