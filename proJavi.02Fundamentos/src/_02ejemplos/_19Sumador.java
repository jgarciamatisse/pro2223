package _02ejemplos;

import java.util.Scanner;

public class _19Sumador {
	//Calcular la nota media de un  
	//grupo de alumnos
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Cuantos alumnos hay?");
		int numAlumnos = tec.nextInt();
		
		//Pedir la nota de cada alumno
		int contador = 0;
		int suma = 0; //<< SUMADOR para ir acumulando los valores
		while(contador < numAlumnos) {
			System.out.format("Nota %2d: ", contador + 1);
			int nota = tec.nextInt();
			
			suma = suma + nota; //<<< Añadimos la nota al total
			
			contador = contador + 1;
		}
		System.out.println("Media: " + ((double)suma/numAlumnos));
		
		
	}
}
