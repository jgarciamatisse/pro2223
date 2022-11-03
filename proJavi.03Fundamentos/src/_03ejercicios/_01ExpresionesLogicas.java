package _03ejercicios;

public class _01ExpresionesLogicas {
	public static void main(String[] args) {
		int m = 10, j = 10, p = 10, v = 10;

		// Miguel es menor de edad
		boolean apartA = m < 18;
		System.out.println("a: " + apartA);

		// Miguel es mayor que Julio
		boolean apartB = m > j;
		System.out.println("b: " + apartB);

		// Miguel es el más viejo
		boolean apartC = m > j && m > p && m > v;
		System.out.println("c: " + apartC);

		// Alguno de ellos es mayor de edad
		boolean apartF = m >= 18 || p >= 18 || j >= 18 || v >= 18;
		System.out.println("f: " + apartF);

		// Todos menores de edad
		boolean apartM = !(m >= 18 || p >= 18 || j >= 18 || v >= 18);
		// o bien
		apartM = m < 18 && p < 18 && j < 18 && v < 18;
		// o bien 
		apartM = !apartF;
		System.out.println("m: " + apartM);
		
		//Al menos uno de ellos es menor que julio
		boolean apartP = m < j  || p < j  || v < j ;
		System.out.println("p: " + apartP);


	}
}
