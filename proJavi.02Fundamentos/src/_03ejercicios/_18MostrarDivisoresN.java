package _03ejercicios;

import java.util.Scanner;

public class _18MostrarDivisoresN {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Numero: ");
		int n = tec.nextInt();
		
		int d = 1;
		while (d <= n ) {
			if(n % d == 0) {
				System.out.println(d);
			}
			
			d = d + 1;
		}
		
		
	}
}
