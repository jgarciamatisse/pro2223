package _03ejercicios;

import java.util.Scanner;
/**
 * Programa que muestra la longitud, area y volumen de una 
 * circunferencia. El radio lo introduce el usuario por teclado.
 * @author jgarcia
 */
public class _23Circulo {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Radio: ");
		double radio = tec.nextDouble();
		
		double l = longitudCircunferencia(radio);
		System.out.println("Longitud: " + l);
		
		double a = areaCirculo(radio);
		System.out.println("Area: " + a);
		
		System.out.println("Volumen: " + volumenEsfera(radio));
	}
	/**
	 * Calcula la longitud de una circunferencia
	 * @param radio el radio de la circunferencia.
	 * @return la longitud de una circunferencia del radio indicado
	 */
	public static double longitudCircunferencia(double radio) {
		double l = 2 * Math.PI * radio;
		return l;
	}
	public static double areaCirculo(double radio) {
		return Math.PI * radio * radio; 
	}
	
	public static double volumenEsfera(double radio) {
		return 4 / 3.0 * Math.PI * Math.pow(radio, 3);
	}

	

}
