package _02ejemplos._07ordenacion;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenacion2PorCilindrada {
	//Vamos a ordenar una coleccion de vehiculos por cilindrada
	//Para ello, vamos a pasar al método sort un objeto de la clase
	//ComparadorPorCilindrada que se va a encargar de determinar si 
	//un vehiculo va antes o despues que otro atendiendo a su cilindrada
	public static void main(String[] args) {
		ArrayList<Vehiculo> lista = new ArrayList<>();
		lista.add(new Vehiculo("1256BCC","FORD","FIESTA",1200));
		lista.add(new Vehiculo("1256CCC","OPEL","CORSA",1250));
		lista.add(new Vehiculo("1256BBC","CITROEN","C4",1300));
		lista.add(new Vehiculo("0123BBC","CITROEN","C3",1100));
		lista.add(new Vehiculo("1244CCC","FORD","TWINGO",1400));
		
		Collections.sort(lista, new ComparadorPorCilindrada());
		
		
		for(Vehiculo v: lista) {
			System.out.println(v);
		}
		
		//Ordenar por cilindrada de mayor a menor
		
		Collections.sort(lista, new ComparadorPorCilindradaDesc());
		for(Vehiculo v: lista) {
			System.out.println(v);
		}
		
	}
	

}
