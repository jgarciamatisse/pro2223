package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _06RecuperarseDeExcepcion {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double peso = 0, estatura = 0;
		
		boolean ok = false;
		while(!ok) {
			try {
				System.out.println("Introduce peso (kg): ");
				peso = tec.nextDouble();
				ok = true;
			} catch(InputMismatchException e) {
				System.out.println("Debes introducir un dato de tipo real");
				tec.nextLine();
			}
		}
		
		ok = false;
		while(!ok) {
			try {
				System.out.println("Introduce estura (m): ");
				estatura = tec.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Debes introducir un dato de tipo real");
				tec.nextLine();
			}
		}
		
		double imc = peso / Math.pow(estatura,2);
		System.out.format("IMC: %f", imc);
		
		
	}

}
