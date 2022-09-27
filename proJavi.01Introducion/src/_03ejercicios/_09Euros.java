package _03ejercicios;

import java.util.Scanner;

public class _09Euros {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Euros: ");
		double e = tec.nextDouble();
		
		System.out.println("Pesetas: " + (e * 166.386));

		
	}
}
