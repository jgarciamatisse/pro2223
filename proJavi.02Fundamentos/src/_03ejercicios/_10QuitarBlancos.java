package _03ejercicios;

import java.util.Scanner;

public class _10QuitarBlancos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Frase: ");
		String frase = tec.nextLine();
		
		int posBlanco = frase.indexOf(' ');
		String izq = frase.substring(0,posBlanco);
		String der = frase.substring(posBlanco + 1);
		der = der.trim();
		
		System.out.println(izq + " " + der);

		
	}
		
}
