package _02ejemplos;

import java.util.Scanner;

public class _12NotaPracticasIncorrecto {
	//La nota de practicas se calcula de la siguiente forma:
	// - Las practicas aprobadas suman 1 punto (si se han aprobado mas de 2)
	// - Las suspendidas suman 0.5 puntos (si hay menos de 5 sin suspender)
	// - Las no entregadas restan 0.5 puntos.
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Aprobadas");
		int aprobadas = tec.nextInt();
		
		System.out.println("Suspendidas");
		int suspendidas = tec.nextInt();
		
		System.out.println("No entregadas");
		int noentregadas = tec.nextInt();
		double nota = 0;
		if(aprobadas > 2) {
			if(suspendidas < 5) {
				nota = aprobadas * 1 + suspendidas * 0.5 - noentregadas * 0.5;
			} else {
				nota= aprobadas * 1 - noentregadas * 0.5;
			}
		} else {
			if(suspendidas < 5) {
				nota = suspendidas * 0.5 - noentregadas * 0.5;
			} else {
				nota= - noentregadas * 0.5;
			}
		}
		
		
		System.out.println("Nota: " + nota);
	}

}
