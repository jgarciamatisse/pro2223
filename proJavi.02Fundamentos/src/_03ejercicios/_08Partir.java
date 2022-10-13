package _03ejercicios;

import java.util.Scanner;

public class _08Partir {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Frase: ");
		String frase = tec.nextLine();
		System.out.println("Posicion: ");
		int pos = tec.nextInt();
		
		//usando charAt
		if (frase.charAt(pos) == ' ') {
			System.out.println("Primera parte: " + frase.substring(0,pos));
			System.out.println("Segunda parte: " + frase.substring(pos + 1));
		} else {
			System.out.println("La frase no se puede partir");
		}
		
		//usando substring
		if (frase.substring(pos,pos + 1).equals(" ")) {
			System.out.println("Primera parte: " + frase.substring(0,pos));
			System.out.println("Segunda parte: " + frase.substring(pos + 1));
		} else {
			System.out.println("La frase no se puede partir");
		}
	}
		
}
