package _02ejemplos;

import java.util.LinkedHashMap;
import java.util.Map;

public class _06Maps {
	public static void main(String[] args) {
		Map<String,String> traducciones = new LinkedHashMap<>();
		
		//put: 
		// Si la clave no existe, inserta la pareja y devuelve null
		// Si la clave existe, sobreescribe el valor y devuelve el valor que había antes
		
		//Insertar la pareja y devuelve null
		System.out.println(traducciones.put("casa","home"));
		System.out.println(traducciones);
		System.out.println(traducciones.put("fuego","fire"));
		System.out.println(traducciones);
		traducciones.put("silla", "chair");
		traducciones.put("ordenador", "computer");
		
		

		//Sustituye home por house y devuelve home
		System.out.println(traducciones.put("casa", "house"));
		System.out.println(traducciones);
		
		//get: Devuelve el valor asociado a una clave o null si la clave no está
		System.out.println("Significado de casa: " + traducciones.get("casa"));
		System.out.println("Significado de mesa: " + traducciones.get("mesa"));
		
		//remove: Elimina la pareja cuya clave se indica.
		// Si la clave existe, elimina la pareja y devuelve el valor con el que estaba
		System.out.println("Eliminamos fuego: " + traducciones.remove("fuego"));
		System.out.println("Eliminamos mesa: " + traducciones.remove("mesa"));
		System.out.println(traducciones);
		
		//containsKey: Devuelve si una clave está o no
		System.out.println("Tenemos traduccion de casa: " + traducciones.containsKey("casa"));
		System.out.println("Tenemos traduccion de fuego: " + traducciones.containsKey("fuego"));
		
		//containsValue: Devuelve si un valor está o no
		System.out.println("Algo se traduce como house: " + traducciones.containsValue("house"));
		System.out.println("Algo se traduce como home: " + traducciones.containsValue("home"));
		
		System.out.println("Claves: " + traducciones.keySet());
		System.out.println("Valores: " + traducciones.values());
		
	}
}




