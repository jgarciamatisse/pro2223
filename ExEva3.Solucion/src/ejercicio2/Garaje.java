package ejercicio2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Garaje {
	private Map<String,Integer> vehiculosDentro;
	
	public Garaje() {
		vehiculosDentro = new LinkedHashMap<>();
	}
	
	public void registrarMatricula(String matricula, int instante) {
		Integer momentoEntrada = vehiculosDentro.get(matricula);
		if(momentoEntrada == null) {
			System.out.println("--> Entrada del vehiculo " + matricula + " en el instante " + instante);
			vehiculosDentro.put(matricula, instante);
		} else {
			System.out.println("<-- Salida del vehiculo " + matricula + " en el isntante " + instante);
			System.out.println("Tiempo dentro: " + (instante - momentoEntrada));
			vehiculosDentro.remove(matricula);
		}
	}
	
	public void entraronAntesDe(int segundos) {
		System.out.println("---"
				+ " Vehiculos que entraron antes del instante " + segundos);
		for(String matricula: vehiculosDentro.keySet()) {
			Integer instante = vehiculosDentro.get(matricula);
			if(instante < segundos) {
				System.out.println("Matricula: " + matricula + " instante de entrada " + instante );
			}
		}
	}
}
