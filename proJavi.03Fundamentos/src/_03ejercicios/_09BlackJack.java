package _03ejercicios;

import java.util.Scanner;

public class _09BlackJack {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int total = 0;
		String respuesta;
		do {
			System.out.println("Carta? (Si/No): ");
			respuesta = tec.next();
			if(respuesta.equalsIgnoreCase("si")) {
				int carta = 1 + (int) (Math.random() * 10);
				total += carta;
				System.out.println("Tu carta: " + carta + " .Total: " + total);
				
			}
		} while(respuesta.equalsIgnoreCase("si") && total < 20);
		
		if(total > 20) System.out.println("Te has pasado");
		else System.out.println("Te has plantado con " + total + " puntos");
	}
	
}
