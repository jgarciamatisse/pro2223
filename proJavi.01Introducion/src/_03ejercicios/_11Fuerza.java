package _03ejercicios;

import java.util.Scanner;
public class _11Fuerza {
	//CONSTANTE DE GRAVITACION UNIVERSAL
	final static double G = 6.693E-11;

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("m1: ");
		double m1 = tec.nextDouble();
		
		System.out.println("m2: ");
		double m2 = tec.nextDouble();
		
		System.out.println("d: ");
		double d = tec.nextDouble();
		
		double fuerza = (G * m1 * m2) / (d * d);
		
		System.out.println("Fuerza: " + fuerza);


		
	}
}
