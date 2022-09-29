package _03ejercicios;

import java.util.Scanner;

public class _16Nota {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Nota: ");
		double nota = tec.nextDouble();
		
		if(nota < 5) {
			System.out.println("Insuficiente");
		} else if(nota < 6) {
			System.out.println("Suficiente");
		} else if(nota < 7) {
			System.out.println("Bien");
		} else if(nota < 9) {
			System.out.println("Notable");
		} else {
			System.out.println("Sobresaliente");
		}
		
		if(nota >= 9) {
			System.out.println("Sobresaliente");
		} else if (nota >= 7) {
			System.out.println("Notable");
		}else if (nota >= 6) {
			System.out.println("Bien");
		}else if (nota >= 5) {
			System.out.println("Suficiente");
		} else {
			System.out.println("Insuficiente");
		}

	}

}
