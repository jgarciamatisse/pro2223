package _02ejemplos;

import java.util.LinkedHashSet;

public class _03Sets {
	public static void main(String[] args) {
		LinkedHashSet<Integer> conjunto = new LinkedHashSet<>();
		
		//Los set no duplican elementos
		conjunto.add(1);
		conjunto.add(10);
		conjunto.add(5);
		conjunto.add(1);
		System.out.println("Conjunto: " + conjunto);
		
		System.out.println("Se añade 30: " + conjunto.add(30));
		System.out.println("Conjunto: " + conjunto);
		
		System.out.println("Se añade 1: " + conjunto.add(1));
		System.out.println("Conjunto: " + conjunto);
		
	}

}
