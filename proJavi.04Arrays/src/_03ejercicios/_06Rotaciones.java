package _03ejercicios;

import java.util.Arrays;
import java.util.Iterator;

public class _06Rotaciones {
	public static void main(String[] args) {
		int[] impares = {1,3,5,7,9};
		
		for (int i = 0; i < impares.length; i++) {
			rotarIzquierda(impares);
			System.out.println(Arrays.toString(impares));
		}
		
	}
	public static void rotarDerecha(int[] v) {
		int ultimo = v[v.length - 1]; //Guardamos el ultimo elemento 
		
		//Desplazamos cada elemento una posicion a la derecha
		for (int i = v.length - 1; i >= 1; i--) {
			v[i] = v[i - 1];
		}
		//Copiamos el ultimo en la primera posicion
		v[0] = ultimo;
	}
	public static void rotarIzquierda(int[] v) {
		int primero = v[0]; //Guardamos el primer elemento
		//Desplazamos cada elemento una pos. a la izq.
		for (int i = 0; i < v.length - 1; i++) {
			v[i] = v[i + 1];
		}
		//Copiamos el primero en la ultima posicion
		v[v.length - 1] = primero;
		
	}
}
