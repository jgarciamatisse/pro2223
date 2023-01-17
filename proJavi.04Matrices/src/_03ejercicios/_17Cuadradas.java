package _03ejercicios;

public class _17Cuadradas {
	public static void main(String[] args) {
		int[][] m = { 
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		mostrarDiagonal(m);
		
	}
	
	public static void mostrarDiagonalMala(int [][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if(i == j) {
					System.out.println(m[i][j]);
				}
			}
		}
	}
	public static void mostrarDiagonal(int [][] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i][i]);
		}
	}
	public static void mostrarDiagonalRegular(int [][] m) {
		for (int i = 0, j = 0; i < m.length; i++, j++) {
			System.out.println(m[i][j]);
		}
	}
	
	public static int filaDelMayor(int[][] m) {
		int fila = 0;
		int mayor = m[0][0];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if(m[i][j] > mayor) {
					mayor = m[i][j];
					fila = i;
				}
			}
		}
		return fila;
	}
	
	public static void intercambiarV1(int[][] m, int f1, int f2) {
		for (int j = 0; j < m[0].length; j++) {
			int aux = m[f1][j];
			m[f1][j] = m[f2][j];
			m[f2][j] = aux;
		}
	}
	public static void intercambiarV2(int[][] m, int f1, int f2) {
			int[] aux = m[f1];
			m[f1] = m[f2];
			m[f2] = aux;
	}

}
