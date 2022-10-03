package _02ejemplos;

public class _08Aleatorios {
	public static void main(String[] args) {
		//Math.random() genera un numero entre [0 y 1[
		double numEntre0y1 = Math.random();
		System.out.println("Numero en [0,1[: " + numEntre0y1);
		
		System.out.println("Numero en [0,10[: " + numEntre0y1 * 10);
		System.out.println("Numero en [0,100[: " + numEntre0y1 * 100);
		System.out.println("Numero en [20,30[: " + (20 + numEntre0y1 * 10 ));
	
		//Numeros enteros
		System.out.println("Entero en [0,7[: " + (int) (Math.random() * 7));
		
		//Lanzar un dado (valor entero entre [1 y 6]
		System.out.println("Dado: " + (1 + (int) (Math.random() * 6)));
	}

}


