package _03ejercicios._03figuras;

public class Circulo extends Figura{
	private int radio;
	public Circulo(int posX, int posY, String color, int radio) {
		super(posX, posY, color);
		this.radio = radio;
	}
	@Override
	public double area() {
		return Math.PI * radio * radio;
	}
	//@Override NO esta en Figura
	public double perimetro() {
		return 2 * Math.PI * radio;
	}
}
