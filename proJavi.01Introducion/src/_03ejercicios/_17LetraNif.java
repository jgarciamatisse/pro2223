package _03ejercicios;

import java.util.Scanner;

public class _17LetraNif {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Numero de nif: ");
		int numero = tec.nextInt();
		
		int resto = numero % 23;
		
		if (resto == 0) {
			System.out.println("Letra: T");
		} else if (resto == 1){
			System.out.println("Letra: R");
		} else if (resto == 2){
			System.out.println("Letra: W");
		} else if (resto == 3){
			System.out.println("Letra: A");
		} else if (resto == 4){
			System.out.println("Letra: ");
		} else if (resto == 5){
			System.out.println("Letra: ");
		} else if (resto == 6){
			System.out.println("Letra: ");
		} else if (resto == 7){
			System.out.println("Letra: ");
		} else if (resto == 8){
			System.out.println("Letra: ");
		} else if (resto == 9){
			System.out.println("Letra: ");
		} else if (resto == 10){
			System.out.println("Letra: ");
		} else if (resto == 11){
			System.out.println("Letra: ");
		} else if (resto == 12){
			System.out.println("Letra: ");
		} else if (resto == 13){
			System.out.println("Letra: ");
		} else if (resto == 14){
			System.out.println("Letra: ");
		} else if (resto == 15){
			System.out.println("Letra: ");
		} else if (resto == 16){
			System.out.println("Letra: ");
		} else if (resto == 17){
			System.out.println("Letra: ");
		} else if (resto == 18){
			System.out.println("Letra: ");
		} else if (resto == 19){
			System.out.println("Letra: ");
		} else if (resto == 20){
			System.out.println("Letra: ");
		} else if (resto == 21){
			System.out.println("Letra: ");
		} else {
			System.out.println("Letra: ");
		}
	}

}
