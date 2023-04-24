package _02ejemplos._06RequisitosMiembros;

import java.util.Arrays;
import java.util.TreeSet;

public class TestTreeSets {
	public static void main(String[] args) {
				
		//Los TreeSet requieren que los miembros implemente Comparable
		//De lo contrario se produce error de ejecución
//		TreeSet<Profesor> profes = new TreeSet<>(Arrays.asList(
//				new Profesor("1","a"),
//				new Profesor("2","b"),
//				new Profesor("3","c")
//		));
		
		//Con Clientes funciona, porque implementa Comparable<Cliente>
		TreeSet<Cliente> clientes = new TreeSet<>(Arrays.asList(
				new Cliente("1","a"),
				new Cliente("2","b"),
				new Cliente("3","c")
		));
		System.out.println(clientes.contains(new Cliente("1","a")));
	}
}
