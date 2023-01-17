package _02ejemplos;

import java.util.Scanner;

public class _01SituacionesInesperadas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int[] a = {2, 1, 3, 8, 10};
		int[] b = {5, 1, 0, 2};
		
		System.out.println("Dividir un elemento de a entre un elemento de b");
		System.out.println("Que posicion de a quieres dividir ?");
		int posA = tec.nextInt(); //InputMismatch si no se introduce un entero
		
		System.out.println("Entre que posicion de b lo quieres dividir?");
		int posB = tec.nextInt(); //InputMismatch si no se introduce un entero
		
	
		int dividendo = a[posA]; //ArrayIndexOutOfBounds si la posicion es incorrecta
		int divisor = b[posB]; //ArrayIndexOutOfBounds si la posicion es incorrecta
		int cociente = dividendo / divisor; //Arithmetic si el divisor es 0
		
		System.out.printf("%d / %d = %d", dividendo, divisor, cociente);
	
		
	}

}
