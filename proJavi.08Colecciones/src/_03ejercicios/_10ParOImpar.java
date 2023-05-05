package _03ejercicios;

import java.util.ArrayList;
import java.util.Random;

public class _10ParOImpar {
	public static void main(String[] args) {
		Random r = new Random(1);
		ArrayList<Integer> l = new ArrayList<>();
		for(int i = 1; i < 10; i++) {
			l.add(r.nextInt(200));
		}
		System.out.println(l);
		
		//Mostrar por pantalla los elementos pares USANDO el método forEach() de la
		//clase ArrayList
		l.forEach((n)->{if(n%2 == 0) System.out.println(n);});
		
	}
}
