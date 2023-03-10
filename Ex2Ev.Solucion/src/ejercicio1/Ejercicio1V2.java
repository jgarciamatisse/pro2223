package ejercicio1;

import java.util.Scanner;

public class Ejercicio1V2 {
	public static void main(String[] args) {
		int[][] m = new int[4][5];
		mostrarMatriz(m);
		while (true) {
			anyadirElemento(m);
			System.out.println("--------------");
			mostrarMatriz(m);

		}
	}

	private static void mostrarMatriz(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void anyadirElemento(int[][] m) {
		Scanner tec = new Scanner(System.in);

		System.out.print("Fila Columna Valor: ");
		int fil = tec.nextInt();
		int col = tec.nextInt();
		int val = tec.nextInt();

		if (fil < 0 || fil >= m.length) {
			System.out.println("Posicion incorrecta");
		} else if (col < 0 || col >= m[0].length) {
			System.out.println("Posicion incorrecta");
		} else if (m[fil][col] != 0) {
			System.out.println("La posicion está ocupada");
		} else {
			// Comprobamos si esta repetido en la fila
			boolean repetidoFila = false;
			for (int j = 0; j < m[0].length && !repetidoFila; j++) {
				if (m[fil][j] == val) {
					repetidoFila = true;
				}
			}
			boolean repetidoCol = false;
			for (int i = 0; i < m.length && !repetidoCol; i++) {
				if (m[i][col] == val) {
					repetidoCol = true;
				}
			}
			if (repetidoFila)
				System.out.println(val + " ya está en la fila");
			else if (repetidoCol)
				System.out.println(val + " ya está en la columna");
			else 
				m[fil][col] = val;
				
			}
		}
	

}
