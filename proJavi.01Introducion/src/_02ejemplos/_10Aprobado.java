package _02ejemplos;

import java.util.Scanner;

public class _10Aprobado {
	public static void main(String[] args) {
		//Para aprobar hay que tener un 5 o más en teoría y 
		//mas de un 4 en las practicas.
		//Si se suspende la teoría, solo aprueban los que tienen
		//mas de un 9 en las prácticas.
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Teoria: ");
		int t = tec.nextInt();
		System.out.println("Practica: ");
		int p = tec.nextInt();
		
		if(t >= 5) {
			if(p > 4) {
				System.out.println("Aprobado");
			} else {
				System.out.println("Suspendido");
			}
		} else {
			if(p > 9) {
				System.out.println("Aprobado");
			} else {
				System.out.println("Suspendido");
			}
		}
		
	}
}
