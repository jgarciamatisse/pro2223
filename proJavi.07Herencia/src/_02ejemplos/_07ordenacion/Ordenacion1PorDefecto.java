package _02ejemplos._07ordenacion;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenacion1PorDefecto {
	//Vamos a ordenar una coleccion de vehiculos con la ordenación por defecto.
	//La ordenación por defecto es la que marca el método compareTo del objeto
	//que estamos ordenando (en este caso el compareTo de Vehiculo)
	//Es requisito que la clase Vehiculo implements Comparable<Vehiculo>
	public static void main(String[] args) {
		ArrayList<Vehiculo> lista = new ArrayList<>();
		lista.add(new Vehiculo("1256BCC","FORD","FIESTA",1200));
		lista.add(new Vehiculo("1256CCC","OPEL","CORSA",1250));
		lista.add(new Vehiculo("1256BBC","CITROEN","C4",1300));
		lista.add(new Vehiculo("0123BBC","CITROEN","C3",1100));
		lista.add(new Vehiculo("1244CCC","FORD","TWINGO",1400));
		
		Collections.sort(lista);
		for(Vehiculo v: lista) {
			System.out.println(v);
		}
	}
	

}
