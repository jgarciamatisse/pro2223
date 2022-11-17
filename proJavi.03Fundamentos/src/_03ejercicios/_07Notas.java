package _03ejercicios;

import java.util.Scanner;

public class _07Notas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int contNotas = 0;
		int contAprobados = 0;
		int sumaNotas = 0;
		int nota;
		do {
			System.out.println("Nota: ");
			nota = tec.nextInt();

			if (nota >= 0) {
				contNotas++;
				sumaNotas += nota;
				if (nota >= 5) {
					contAprobados++;
				}
			}

		} while (nota >= 0);
		System.out.println("Notas: " + contNotas);
		System.out.println("Aprobados " + contAprobados);
		System.out.println("Media: " + ((double)sumaNotas / contNotas ));
		

	}
}
