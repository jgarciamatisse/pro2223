package ejercicio3;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Equipo {
	private String nombre;
	private ArrayList<Jugador> jugadores;
	private double presupuesto;
	
	public Equipo(String nombre, double presupuesto) {
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		jugadores = new ArrayList<>();
	}
	
	public boolean fichar(int dorsal, String nombre,int goles, double precio) {
		// Nos aseguramos de que no se supere el presupuesto
		double total = 0;
		for(Jugador j: jugadores) {
			total += j.getPrecio(); 
		}
		if(total + precio > presupuesto) {
			return false;
		} else {
			//Nos aseguramos de que el jugador no esté 
			Jugador j;
			do {
				j = new Jugador(dorsal, nombre, goles, precio);
				dorsal ++;
			} while(jugadores.contains(j));
			
			jugadores.add(j);
			return true;
		}
	}
	
	public Jugador maximoGoleador() {
		if (jugadores.size() == 0) 
			throw new NoSuchElementException("equipo vacío");
		
		Jugador maximo = jugadores.get(0);
		for(Jugador j: jugadores) {
			if(j.getGoles() > maximo.getGoles()) {
				maximo = j;
			}
		}
		return maximo;
	}
	public String toString() {
		String res = "Equipo: " + nombre + " Presupuesto: " + presupuesto;
		for(Jugador j: jugadores) {
			if(j.getPrecio() > presupuesto * 0.1) {
				res += "\n" + j.toString() + "(muy caro)";
			} else if(j.getPrecio() > presupuesto * 0.05) {
				res += "\n" + j.toString() + "(caro)";
			} else {
				res += "\n" + j.toString();
			}
		}
		return res;
	}
	
}
