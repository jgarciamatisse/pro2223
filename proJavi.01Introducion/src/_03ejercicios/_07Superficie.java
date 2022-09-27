package _03ejercicios;

import java.util.Scanner;

public class _07Superficie {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Longitud: ");
		double l = tec.nextDouble();

		System.out.println("Anchura: ");
		double a = tec.nextDouble();
		
		
		System.out.println("superficie: " + (l * a) + " metros cuadrados");

		
	}
}
