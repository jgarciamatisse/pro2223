package _02ejemplos;

import java.util.Scanner;

public class _17BucleSinContador {
	//Descomponer una frase (de tamaño indeterminado) en palabras
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Frase: ");
		String frase = tec.nextLine();
		
		int posBlanco = frase.indexOf(' ');
		while(posBlanco != -1) {
			System.out.println(frase.substring(0,posBlanco));
			frase = frase.substring(posBlanco + 1);
			posBlanco = frase.indexOf(' ');
		}
		//Ultima palabra
		System.out.println(frase);
		
		
	}
}
