package _02ejemplos._04genericidad;

import java.util.ArrayList;

public class Equipo <T> {
	private String nombre;
	private ArrayList<T> plantilla;
	
	public Equipo(String nombre) {
		this.nombre = nombre;
		this.plantilla = new ArrayList<>();
	}
	
	public void fichar(T j) {
		if(plantilla.contains(j)) {
			throw new IllegalArgumentException("Jugador ya existe");
		} else {
			this.plantilla.add(j);
		}
	}
	public String toString() {
		String res = nombre;
		for(T j: plantilla) {
			res += "\n" + j ;
		}
		return res;
	}
}
