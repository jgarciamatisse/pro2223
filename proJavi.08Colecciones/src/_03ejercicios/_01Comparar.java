package _03ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _01Comparar {
	final static int SIZE = 100000000;
	public static void main(String[] args) {
		long t1, t2;
		t1 = System.currentTimeMillis();
		List<Integer> lista = new ArrayList<>(SIZE);
		for(int i = 0; i < SIZE; i++) {
			lista.add(i);
		}
		t2 = System.currentTimeMillis();
		System.out.println("crear: " + (t2 - t1));
		
		
		int cont;
		
		//Con for
		t1 = System.currentTimeMillis();
		cont = 0;
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i) % 2 == 0) {
				cont++;
			}
		}
		t2 = System.currentTimeMillis();
		System.out.println("FOR: " + (t2 - t1));
		
		
		//Con for - each
		t1 = System.currentTimeMillis();
		cont = 0;
		for(Integer x: lista) {
			if(x % 2 == 0) {
				cont ++;
			}
		}
		t2 = System.currentTimeMillis();
		System.out.println("FOREACH: " + (t2 - t1));
		
		//Con iterator
		t1 = System.currentTimeMillis();
		cont = 0;
		Iterator<Integer> it = lista.iterator();
		while(it.hasNext()) {
			if(it.next() % 2 == 0) {
				cont++;
			}
		}
		t2 = System.currentTimeMillis();
		System.out.println("ITERATOR: " + (t2 - t1));
		
	}
}
