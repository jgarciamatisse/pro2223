package _03ejercicios;

import java.util.Scanner;

public class _22Cifras {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Numero: ");
		int n = tec.nextInt();
		
		int cifras = 0;
		if(n > 0) {
			while(n > 0) {
				n = n / 10;
				cifras = cifras + 1;
			}
		} else {
			cifras = 1;
		}
		
		System.out.println("Cifras: " + cifras);
	}
}
