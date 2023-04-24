package _03ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class _02QuitarElementos {
	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<>(Arrays.asList("pepa","pepe","luis"));
		quitarElementos(nombres,"pe");
		System.out.println(nombres);
		
	}

	public static void quitarElementos(Collection<String> c, String prefijo) {
		
		Iterator<String> it = c.iterator();
		while(it.hasNext()) {
			if(it.next().startsWith(prefijo)) {
				it.remove();
			}
		}
		
		//Lo siguiente no sirve porque no se puede modificar una colección
		//mientras se está recorriendo con for-each
//		for(String s: c) {
//			//if(s.indexOf(prefijo) == 0) {
//			if(s.startsWith(prefijo)) {
//				c.remove(s);
//			}
//		}
	}
}
