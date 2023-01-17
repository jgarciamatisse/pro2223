package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04CapturarExcepcion {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int[] a = { 2, 1, 3, 8, 10 };
		int[] b = { 5, 1, 0, 2 };

		//En este ejemplo solo estamos capturando InputMismatchException
		//Si se produce otro tipo de excepcion, el programa se interrumpirá
		try {
			System.out.println("Dividir un elemento de a entre un elemento de b");
			System.out.println("Que posicion de a quieres dividir ?");
			int posA = tec.nextInt(); // InputMismatch si no se introduce un entero

			System.out.println("Entre que posicion de b lo quieres dividir?");
			int posB = tec.nextInt(); // InputMismatch si no se introduce un entero

			int dividendo = a[posA];
			int divisor = b[posB];

			int cociente = dividendo / divisor;

			System.out.printf("%d / %d = %d", dividendo, divisor, cociente);

		} catch (InputMismatchException e) {
			System.out.println("Tienes que introducir un entero");
		}
		System.out.println("Fin del programa");
	}

}
