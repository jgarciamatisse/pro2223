package _02ejemplos;

import java.util.Scanner;

public class _05OperadoresAritmeticos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Numero 1: ");
		int a = tec.nextInt();

		System.out.println("Numero 2: ");
		int b = tec.nextInt();
		
		System.out.println( a + " + " + b + " = " + (a + b));
		System.out.println( a + " - " + b + " = " + (a - b));
		System.out.println( a + " * " + b + " = " + (a * b));
		System.out.println( a + " / " + b + " = " + (a / b));
		System.out.println( a + " % " + b + " = " + (a % b));
		
		//Division real
		
		double divReal = a / b;
		System.out.println("Division real: " + divReal);
		
		System.out.println("Division real: " + (5  / 2.0));

	}
}
