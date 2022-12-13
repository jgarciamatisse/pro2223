package _02ejemplos;

import java.util.ArrayList;
import java.util.Arrays;

public class _03InicializarArrayList {
	public static void main(String[] args) {
		//Los arrays se podian definir enumerando sus elementos
		int[] numeros = {1,10,12,14};
		
		//Crear una lista vacia y anyadir elementos
		ArrayList<Integer> pares1 = new ArrayList<>();
		pares1.add(2);
		pares1.add(4);
		pares1.add(6);
		System.out.println("Pares 1: " + pares1);
		
		//Crear una lista que tome los elementos que hay en otra.
		ArrayList<Integer> pares2 = new ArrayList<> (pares1);
		System.out.println("Pares 2: " + pares2);
		
		
		//Si quiero crear un array list con un contenido determinado:
		ArrayList<Integer> impares = new ArrayList<>(Arrays.asList(1,3,5));
		
		//Crear un ArrayList a partir del contenido de un array
		
		Integer[] primos = {1,2,3,5,7,9,11,13,17};
		ArrayList <Integer> listaPrimos = new ArrayList<>(Arrays.asList(primos));
 		
	}
}
