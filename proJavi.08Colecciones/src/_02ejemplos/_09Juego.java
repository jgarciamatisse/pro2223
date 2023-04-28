package _02ejemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _09Juego {
	public static void main(String[] args) {
		//En un juego los jugadores tienen 5 puntos cada uno
		//Cada vez que un jugador pierde la partida se le resta un 
		//punto
		//El primero que llega a cero pierde el juego
		
		//Tenemos en un Map los puntos de cada jugador
		Map<String, Integer> puntos = new HashMap<>();
		puntos.put("luis", 5);
		puntos.put("ana", 5);
		puntos.put("pepe", 5);
		
		Scanner tec = new Scanner(System.in);
		boolean finJuego = false;
		while(!finJuego) {
			System.out.println("Quien pierde la partida: ");
			String nombre = tec.next();
			
			Integer disponibles = puntos.get(nombre);
			disponibles --;
			if(disponibles == 0) {
				System.out.println(nombre + " ha perdido la partida");
				finJuego = true;
			} else {
				puntos.put(nombre, disponibles);
			}
		}
		
		//¿Quien es el que mas puntos tiene?
		int maximo = 0;
		String ganador = null;
		
		for(String nombre: puntos.keySet()) {
			Integer disponibles = puntos.get(nombre);
			if(disponibles > maximo) {
				maximo = disponibles;
				ganador = nombre;
			}
		}
		System.out.println("Ganador: " + ganador + " con " + maximo + " puntos");
	}
}










