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
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(! (o instanceof Rectangulo)) return false;
		Rectangulo r = (Rectangulo) o;
		return super.equals(r) && this.altura == r.altura 
				&& this.anchura == r.anchura;
	}
}
