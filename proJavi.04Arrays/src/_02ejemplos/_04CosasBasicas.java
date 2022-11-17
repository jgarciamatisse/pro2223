package _02ejemplos;

import java.util.Arrays;

public class _04CosasBasicas {
	public static void main(String[] args) {
		//Declarar un array
		int[] nota;
		//Crear el array
		nota = new int[10];
		//El array contiene ceros
		System.out.println(nota[0]);
		System.out.println(nota[1]);
		
		//Si accedo a un componente que no existe ...
		//System.out.println(nota[10]);
		
		//Si imprimimos un array por pantalla
		System.out.println(nota);
		
		//Podemos imprimir con ayuda de la clase Arrays
		System.out.println(Arrays.toString(nota));

		//Inicializar arrays
		int[] a1 = {1,10,21};
		int[] a2 = {1,2,6,8,20,12};
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		
		//Los arrays pueden ser de cualquier tipo de elemento
		String[] equipo1 = {"Ana","Luis"};
		String[] equipo2 = {"Pablo", "Steven"};
		System.out.println(Arrays.toString(equipo1));
		System.out.println(Arrays.toString(equipo2));
		
		//Los arrays no se comparan con == o !=
		String[] equipo3 = {"Ana","Luis"};
		System.out.println("equipo1 == equipo3?: " + (equipo1 == equipo3));
		
		//A no ser que quiera comprobar si dos objetos son EL MISMO
		String[] equipo4 = equipo1;
		System.out.println("equipo1 == equipo4?: " + (equipo1 == equipo4));
		
		//Los arrays no se comparan equals
		System.out.println("equipo1.equals(equipo3)?: " + (equipo1.equals(equipo3)));
		
		//Los arrays se comparan con Arrays.equals
		System.out.println("Arrays.equals(equipo1,equipo3): " 
		+ Arrays.equals(equipo1, equipo3));
		
		
	}
}



