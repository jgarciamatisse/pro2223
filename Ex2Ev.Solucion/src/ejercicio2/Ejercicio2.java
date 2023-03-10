package ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		ArrayList<Vehiculo> colaGasolinera = new ArrayList<>(Arrays.asList(
				new Vehiculo("1111BBB", 32),
				new Vehiculo("2222CCC", 12),
				new Vehiculo("3333DDD", 40),
				new Vehiculo("4444FFF", 37)
				));
		int existencias = 50;

		System.out.println("---- Situacion inicial ----");
		System.out.println(colaGasolinera);
		System.out.println(existencias);
		System.out.println("-----------------------------------");
		
		while (existencias > 0 && colaGasolinera.size() > 0) {
			Vehiculo v = colaGasolinera.get(0);
			int puesta;
			if(existencias > 20) {
				puesta = v.ponerCombustible(20);
			} else {
				puesta = v.ponerCombustible(existencias);
			}
			System.out.println("Se ponen " + puesta + " litros a " + v.getMatricula());
			
			//Decrementamos las existencias
			existencias -= puesta;

			//Quitamos el vehiculo del principio de la cola
			colaGasolinera.remove(0);
			
			//Lo añadimos al final si aún no está lleno
			if(!v.estaLleno()) {
				colaGasolinera.add(v);
			}
			
			//Mostramos la cola y las existencias
			System.out.println("Cola: " + colaGasolinera);
			System.out.println("Existencias: " + existencias);
			System.out.println();
		}
		System.out.println("-----------------------------------");
		if(existencias > 0) {
			System.out.println("Todos los vehiculos han sido atendidos");
		} else {
			System.out.println("Se han terminado las existencias de la gasolinera");
		}
		
}}
