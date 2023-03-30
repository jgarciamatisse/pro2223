package _02ejemplos._07ordenacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ordenacion5Lambdas {
	//Vamos a ordenar una coleccion de vehiculos por distintos criteros.
	//Para ello se utilizan expresiones Lambda.
	//En las expresiones lambda se mantiene solamente el código mínimo necesario
	//que java no es capaz de deducir del contexto.
	
	public static void main(String[] args) {
		ArrayList<Vehiculo> lista = new ArrayList<>();
		lista.add(new Vehiculo("1256BCC","FORD","FIESTA",1200));
		lista.add(new Vehiculo("1256CCC","OPEL","CORSA",1250));
		lista.add(new Vehiculo("1256BBC","CITROEN","C4",1300));
		lista.add(new Vehiculo("0123BBC","CITROEN","C3",1100));
		lista.add(new Vehiculo("1244CCC","FORD","TWINGO",1400));

		//Llamamos al metodo sort usando una clase ANONIMA que implementa Comparator<Vehiculo>
//		Collections.sort(lista, new Comparator<Vehiculo>() {
//			@Override
//			public int compare(Vehiculo v1, Vehiculo v2) {
//				return v1.getMarca().compareTo(v2.getMarca());
//			}
//			
//		});
		
		//Ordenar por marca
		Collections.sort(lista,(v1,v2)-> {
			return v1.getMarca().compareTo(v2.getMarca());
		});
		
		for(Vehiculo v: lista) {
			System.out.println(v);
		}
		
		System.out.println("-------------------");
		
		//Ordenar por cilindrada
		Collections.sort(lista,(v1,v2)-> {return v1.getCilindrada() - v2.getCilindrada();});
		for(Vehiculo v: lista) {
			System.out.println(v);
		}
		
		//Ordenar por cilindrada descendentemente
		//Las llaves y el return se pueden omitir si codigo es una sola instruccion
		//que devuelve un resultado

		Collections.sort(lista,(v1,v2)-> v2.getCilindrada() - v1.getCilindrada());
		
		
		
	}
}









