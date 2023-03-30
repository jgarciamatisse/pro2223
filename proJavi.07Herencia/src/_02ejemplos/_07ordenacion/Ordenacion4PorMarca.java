package _02ejemplos._07ordenacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ordenacion4PorMarca {
	//Vamos a ordenar una coleccion de vehiculos por marca
	//Para ello, vamos a pasar al método sort un objeto de una clase que implementa
	// Comparator<Vehiculo> PERO que la clase misma se ha creado al vuelo.
	//Es lo que se llama una CLASE ANÓNIMA (por no tener nombre)
	//Es una clase de un solo uso.
	public static void main(String[] args) {
		ArrayList<Vehiculo> lista = new ArrayList<>();
		lista.add(new Vehiculo("1256BCC","FORD","FIESTA",1200));
		lista.add(new Vehiculo("1256CCC","OPEL","CORSA",1250));
		lista.add(new Vehiculo("1256BBC","CITROEN","C4",1300));
		lista.add(new Vehiculo("0123BBC","CITROEN","C3",1100));
		lista.add(new Vehiculo("1244CCC","FORD","TWINGO",1400));

		//Llamamos al metodo sort usando una clase ANONIMA que implementa Comparator<Vehiculo>
		Collections.sort(lista, new Comparator<Vehiculo>() {
			@Override
			public int compare(Vehiculo v1, Vehiculo v2) {
				return v1.getMarca().compareTo(v2.getMarca());
			}
			
		});
		for(Vehiculo v: lista) {
			System.out.println(v);
		}
		
	}
}









