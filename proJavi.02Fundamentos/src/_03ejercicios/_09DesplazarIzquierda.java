package _03ejercicios;

import java.util.Scanner;

public class _09DesplazarIzquierda {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Palabra: ");
		String palabra = tec.next();
		
		char inicial = palabra.charAt(0);
		String restoPalabra = palabra.substring(1);
		String nuevaPalabra = restoPalabra + inicial;
		System.out.println(nuevaPalabra);
		
		//De otra forma: Al vuelo
		System.out.println(palabra.substring(1) + palabra.charAt(0));
	}
		
}
