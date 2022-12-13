package _02ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _06RecorrerListas {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>(Arrays.asList("a","e","i","o","u"));

		//HAY 3 FORMAS DE RECORRER un ArrayList
		
		//1.- Accediendo a los elementos por su posicion:
		// Con otros tipos de colecciones no se puede utilizar
		// Con otros tipos de listas es INEFICIENTE.
		for(int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println("----------");
		
		//2.- Utilizando un bucle for-each
		//"Con cada String s de la lista l, ejecutar el cuerpo del bucle"
		// Se puede usar con otras colecciones y con otras listas
		// No permite alterar la lista mientras se recorre (P. ej. eliminar)
		for(String s: l) {
			System.out.println(s);
		}
		System.out.println("----------");
		
		//3.- Utilizando un objeto Iterator
		// Se puede usawr con otras colecciones y con otras listas.
		// PERMITE modificar la lista mientras se recorre
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
	}

}
