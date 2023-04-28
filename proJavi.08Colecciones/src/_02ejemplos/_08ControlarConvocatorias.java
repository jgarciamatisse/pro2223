package _02ejemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _08ControlarConvocatorias {
	//Vamos a controlar que una serie de alumnos no pueden
	//usar más de 4 convocatorias
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		Map<String,Integer> conv = new HashMap<>();
		
		String a;
		do {
			System.out.println("Alumno: ");
			a = tec.nextLine();
			if(!a.isEmpty()) {
				//¿Cuantas convocatorias ha usado el alumno a?
				Integer usadas = conv.get(a);
				if(usadas == null) { //No ha usado ninguna
					conv.put(a, 1); //Esta es la primera
					System.out.println("Correcto");
				} else { //Ha usado alguna
					if(usadas == 4) { //Ya ha consumido las 4
						System.out.println("Incorrecto");
					} else { //Le añadimos una
						conv.put(a, usadas + 1);
						System.out.println("Correcto");
					}
				}
				System.out.println(conv);
			}
		} while(!a.isEmpty());
	}
}
