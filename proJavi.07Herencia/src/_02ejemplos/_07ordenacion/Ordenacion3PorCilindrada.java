package _02ejemplos._07ordenacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ordenacion3PorCilindrada {
	//Vamos a ordenar una coleccion de vehiculos por cilindrada
	//Para ello, vamos a pasar al método sort un objeto de la clase
	//PorCilindrada que se encuentra definida en el mismo fichero .java
	//A estas clases internas se les llama INNER CLASS
	public static void main(String[] args) {
		ArrayList<Vehiculo> lista = new ArrayList<>();
		lista.add(new Vehiculo("1256BCC","FORD","FIESTA",1200));
		lista.add(new Vehiculo("1256CCC","OPEL","CORSA",1250));
		lista.add(new Vehiculo("1256BBC","CITROEN","C4",1300));
		lista.add(new Vehiculo("0123BBC","CITROEN","C3",1100));
		lista.add(new Vehiculo("1244CCC","FORD","TWINGO",1400));
		
		Collections.sort(lista, new PorCilindrada());
		
		
		for(Vehiculo v: lista) {
			System.out.println(v);
		}
		
		//Ordenar por cilindrada de mayor a menor
		
		Collections.sort(lista, new PorCilindradaDesc());
		for(Vehiculo v: lista) {
			System.out.println(v);
		}
	}
}
//Inner class
class PorCilindrada implements Comparator<Vehiculo> {
	@Override
	public int compare(Vehiculo v1, Vehiculo v2) {
		if(v1.getCilindrada() < v2.getCilindrada()) return -1;
		else if(v1.getCilindrada() > v2.getCilindrada()) return 1;
		else return 0;
	}
}

class PorCilindradaDesc implements Comparator<Vehiculo> {
	@Override
	public int compare(Vehiculo v1, Vehiculo v2) {
		if(v1.getCilindrada() < v2.getCilindrada()) return 1;
		else if(v1.getCilindrada() > v2.getCilindrada()) return -1;
		else return 0;
	}
}










