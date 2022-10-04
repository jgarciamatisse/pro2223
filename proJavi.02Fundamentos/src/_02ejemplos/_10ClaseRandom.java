package _02ejemplos;

import java.util.Random;

public class _10ClaseRandom {
	public static void main(String[] args) {
		
		//La clase Random tiene métodos para devolver valores aleatorios de determinado tipo
		Random r = new Random();
		System.out.println("Entero cualquiera: " + r.nextInt());
		System.out.println("Entero entre [0 y 9]: " + r.nextInt(10));
		
		System.out.println("Verdadero o falso al azar: " + r.nextBoolean());
		
		System.out.println("Double cualquiera: " + r.nextDouble());
		
		//Variable Random con semilla
		
		Random r2 = new Random(20);
		System.out.println(r2.nextInt());
		System.out.println(r2.nextInt());
		System.out.println(r2.nextInt());
	}
}
