package _03ejercicios;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class _08Diccionario {
	public static void main(String[] args) {
		Map<String, Set<String>> diccionario = new TreeMap<>();
		System.out.println(anyadirTraduccion(diccionario, "casa", "home"));
		System.out.println(diccionario);
		System.out.println(anyadirTraduccion(diccionario, "casa", "home"));
		System.out.println(diccionario);
		System.out.println(anyadirTraduccion(diccionario, "casa", "house"));
		System.out.println(diccionario);
		System.out.println(anyadirTraduccion(diccionario, "fuego", "fire"));
		System.out.println(diccionario);
		System.out.println(anyadirTraduccion(diccionario, "puerta", "door"));
		System.out.println(diccionario);
		
		
	}
	public static boolean anyadirTraduccion(Map<String, Set<String>> d, String cast, String ing) {
		if(d.containsKey(cast)) {
			Set<String> traducciones = d.get(cast); // Obtenemos las traducciones
			if(traducciones.contains(ing)) {
				return false;
			} else {
				traducciones.add(ing);
				return true;
			}
		} else {
			Set<String> traducciones = new TreeSet<>();
			traducciones.add(ing);
			d.put(cast, traducciones);
			return true;
		}
	}
	public static boolean anyadirTraduccion2(Map<String, Set<String>> d, String cast, String ing) {
		Set<String> traducciones = d.get(cast);
		if(traducciones == null) {
			traducciones = new TreeSet<>();
			traducciones.add(ing);
			d.put(cast, traducciones);
			return true;
		} else {
			return traducciones.add(ing);
		}
	}
	public static boolean quitarTraduccion (Map<String, Set<String>> d, String cast, String ing) {
		
	}
	
}
