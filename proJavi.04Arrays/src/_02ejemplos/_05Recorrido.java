package _02ejemplos;

import java.util.Iterator;

public class _05Recorrido {
	public static void main(String[] args) {
		int[] notas = {6,8,1,3,5};
		
		//Mostrar por pantalla todas las notas
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + (i+1) + ": " + notas[i]);
		}
		
		//Calcular la nota media
		int suma = 0;
		for (int i = 0; i < notas.length; i++) {
			suma += notas[i];
		}
		double media = (double) suma / notas.length;
		System.out.println("Media: " + media);
		
		//Contar y mostrar el numero de aprobados
		int aprobados = 0;
		for (int i = 0; i < notas.length; i++) {
			if(notas[i] >= 5) {
				aprobados ++;
			}
		}
		System.out.println("Aprobados: " + aprobados);
		
		//Mostrar por pantalla la mitad de las notas
		System.out.println("---------------------");
		for (int i = 0; i < notas.length / 2; i++) {
			System.out.println("Nota " + (i+1) + ": " + notas[i]);
		}
		
		//Mostrar por pantalla uno si y uno no
		System.out.println("---------------------");
		for (int i = 0; i < notas.length; i += 2) {
			System.out.println("Nota " + (i+1) + ": " + notas[i]);
		}
		
		//Mostrar las notas de la ultima a la primera: Recorrido descendente
		System.out.println("---------------------");
		for(int i = notas.length - 1; i >= 0; i --) {
			System.out.println("Nota " + (i+1) + ": " + notas[i]);
		}
	}
}
