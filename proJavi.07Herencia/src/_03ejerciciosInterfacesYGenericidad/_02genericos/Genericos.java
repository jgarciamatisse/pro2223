package _03ejerciciosInterfacesYGenericidad._02genericos;

import java.util.Scanner;

public class Genericos {
	public static void main(String[] args) {
		String[] v1 = {"A","B","C","A","A"};
		System.out.println(numVeces(v1,"A"));
		Integer[] v2 = {1,2,3,1,1,1};
		System.out.println(numVeces(v2,1));
		
		System.out.println(minimo("casa","cosa"));
		
		//No puedo llamar a minimo con dos objetos que no implementen Comparable
		//System.out.println(minimo(new Scanner(System.in), new Scanner(System.in)));
		
	}

	public static <T extends Comparable<T>> T minimo (T o1, T o2) {
		if (o1.compareTo(o2) < 0) return o1;
		else return o2;
	}
	
	
	//Dado un array de enteros y un entero x, devuelve el numero
	//de apariciones de x en el array
	public static <T> int numVeces(T[] v, T x) {
		int cont = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i].equals(x)) cont++;
		}
		return cont;
	}
}
