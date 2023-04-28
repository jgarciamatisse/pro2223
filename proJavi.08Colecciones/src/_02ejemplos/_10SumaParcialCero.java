package _02ejemplos;

import java.util.HashMap;
import java.util.Map;

public class _10SumaParcialCero {
	// Dado un array, averiguar entre qué dos posiciones el array
	// suma exacamente cero
	public static void main(String[] args) {
		int[] v = { 1, 3, -10, 2, 14, 27, -33, 4, 2, -10, 1, 2, 3 };
		Map<Integer, Integer> sumas = new HashMap<>();
		int suma = 0;
		boolean enc = false;
		for (int i = 0; i < v.length && !enc; i++) {
			if (v[i] == 0) {
				System.out.format("Suma 0 entre %d y %d", i, i);
				enc = true;
			} else {
				suma += v[i];
				Integer posicion = sumas.get(suma);
				if (posicion == null) {
					sumas.put(suma, i);
				} else {
					System.out.format("Suma 0 entre %d y %d", posicion, i);
					enc = true;
				}
			}
		}
	}
}
