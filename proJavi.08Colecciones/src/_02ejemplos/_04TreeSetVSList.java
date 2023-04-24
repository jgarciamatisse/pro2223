package _02ejemplos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class _04TreeSetVSList {
	final static int ELEMENTOS = 10000000;
	final static int BUSQUEDAS = 1000000;
	public static void main(String[] args) {
		//Creo una lista y un treeset con los mismos valores
		Random r  = new Random();
		TreeSet<Integer> ts = new TreeSet<>();
		
		for(int i = 0; i < ELEMENTOS; i++) {
			Integer n = r.nextInt();
			ts.add(n);
		}
		ArrayList<Integer> l = new ArrayList<>(ts);
		HashSet<Integer> hs = new HashSet<>(ts);
		System.out.println("Colecciones creadas");
		
		//Hacemos busquedas en uno y otro
		long t1,t2;
//		t1 = System.currentTimeMillis();
//		for(int i = 0; i< BUSQUEDAS; i++) {
//			if(l.contains(125)) {
//				
//			}
//		}
//		t2 = System.currentTimeMillis();
//		System.out.println("En lista: " + (t2 - t1));

		t1 = System.currentTimeMillis();
		for(int i = 0; i< BUSQUEDAS; i++) {
			if(ts.contains(125)) {
				
			}
		}
		t2 = System.currentTimeMillis();
		System.out.println("En treeset: " + (t2 - t1));

		t1 = System.currentTimeMillis();
		for(int i = 0; i< BUSQUEDAS; i++) {
			if(hs.contains(125)) {
				
			}
		}
		t2 = System.currentTimeMillis();
		System.out.println("En hashSet: " + (t2 - t1));

	}
}
