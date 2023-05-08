package _02ejemplos.recursividad;

public class _01Recursividad {
	public static void main(String[] args) {
		int s = sumarHasta(10);
		System.out.println(s);
		
		s = sumatorioHasta(10);
		System.out.println(s);
		
		int f = factorial(10);
		System.out.println(f);
	}
	
	//Metodo iterativo
	public static int sumarHasta(int n) {
		int suma = 0;
		for(int i = 1; i <= n; i++) {
			suma += i;
		}
		return suma;
	}
	
	//Metodo recursivo 
	public static int sumatorioHasta(int n) {
		if(n == 1) return 1;
		else return n + sumatorioHasta(n - 1);
	}
	
	public static int factorial(int n) {
		if (n == 0) return 1;
		else return n * factorial(n - 1);
	}
}








