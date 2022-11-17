package _02ejemplos;

import java.util.Scanner;

public class _02MayoresQueLaMedia {
	public static void main(String[] args) {
		//El usuario introduce 3 notas y mostramos
		//cuales estan por encima de la media
		Scanner tec = new Scanner(System.in);
		int cont = 0, suma = 0;
		while (cont < 300) {
			System.out.println("Nota " + (cont + 1) + ": ");
			int nota = tec.nextInt();
			suma += nota;
			cont++;
		}
		
		double media = suma / 3.0;
		System.out.println("Media: " + media);
		
		//Mostrar qué notas están por encima de la media
		//NO SE PUEDE porque no he guardado las notas
	}
}
