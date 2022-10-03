package _02ejemplos;

import java.util.Scanner;

public class _06ValorAbsoluto {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce dos numeros que difieran como" + " mucho en 10 unidades");
		int a = tec.nextInt();
		int b = tec.nextInt();

		// Sin abs
		if (a > b) {
			if (a - b > 10) {
				System.out.println("mal");
			} else {
				System.out.println("bien");
			}
		} else {
			if (b > a) {
				if (b - a > 10) {
					System.out.println("mal");
				} else {
					System.out.println("bien");
				}
			} else {
				System.out.println("Bien");
			}
		}
		//Con abs
		if(Math.abs(a-b) > 10) {
			System.out.println("Mal");
		} else {
			System.out.println("Bien");
		}
	}
}
