package _02ejemplos;

import java.util.Scanner;

public class _04OperadoresCortocircuitados {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Palabra: ");
		String palabra = tec.next();
		
		//Queremos comprobar si la palabra contiene una a en su posición 5
		//Si la palabra es demasiado corta no da error
		if(palabra.length() > 5 && palabra.charAt(5) == 'a') {
			System.out.println("Tiene una a en la pos. 5");
		} else {
			System.out.println("No tiene una a en la pos. 5");
		}

		//Si la palabra es demasiado corta DA ERROR
		if(palabra.length() > 5 & palabra.charAt(5) == 'a') {
			System.out.println("Tiene una a en la pos. 5");
		} else {
			System.out.println("No tiene una a en la pos. 5");
		}

	}
}
