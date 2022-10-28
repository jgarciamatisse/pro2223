package _03ejercicios;

import java.util.Scanner;

public class _19SumaDivisores {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Numero: ");
		int n = tec.nextInt();
		
		int d = 1;
		int suma = 0;
		while (d <= n ) {
			if(n % d == 0) {
				//System.out.println(d);
				suma = suma + d;
			}
			
			d = d + 1;
		}
		
		System.out.println("Suma: " + suma);
	}
}
