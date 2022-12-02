package examen;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Numero 1");
		int num1 = tec.nextInt();
		
		System.out.println("Numero 2");
		int num2 = tec.nextInt();
		
		int suma1 = 0;
		for(int i = 1; i <  num1; i++) {
			if(num1 % i == 0) {
				suma1 += i;
			}
		}
		
		int suma2 = 0;
		for(int i = 1; i <  num2; i++) {
			if(num2 % i == 0) {
				suma2 += i;
			}
		}
		
		if(num1 == suma2 && num2 == suma1) {
			System.out.println("amigos");
		} else {
			System.out.println("no amigos");
		}
	}

}