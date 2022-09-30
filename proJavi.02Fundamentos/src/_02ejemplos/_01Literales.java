package _02ejemplos;

import java.util.Scanner;

public class _01Literales {
	public static void main(String[] args) {
		int a = 15;
		int b = 015;
		int c = 0x15;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int d = 2000000000; //2000000000 es un literal entero
		
		long e = 2000000000; //2000000000 es un literal entero (4bytes)
							 //aunque lo estoy guardando en una variable
							 // de tipo long (8bytes)
		
		//long f = 3000000000; //3000000000 no cabe en un int
		long f = 3000000000L; //Con la L le indicamos que es un entero largo (8 bytes)
		
		long g = 1L;
		//int h = 1L; //Da error porque no se puede guardar un dato de 8 bytes en una vble de 4 bytes
		
		
		//Literales reales
		double k = 1.5; //1.5 es un literal de 8 bytes
		float l = 1.5f; //1.5f es un literal de 4 bytes
		
		double m = 1.5f;
		
		//Leer un float de teclado
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce estatura: ");
		float estatura = tec.nextFloat();
		
	}

}





