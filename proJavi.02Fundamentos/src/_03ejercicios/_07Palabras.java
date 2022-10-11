package _03ejercicios;

import java.util.Scanner;

public class _07Palabras {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Frase: ");
		String frase = tec.nextLine();
		
		int blanco1 = frase.indexOf(' ');
		System.out.println("Palabra 1: " + frase.substring(0,blanco1));
		
		int blanco2 = frase.indexOf(' ', blanco1 + 1);
		System.out.println("Palabra 2: " + frase.substring(blanco1 + 1, blanco2));
		
		int blanco3 = frase.indexOf(' ', blanco2 + 1);
		System.out.println("Palabra 3: " + frase.substring(blanco2 + 1, blanco3));
	}

}


