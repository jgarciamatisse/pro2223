package _03ejercicios._03figuras;

public abstract class Figura {
	private int posX;
	private int posY;
	private String color;
	
	public Figura(int posX, int posY, String color) {
		this.posX = posX;
		this.posY = posY;
		this.color = color;
	}
	
	//Obliga a que las subclases no abstractas
	//de Figura tengan este método implementado
	public  abstract double area();
	
	@Override 
	public String toString() {
		return "Posicion: (" + posX + "," + posY +") -" + color + " - Area: " + area();
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Figura)) return false;
		Figura f = (Figura) o;
		
		return this.posX == f.posX && this.posY == f.posY && this.color.equals(f.color);
		
	}

}
