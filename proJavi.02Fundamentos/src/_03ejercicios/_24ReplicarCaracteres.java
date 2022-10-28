package _03ejercicios;

import java.util.Scanner;

public class _24ReplicarCaracteres {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Letra: ");
		char letra = tec.next().charAt(0);
		System.out.println("Veces: ");
		int veces = tec.nextInt();
		
		System.out.println(replicar(letra,veces));
		
		System.out.println(replicar('*',20));
	}

	/**
	 * Crea un String repitiendo un caracter una serie de veces
	 * @param letra el caracter a repetir
	 * @param veces las veces que el el caracter se repite
	 * @return un String con el caracter repetido las veces indicadas
	 */
	public static String replicar(char letra, int veces) {
		String resultado = "";
		
		int cont = 0;
		while(cont < veces) {
			resultado = resultado + letra;
			cont = cont + 1;
		}
		
		return resultado;
	}
}
