package _03ejercicios;

public class _01ExpresionesLogicas {
	public static void main(String[] args) {
		int m = 10,j = 10,p = 10,v = 10;
		
		//Miguel es menor de edad
		boolean apartA = m < 18;
		System.out.println("a: " + apartA);
		
		//Miguel es mayor que Julio
		boolean apartB = m > j;
		System.out.println("b: " + apartB);
		
		//Miguel es el más viejo
		boolean apartC = m > j && m > p && m > v;
		System.out.println("c: " + apartC);
		
	}
}
