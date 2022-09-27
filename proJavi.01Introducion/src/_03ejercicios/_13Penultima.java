package _03ejercicios;

import java.util.Scanner;

public class _13Penultima {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Numero: ");
		int num = tec.nextInt();

		System.out.println("Penultima cifra: " + ((num / 10) % 10));
		System.out.println("Penultima cifra: " + ((num % 100) / 10));
	}
}
