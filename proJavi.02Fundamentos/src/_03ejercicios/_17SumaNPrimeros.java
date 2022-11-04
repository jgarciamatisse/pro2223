package _03ejercicios;

import java.util.Scanner;

public class _17SumaNPrimeros {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Numero: ");
		int n = tec.nextInt();
		
		int suma = 0;
		int numero = 1;
		while(numero <= n) {
			suma = suma + numero;
			//suma += numero;
			numero = numero + 1;
			//numero += 1;
			//numero ++;
		}
		System.out.println("Suma: " + suma);
	}
}
