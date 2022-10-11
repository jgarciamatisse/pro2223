package _02ejemplos;

import java.util.Scanner;

public class _16Contador {
	//Un contador es una variable entera que usamos
	//para contar cuantas veces hemos hecho algo
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Cuantas veces quieres que te salude?");
		int veces = tec.nextInt();
		
		int contador = 0; //Lleva la cuenta de las veces que hemos
						  //saludado
		while(contador < veces) {
			System.out.println("Hola");
			contador = contador + 1; 
		}
		
		
	}
}
