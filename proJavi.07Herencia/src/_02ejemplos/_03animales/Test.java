package _02ejemplos._03animales;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Animal> animales = new ArrayList<>();
		animales.add(new Gato());
		animales.add(new Tigre());
		animales.add(new Gato());
		
		//Con el perro se producirá error al hacer el casting a Felino
		// animales.add(new Perro());
		
		//Definir saludar en Animal nos permite aprovechar el polimorfismo
		for(Animal a: animales) {
			a.saludar();
		}
		
		//No puedo llamar a trepar(), porque la clase Animal no tiene ese metodo
		for(Animal a: animales) {
			//a.trepar();
		}
		
		//Podemos llamar a trepar si hacemos un casting
		for(Animal a: animales) {
			((Felino)a).trepar();
		}
		
		//Podemos llamar a trepar si hacemos un casting
		for(Animal a: animales) {
			Felino f = (Felino) a;
			f.trepar();
		}
		
		//Puedo llamar a pasear() de perros y gatos
		Perro p = new Perro();
		p.pasear();
		Gato g = new Gato();
		g.pasear();
		
		//Pero no puedo llamar a pasear sobre una lista con perros y gatos
		ArrayList<Animal> misMascotas = new ArrayList<>();
		misMascotas.add(new Perro());
		misMascotas.add(new Gato());
		
		for(Animal a: misMascotas) {
			//a.pasear();
		}
		
		//Usando el interface Paseable si que puedo pasear a mis mascotas
		ArrayList<Paseable> misMascotas2 = new ArrayList<>();
		misMascotas.add(new Perro());
		misMascotas.add(new Gato());
		
		for(Paseable m: misMascotas2) {
			m.pasear();
		}
		
		//Se puede conseguir lo mismo haciendo un casting 
		ArrayList<Animal> misMascotas3 = new ArrayList<>();
		misMascotas.add(new Perro());
		misMascotas.add(new Gato());
		
		for(Animal a: misMascotas) {
			((Paseable)a).pasear();
		}
	}
}




