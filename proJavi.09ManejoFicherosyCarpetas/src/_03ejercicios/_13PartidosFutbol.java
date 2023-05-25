package _03ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _13PartidosFutbol {
	public static void main(String[] args) {
		try (Scanner f = new Scanner(new File("partidos.txt"))) {
			Map<String, Integer> m = new TreeMap<>();

			while (f.hasNext()) {
				String local = f.next();
				int golesLocal = f.nextInt();
				String visitante = f.next();
				int golesVisitante = f.nextInt();

				int puntosLocal = 0, puntosVisitante = 0;
				if (golesLocal < golesVisitante) {
					puntosVisitante = 3;
				} else if (golesLocal > golesVisitante) {
					puntosLocal = 3;
				} else {
					puntosLocal = 1;
					puntosVisitante = 1;
				}
				// Agregar puntos a equipo local
				Integer pL = m.get(visitante);
				if (pL == null) {
					m.put(local, puntosLocal);
				} else {
					m.put(local, pL + puntosLocal);
				}

				// Agregar puntos a equipo visitante
				Integer pV = m.get(visitante);
				if (pV == null) {
					m.put(visitante, puntosVisitante);
				} else {
					m.put(visitante, pV + puntosVisitante);
				}
			}
			System.out.println(m);
		} catch (FileNotFoundException e) {
			System.out.println("No se puede abrir el fichero");
		}

	}
}
