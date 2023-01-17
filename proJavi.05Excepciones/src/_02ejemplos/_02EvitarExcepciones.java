package _02ejemplos;

import java.util.Scanner;

public class _02EvitarExcepciones {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int[] a = {2, 1, 3, 8, 10};
		int[] b = {5, 1, 0, 2};
		
		System.out.println("Dividir un elemento de a entre un elemento de b");
		System.out.println("Que posicion de a quieres dividir ?");
		int posA = tec.nextInt(); //InputMismatch si no se introduce un entero
		
		System.out.println("Entre que posicion de b lo quieres dividir?");
		int posB = tec.nextInt(); //InputMismatch si no se introduce un entero
		
		if (posA < 0 || posB < 0 || posA >= a.length || posB >= b.length) {
			System.out.println("Posicion incorrecta");
		} else {
			int dividendo = a[posA]; 
			int divisor = b[posB];
			if(divisor == 0) {
				System.out.println("No se puede dividir por cero");
			} else {
				int cociente = dividendo / divisor; 
		
				System.out.printf("%d / %d = %d", dividendo, divisor, cociente);
			}
		}
	
		
	}

}
