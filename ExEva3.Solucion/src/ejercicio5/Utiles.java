package ejercicio5;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Utiles {
	public static <T> Map<String, Integer> mapear (Collection<T> c, Selector<T> s) {
		Map<String, Integer> res = new TreeMap<>();
		for(T elemento: c) {
			String texto = s.seleccionar(elemento);
			Integer veces = res.get(texto);
			if(veces == null) {
				res.put(texto, 1);
			} else {
				res.put(texto,  veces+1);
			}
		}
		return res;
	}
}
