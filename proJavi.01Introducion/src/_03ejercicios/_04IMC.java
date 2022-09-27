package _03ejercicios;

import java.util.Scanner;

public class _04IMC {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Peso en kg: ");
		double peso = tec.nextDouble();

		System.out.println("Estatura en m: ");
		double est = tec.nextDouble();
		
		double imc = peso / (est * est);
		System.out.println("IMC: " + imc);

		//Al vuelo
		System.out.println("IMC: " + peso / Math.pow(est, 2));
	}
}
