package _02ejemplos;

public class _09CaraCruz {
	public static void main(String[] args) {
		double num = Math.random();
		if(num >= 0.5) {
			System.out.println("Cara");
		} else {
			System.out.println("Cruz");
		}
		
		double num2 = (int) (Math.random() * 2);
		if(num2 == 0) {
			System.out.println("Cara");
		} else {
			System.out.println("Cruz");
		}	}
}
