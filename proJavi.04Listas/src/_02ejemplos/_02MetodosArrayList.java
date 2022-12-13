package _02ejemplos;

import java.util.ArrayList;

public class _02MetodosArrayList {
	public static void main(String[] args) {
		ArrayList<String> dias = new ArrayList<>();
		System.out.println("Tamanyo inicial: " + dias.size());
		//Anyadir un elemento al final del array list
		dias.add("lunes");
		dias.add("martes");
		System.out.println(dias);
		dias.add("jueves");
		System.out.println(dias);
		
		//Insertar un elemento en determinada posicion
		dias.add(2,"miercoles");
		System.out.println(dias);
		
		//Sobreescribir el elemento que está en determinada posicion
		dias.set(0, "LUNES"); 
		System.out.println(dias);
		
		//Consultar el tamano del ArrayList
		System.out.println("Numero elementos: " + dias.size());
		
		//Consultar un elemento por su posicion
		System.out.println("Primer elemento: " + dias.get(0));
		System.out.println("Segundo elemento: " + dias.get(1));
		dias.set(1,dias.get(1).toUpperCase()); //Convertir a may. el elem. 1
		System.out.println(dias);
		
		//Eliminar
		dias.remove(3); //Por posicion
		dias.remove("LUNES"); //Por contenido
		System.out.println(dias);
		//Eliminar devuelve true si se ha podido eliminar
		if(dias.remove("agosto")) {
			System.out.println("Se ha eliminado agosto");
		} else {
			System.out.println("Agosto no estaba en la lista");
		}
		
		//Buscar elementos
		if(dias.contains("MARTES")) {
			System.out.println("MARTES está en la lista");
		} else {
			System.out.println("MARTES no está en la lista");
		}
		//Posicion de un elemento en la lista
		System.out.println("Posicion de MARTES: " + dias.indexOf("MARTES"));
		System.out.println("Posicion de SABADO: " + dias.indexOf("SABADO"));
	}
}
