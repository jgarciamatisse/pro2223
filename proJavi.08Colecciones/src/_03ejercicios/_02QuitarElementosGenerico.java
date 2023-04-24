package _03ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class _02QuitarElementosGenerico {
	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<>(Arrays.asList("pepa","pepe","luis"));
		//Llamamos al metodo usando una clase anonima para el parámetro p
		quitarElementos(nombres, new Predicate<String>() {
			public boolean test(String elemento) {
				if(elemento.startsWith("pe")) return true;
				else return false;
			}
		});
		System.out.println(nombres);
		
		ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
		//Quitar los pares usando una expresión lambda para el parámetro p
		quitarElementos(numeros, (n)-> {return n % 2 == 0;});
		System.out.println(numeros);
		
	}
	
	public static <T> void quitarElementos(Collection<T> c, Predicate<T> p) {
		Iterator<T> it = c.iterator();
		while(it.hasNext()) {
			T elemento = it.next();
			if(p.test(elemento)) {
				it.remove();
			}
		}
	}
	

}
