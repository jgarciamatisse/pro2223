package _02ejemplos;

import java.util.Iterator;

public class _07Busqueda {
	public static void main(String[] args) {
		int[] notas = {8,9,7,9,2,4,6,7};
		
		//Ejemplo de RECORRIDO: ¿Cuantos han suspendido?
		int susp = 0;
		for (int i = 0; i < notas.length; i++) {
			if(notas[i] < 5) {
				susp ++;
			}
		}
		System.out.println("Han suspendido " + susp + " alumnos");
		
		//Ejemplo de búsqueda: ¿Hay algún sobresaliente?
		boolean encotradoSobre = false;
		for (int i = 0; i < notas.length && !encotradoSobre; i++) {
//		for (int i = 0; i < notas.length && encotradoSobre == false; i++) {
			if(notas[i] >= 9) {
				encotradoSobre = true;
			}
		}
		if(encotradoSobre) System.out.println("Hay algun sobres.");
		else System.out.println("No hay ningun sobres.");
		
		//Ejemplo de busqueda: Hay algun aprobado?
		int aprobados = 0;
		for (int i = 0; i < notas.length && aprobados == 0; i++) {
			if(notas[i] >= 5) {
				aprobados++;
			}
		}
		if(aprobados == 0) System.out.println("No hay aprobados");
		else System.out.println("Hay aprobados");
		
		//Ejemplo de busqueda ¿Todos han suspendido?
		aprobados = 0;
		for (int i = 0; i < notas.length && aprobados == 0; i++) {
			if(notas[i] >= 5) {
				aprobados++;
			}
		}
		if(aprobados == 0) System.out.println("Todos suspendidos");
		else System.out.println("No todos suspendidos");
	}
}
