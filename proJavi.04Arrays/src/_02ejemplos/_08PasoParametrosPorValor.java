package _02ejemplos;

import java.util.Scanner;

public class _08PasoParametrosPorValor {
	//Cuando el main llama a doblar, el paso de parametros es POR VALOR:
	//Los cambios que el metodo doblar hace en la variable numero
	//NO AFECTAN a la variable edad (que es con la que se ha hecho la llamada)
	
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		int edad = tec.nextInt();
		
		int doble = doblar(edad);
		System.out.println("El doble de " + edad + " es " + doble);
		
	}
	
	public static int doblar (int numero) {
		numero = numero * 2;
		return numero;
	}
}
