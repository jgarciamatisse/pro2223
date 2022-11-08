package _02ejemplos;

import java.util.Scanner;

public class _08RecorrerString {
	public static void main(String[] args) {
		//Dado un String que introduce el usuario,
		//mostrar cada uno de sus caracteres en una línea
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Texto: ");
		String texto = tec.nextLine();
		
		for(int pos = 0; pos < texto.length(); pos++) {
			System.out.println(texto.charAt(pos));
		}
		
		int pos = 0;
		while(pos < texto.length()) {
			System.out.println(texto.charAt(pos));
			pos++;
		}
		
	}
}
