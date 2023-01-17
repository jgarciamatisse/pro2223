package ejercicio1;

public class Ejercicio1 {
	public static void main(String[] args) {
		int [][] hacheMayuscula = {
				{0, 0, 0, 0, 0, 0},
				{0, 1, 0, 0, 1, 0},
				{0, 1, 0, 0, 1, 0},
				{0, 1, 1, 1, 1, 0},
				{0, 1, 0, 0, 1, 0},
				{0, 1, 0, 0, 1, 0},
				{0, 0, 0, 0, 0, 0}
		};

		imprimirLetra(hacheMayuscula);
		
		//Añadir borde e imprimir
		int[][] hacheConBorde = anyadirBorde(hacheMayuscula);
		imprimirLetra(hacheConBorde);
		
		//Quitar borde e imprimir
		imprimirLetra(quitarBorde(hacheConBorde));
		// o bien ....
		int[][] hacheSinBorde = quitarBorde(hacheConBorde);
		imprimirLetra(hacheSinBorde);
	}
	public static int[][] anyadirBorde (int[][] letra){
		//Crear la matriz a devolver
		int[][] res = new int[letra.length + 2][letra[0].length + 2];
		//Rellenamos la matriz
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				if(i == 0 || j == 0 || i == res.length - 1 || j == res[0].length - 1) {
					//Si es una celda del borde
					res[i][j] = 1;
				} else {
					res[i][j] = letra[i-1][j-1];
				}
			}
		}
		
		//Devolverla
		return res;
	}
	public static void imprimirLetra(int[][] letra) {
		for (int i = 0; i < letra.length; i++) {
			for (int j = 0; j < letra[0].length; j++) {
				if(letra[i][j] == 1) System.out.print("X ");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static int[][] quitarBorde(int[][] letra) {
		int[][] res = new int[letra.length - 2][letra[0].length - 2];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				res[i][j] = letra[i+1][j+1];
				
			}
		}
		return res;
	}

	public static int[][] quitarBorde2(int[][] letra) {
		int[][] res = new int[letra.length - 2][letra[0].length - 2];
		for (int i = 1; i < letra.length - 1; i++) {
			for (int j = 1; j < letra[0].length - 1; j++) {
				res[i][j] = letra[i][j];
				
			}
		}
		return res;
	}

}




