package _02ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

import javax.print.DocFlavor.STRING;

public class _02Colecciones {
	public static void main(String[] args) {
		//Crear una coleccion a partir de los elementos de un array
		String[] nombres = {"ana","luis","angel"};
		
		ArrayList<String> listaNombres = new ArrayList<>(Arrays.asList(nombres));
		TreeSet<String> conjuntoNombres = new TreeSet<>(Arrays.asList(nombres));
		
		
		//Crear un array con los elementos de una coleccion
		// Metodo toArray() si queremos guardar en un array de Object
		Object[] arrayObjetos = listaNombres.toArray();
		//String[] arrayStrings = listaNombres.toArray(); //No puedo guardar en un array de String
		
		//Si quiero guardar en un array de String, tengo que usar el otro método toArray( ....)
		String[] arrayStrings = listaNombres.toArray(new String[0]); 
		//le estamos pidiendo que devuelva un array de String 
		
		
		//Operaciones masivas 
		ArrayList<String> hombres = new ArrayList<>(Arrays.asList("pepe","luis","miguel"));
		ArrayList<String> mujeres = new ArrayList<>(Arrays.asList("ana","rosa","esther"));
		ArrayList<String> jovenes = new ArrayList<>(Arrays.asList("pepe","ana"));
		
		//¿Todos los jovenes son hombres?
		System.out.println("Todos jovenes son hombres? " + hombres.containsAll(jovenes));
		
		//Hombres y mujeres juntos
		ArrayList<String> todos = new ArrayList<>();
		todos.addAll(hombres);
		todos.addAll(mujeres);
		System.out.println("Todos: " + todos);
		
		//Hombres mayores
		ArrayList<String> hombresMayores = new ArrayList<>(hombres);
		hombresMayores.removeAll(jovenes);
		System.out.println("Hombres mayores: " + hombresMayores);
		
		//Hombres jovenes
		ArrayList<String> hombresJovenes = new ArrayList<>(hombres);
		hombresJovenes.retainAll(jovenes);
		System.out.println("Hombres jovenes: " + hombresJovenes);
		
		
	}
}






