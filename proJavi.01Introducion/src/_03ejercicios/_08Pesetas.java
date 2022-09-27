package _03ejercicios;

import java.util.Scanner;

public class _08Pesetas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Pesetas: ");
		double p = tec.nextDouble();
		
		System.out.println("Euros: " + (p / 166.386));

		
	}
}
