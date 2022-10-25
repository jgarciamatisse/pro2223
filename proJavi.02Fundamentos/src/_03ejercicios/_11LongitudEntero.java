package _03ejercicios;

import java.util.Scanner;

public class _11LongitudEntero {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Entero largo: ");
		long numero = tec.nextLong();
		
		String sNumero = String.valueOf(numero);
		System.out.println("Longitud: " + sNumero.length());
		
		//De otra forma
		String sNumero2 = "" + numero;
		System.out.println("Longitud: " + sNumero2.length());
	}

}


