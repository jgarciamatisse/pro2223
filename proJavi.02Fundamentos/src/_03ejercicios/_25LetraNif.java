package _03ejercicios;

import java.util.Scanner;

public class _25LetraNif {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("NIF: ");
		String nif = tec.next().toUpperCase();
		
		//Separar numero y letras
		String numeroNif = nif.substring(0,nif.length() - 1);
		char letra = nif.charAt(nif.length() - 1);	
		
		char letraCorrecta = calcularLetraNif(Integer.parseInt(numeroNif));
		if(letra == letraCorrecta) {
			System.out.println("Correcto");
		} else {
			System.out.println("Incorrecto");
		}
		
	}

	public static char calcularLetraNif(int numero) {
//		if(resto == 0) letra = "T";
//		else if (resto == 1) letra = "R";
//		...
		
		return "TRWAGMYFPDXBNJZSQVHLCKE".charAt(numero % 23);
	}
}
