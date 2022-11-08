package _02ejemplos;

public class _07EjerciciosTema2ConFor {
	public static void main(String[] args) {
		System.out.println("Impares hasta 3");
		imparesHastaN(3);
		System.out.println("3 primeros impares");
		nImpares(3);
		System.out.println("Cuenta atras desde 3");
		cuentaAtras(3);
		System.out.println("Suma 3 primeros enteros");
		sumaNPrimeros(3);
		System.out.println("Divisores de 6");
		mostrarDivisoresN(6);
		System.out.println("Suma divisores de 6");
		mostrarSumaDivisoresN(6);
	}
	
	public static void imparesHastaN (int n) {
		for(int num = 1; num <= n; num += 2) {
			System.out.println(num);
		}
		
	}
	public static void nImpares(int n) {
		int num = 1;
		for(int cont = 0; cont < n; cont ++) {
			System.out.println(num);
			num += 2;
		}
		//Mejor que esto:
		for(int cont = 0, numero = 1; cont < n; cont ++, numero += 2) {
			System.out.println(numero);
		}
		
	}
	public static void cuentaAtras(int n) {
		for(int num = n; num >=0; num --) {
			System.out.println(num);
		}
		//Mejor que esto:
		for( ; n >= 0; n--) {
			System.out.println(n);
		}
		
	}
	public static void sumaNPrimeros(int n) {
		int suma = 0;
		for (int num = 1; num <= n; num++) {
			suma += num;
		}
		System.out.println(suma);
		
	}
	public static void mostrarDivisoresN(int n) {
		for(int divisor = 1; divisor <= n; divisor ++) {
			if(n % divisor == 0) {
				System.out.println(divisor);
			}
		}
		
	}
	public static void mostrarSumaDivisoresN (int n) {
		int suma = 0;
		for(int divisor = 1; divisor <= n; divisor ++) {
			if(n % divisor == 0) {
				suma += divisor;
			}
		}
		System.out.println(suma);
	}
	
}
