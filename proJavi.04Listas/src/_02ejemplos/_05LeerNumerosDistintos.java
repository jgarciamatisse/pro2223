package _02ejemplos;

import java.util.ArrayList;
import java.util.Scanner;

public class _05LeerNumerosDistintos {
	//Programa que lea 5 numeros enteros distintos entre si
	//Si el usuario introduce un numero ya introducido previamente,
	//no se tiene en cuenta.
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		//Con arrays
		int[] numeros = new int[5];
		int cont = 0;
		while(cont < 5) {
			System.out.println("Introduce numero " + (cont + 1) +": ");
			int n = tec.nextInt();
			//Comprobar si es un duplicado
			boolean dup = false;
			for (int i = 0; i < cont && !dup; i++) {
				if (numeros[i] == n) {
					dup = true;
				}
			}
			//Si no es un duplicado, lo almacenamos en el array y lo contamos
			if(!dup) {
				numeros[cont] = n;
				cont ++;
			}
		}
		
		//Con un ArrayList
		ArrayList<Integer> lista = new ArrayList<>();
		while(lista.size() < 5) {
			System.out.println("Introduce numero: ");
			int n = tec.nextInt();
			if(!lista.contains(n)) {
				lista.add(n);
			}
		}
		
	}

}
