package _03ejercicios;

import java.util.Scanner;
public class _03Media {
	public static void main(String[] args) {
		
		Scanner tec =  new Scanner(System.in);
		System.out.println("Introduce primera edad: ");
		int e1 = tec.nextInt();

		System.out.println("Introduce segunda edad: ");
		int e2 = tec.nextInt();

		System.out.println("Introduce tercera edad: ");
		int e3 = tec.nextInt();
		
		//Guardando el resultado en una variable
		double media = (e1 + e2 + e3) / 3.0;
		System.out.println("Media: " + media);
		
		//Al vuelo
		
		System.out.println("La media de " + e1 + ", " 
		+ e2 + " y " + e3 + " es " + (e1+e2+e3)/3.0);
		
		System.out.format("La media de %d, %d y %d es %f",e1,e2,e3,(e1+e2+e3)/3.0);

	}
}





