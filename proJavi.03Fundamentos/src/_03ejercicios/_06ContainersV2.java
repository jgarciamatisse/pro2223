package _03ejercicios;

import java.util.Scanner;

public class _06ContainersV2 {
	final static int MAXCONTENEDORES = 40;
	final static int MAXTONELADAS = 700;
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int numContenedores = 0;
		int pesoTotal = 0;
		
		//Bucle 
		int peso;
		do {
			System.out.println("Indica peso del contenedor: ");
			peso = tec.nextInt();

			numContenedores ++;
			pesoTotal += peso;
			
		} while (numContenedores < MAXCONTENEDORES 
					&& pesoTotal < MAXTONELADAS);
		
		//Si hemos excedido el peso, quitamos el último contenedor
		if(pesoTotal > MAXTONELADAS) {
			numContenedores --;
			pesoTotal -= peso;
		}
		
		System.out.println("Num. Contenedores: " + numContenedores);
		System.out.println("Peso total: " + pesoTotal);
		
		
		
	}
}
