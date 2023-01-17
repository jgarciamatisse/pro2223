package _02ejemplos;

import java.util.Arrays;

public class _01CuestionesBasicas {
	public static void main(String[] args) {
		int [][] m = new int [2][3]; //Matriz de 2 x 3 enteros.
		
		//Si imprimimos una matriz aparece el tipo y la direccion de memoria
		System.out.println(m);
		
		//Acceder a los componentes del array:
		m[0][0] = 10; //Fila 0 col 0
		m[0][1] = 12; //Fila 0 col 1
		m[1][0] = 3;  //Fila 1 col 0
		
		//Si imprimimos la matriz con Arrays.toString()
		//Nos muestra un array de arrays
		System.out.println(Arrays.toString(m));
		
		//Si quiero mostrar los elementos de la matriz
		System.out.println(Arrays.toString(m[0]));
		System.out.println(Arrays.toString(m[1]));
		
		//---------------------
		
		//Inicializacion de matrices
		String[][] nombres = {
				{"ana","lea","rosa"},
				{"luis","vicente","dani"}
		};
		System.out.println(Arrays.toString(nombres[0]));
		System.out.println(Arrays.toString(nombres[1]));
		
	}
}
