package _03ejercicios;

import java.util.Iterator;

public class _18Simetrica {

	public static boolean esSimetrica(int[][] m) {
		boolean simetrica = true;;
		if(m.length != m[0].length) {
			simetrica = false;
		} else {
			for (int i = 1; i < m.length && simetrica; i++) {
				for (int j = 0; j < i && simetrica; j++) {
					if(m[i][j] != m[j][i]) {
						simetrica = false;
					} 
				}
			}
		}
		return simetrica;
	}
	public static boolean esSimetricaMala(int[][] m) {
		boolean simetrica = true;;
		if(m.length != m[0].length) {
			simetrica = false;
		} else {
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[0].length; j++) {
					if(m[i][j] != m[j][i]) {
						simetrica = false;
					} 
				}
			}
		}
		return simetrica;
		

	}
}
