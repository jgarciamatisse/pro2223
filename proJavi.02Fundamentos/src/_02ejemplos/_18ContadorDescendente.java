package _02ejemplos;

import java.util.Scanner;

public class _18ContadorDescendente {
	//Un contador es una variable entera que usamos
	//para contar cuantas veces hemos hecho algo
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Cuantas veces quieres que te salude?");
		int veces = tec.nextInt();
		
		while(veces > 0) {
			System.out.println("Hola");
			veces = veces - 1;
		}
	}
}
