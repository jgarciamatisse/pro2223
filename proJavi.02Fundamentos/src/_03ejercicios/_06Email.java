package _03ejercicios;

import java.util.Scanner;

public class _06Email {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Email: ");
		String email = tec.nextLine();
		int posArroba = email.indexOf('@'); 
		int posPunto = email.indexOf('.');
		
		String usuario = email.substring(0,posArroba);
		String subdominio = email.substring(posArroba + 1, posPunto);
		String dominio = email.substring(posPunto + 1);
		
		System.out.println("Usuario: " + usuario);
		System.out.println("Subdominio: " + subdominio);
		System.out.println("Dominio: " + dominio);
		
		
	}

}


