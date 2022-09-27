package _02ejemplos;

import java.util.Scanner;

public class _03EntradaTeclado {
	public static void main(String args[]) {
		Scanner tec = new Scanner(System.in);

		// Tres variables para almacenar la información
		// del usuario
		String nombre;
		double estatura;

		System.out.println("Nombre: ");
		nombre = tec.next();
		System.out.println("Edad: ");
		int edad = tec.nextInt();
		System.out.println("Estatura: ");
		estatura = tec.nextDouble();
		
		System.out.println("Hola " + nombre);
		if(edad >= 18) {
			System.out.println("Eres mayor de edad");
		}

	}
}
