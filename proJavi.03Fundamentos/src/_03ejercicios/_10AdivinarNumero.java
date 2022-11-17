package _03ejercicios;

import java.util.Scanner;

public class _10AdivinarNumero {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int adivinar = 1 + (int)(Math.random() * 100);
		System.out.println(adivinar);
		
		int numero;
		do {
			System.out.println("Intenta adivinar: ");
			numero = tec.nextInt();
			if(numero < adivinar) System.out.println("Te has quedado corto");
			else if(numero > adivinar) System.out.println("Te has pasado");
			else System.out.println("Has acertado");
		} while (numero != adivinar);
	}
}
