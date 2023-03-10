package _03ejercicios._03figuras;

public class Rectangulo extends Figura {
	private int altura;
	private int anchura;
	public Rectangulo(int posX, int posY, String color, int altura, int anchura) {
		super(posX, posY, color);
		this.altura = altura;
		this.anchura = anchura;
	}
	@Override
	public double area() {
		return altura * anchura;
	}
	//@Override NO esta en Figura
	public double perimetro() {
		return 2 * altura  + 2 * anchura;
	}
}
