package _02ejemplos;

import java.util.Scanner;

public class _01TipoBoolean {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Edad: ");
		int edad = tec.nextInt();
		
		if(edad == 18) {
			System.out.println("Te van a dar 400 euros");
		}
		
		boolean esMayor = edad >= 18;
		System.out.println("Mayor de edad: " + esMayor);
		
		
		
		//esto ...
		if(esMayor) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
		
		//Mejor que esto ...
		if(esMayor == true) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}
	}
}
