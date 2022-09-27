package _02ejemplos;

import java.util.Scanner;

public class _11NotaPracticas {
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
			nota = nota + aprobadas * 1;
		}
		
		if(suspendidas < 5) {
			nota = nota + suspendidas * 0.5;
		}
		
		nota = nota - noentregadas * 0.5;
		
		System.out.println("Nota: " + nota);
	}

}
