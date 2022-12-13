package _03ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class _02Palabras {
	//Programa en el que el usuario introduce una frase y le decimos
	//cuántas palabras distintas contiene y cuales son:
	//"Voy a la tienda de la esquina a comprar la loteria de navidad"
	//9 palabras distintas:
	// voy a la tienda de esquina comprar loteria navidad
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Frase: ");
		String frase = tec.nextLine();
		String[] palabras = frase.split(" ");
		System.out.println(Arrays.toString(palabras));
	}
	
}
