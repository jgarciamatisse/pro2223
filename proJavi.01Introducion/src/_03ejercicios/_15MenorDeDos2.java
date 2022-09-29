package _03ejercicios;

import java.util.Scanner;

public class _15MenorDeDos2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Numero 1: ");
		int a = tec.nextInt();

		System.out.println("Numero 2: ");
		int b = tec.nextInt();
		
		if(a < b) {
			System.out.println(a);
		} else {
			if(b < a) {
				System.out.println(b);				
			} else {
				System.out.println("Iguales");
			}
		}
		
		if(a < b) {
			System.out.println(a);
		} else if (b < a) {
			System.out.println(a);
		} else {
			System.out.println("Iguales");
		}
		
		if(a < b) System.out.println(a);
		else if (a > b) System.out.println(b);
		else System.out.println("Iguales");
	}

}
