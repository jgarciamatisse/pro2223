package _03ejercicios;

import java.util.Scanner;

public class _05LeerEntero {
	public static void main(String[] args) {
		int n = leerEnteroPositivo();
		System.out.println(n);
	}
	public static int leerEnteroPositivo() {
		Scanner tec = new Scanner(System.in);
		int entero;
		do {
			System.out.println("Introduce entero positivo: ");
			entero = tec.nextInt();
			if(entero <= 0) {
				System.out.println("ERROR. Tiene que ser positivo");
			}
		} while (entero <= 0);
		
		return entero;
	}
	
	public static int leerEnteroPositivo(Scanner tec) {
		//Scanner tec = new Scanner(System.in);
		int entero;
		do {
			System.out.println("Introduce entero positivo: ");
			entero = tec.nextInt();
		} while (entero <= 0);
		
		return entero;
	}
	public static int leerEnteroPositivo(Scanner tec, String msg) {
		//Scanner tec = new Scanner(System.in);
		int entero;
		do {
			System.out.println(msg);
			entero = tec.nextInt();
		} while (entero <= 0);
		
		return entero;
	}

}
