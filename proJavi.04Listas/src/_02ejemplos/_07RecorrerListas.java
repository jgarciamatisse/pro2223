package _02ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _07RecorrerListas {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<> (Arrays.asList(1,2,3,4,5));
		
		//Recorrer la lista para mostrar cuanto suman en total los pares.
		
		//Con for
		int suma = 0;
		for(int i = 0; i < numeros.size(); i++) {
			int n = numeros.get(i);
			if(n % 2 == 0) suma += n;
		}
		System.out.println(suma);
		//Con for-each
		suma = 0;
		for(Integer n: numeros) {
			if(n % 2 == 0) {
				suma += n;
			}
		}
		System.out.println(suma);
		System.out.println(suma);

		//Con iterator
		suma = 0;
		Iterator<Integer> it = numeros.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			if(n % 2 == 0) {
				suma += n;
			}
		}
		System.out.println(suma);
		
	}
}
