package _03ejercicios;

import java.util.Scanner;

public class _21Serie {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Numero: ");
		int n = tec.nextInt();
		double suma = 0;
		int divisor = 1;
		while (divisor <= n) {
			suma = suma + 1.0 / divisor;
			divisor = divisor + 1;
		}
		
		System.out.println("Suma: " + suma);
	}
}
