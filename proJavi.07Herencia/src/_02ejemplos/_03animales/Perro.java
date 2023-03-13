package _02ejemplos._03animales;

public class Perro extends Canino /*implements Paseable */{
	@Override
	public void saludar() {
		System.out.println("Guau Guau!!");
	}
	
	public void pasear() {
		System.out.println("Perro paseando");
	}
	
}
