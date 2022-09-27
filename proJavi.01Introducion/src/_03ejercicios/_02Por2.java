package _03ejercicios;

import java.util.Scanner;

public class _02Por2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		int numero = tec.nextInt();
		
		//Solución "al vuelo"
		System.out.println("El DOBLE de " + numero + " es " + (numero * 2));
		
		//Solucion usando una variable
		int doble = numero * 2;
		System.out.println("El doble de " + numero + " es " + doble);
		
		
		
	}
}
