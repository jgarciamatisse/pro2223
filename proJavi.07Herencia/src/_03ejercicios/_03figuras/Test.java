package _03ejercicios._03figuras;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Figura> lista = new ArrayList<>();
		lista.add(new Circulo(10,15,"azul",30));
		lista.add(new Rectangulo(20,15,"verde",30,45));
		lista.add(new Circulo(10,15,"azul",20));
		lista.add(new Rectangulo(20,15,"verde",30,10));
		lista.add(new Circulo(10,15,"azul",10));
		
		//Bucle que muestre las areas de las figuras
		for(Figura f: lista) {
			System.out.println(f.toString());
			System.out.println(f.area());
			System.out.println("-------");
		}
		
		//Bucle que muestre los perimetros de las figuras
		for(Figura f: lista) {
			//No se puede llamar a perimetro porque no es un
			//metodo de la clase figura
			//System.out.println(f.perimetro());
		}
	}
}
