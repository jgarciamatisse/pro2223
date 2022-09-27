package _02ejemplos;

import java.util.Scanner;

public class _09Nota {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Nota: "); 
		int nota = tec.nextInt();
		
		if (nota > 5) {
			System.out.println("No esta mal");
		} else {
			if (nota > 7) {
				System.out.println("Bastante bien");
			} else {
				if (nota > 9) {
					System.out.println("Genial!!!");
				}
			}
		}
	}

}
