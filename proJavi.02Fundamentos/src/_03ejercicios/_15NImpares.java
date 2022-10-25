package _03ejercicios;

import java.util.Scanner;

public class _15NImpares {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Numero: ");
		int n = tec.nextInt();
		
		int contador = 0;
		int impar = 1;
		while(contador < n) {
			System.out.println(impar);
			impar = impar + 2;
			
			contador = contador + 1;
		}
			
		
		
	}

}


