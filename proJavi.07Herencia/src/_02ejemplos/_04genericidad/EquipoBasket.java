package _02ejemplos._04genericidad;

import java.util.ArrayList;

public class EquipoBasket {
	private String nombre;
	private ArrayList<JugadorBasket> plantilla;
	
	public EquipoBasket(String nombre) {
		this.nombre = nombre;
		this.plantilla = new ArrayList<>();
	}
	
	public void fichar(JugadorBasket j) {
		if(plantilla.contains(j)) {
			throw new IllegalArgumentException("Jugador ya existe");
		} else {
			this.plantilla.add(j);
		}
	}
	public String toString() {
		String res = nombre;
		for(JugadorBasket j: plantilla) {
			res += "\n" + j ;
		}
		return res;
	}
}
