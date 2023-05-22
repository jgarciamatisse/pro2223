package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Ejercicio1 {
	public static void main(String[] args) {
		Set<Partido> partidos = leerFichero();
		Map<String, Integer> puntos = contarPuntos(partidos);
		System.out.println(puntos);
		mostrarGanador(puntos);
	}

	private static Map<String, Integer> contarPuntos(Set<Partido> partidos) {
		Map<String, Integer> m = new TreeMap<>();
		for (Partido p : partidos) {

			int puntosLocal = 0, puntosVisitante = 0;
			if (p.getGolesLocal() < p.getGolesVisitante()) {
				puntosVisitante = 3;
			} else if (p.getGolesLocal() > p.getGolesVisitante()) {
				puntosLocal = 3;
			} else {
				puntosLocal = 1;
				puntosVisitante = 1;
			}
			// Agregar puntos a equipo local
			Integer pL = m.get(p.getLocal());
			if (pL == null) {
				m.put(p.getLocal(), puntosLocal);
			} else {
				m.put(p.getLocal(), pL + puntosLocal);
			}

			// Agregar puntos a equipo visitante
			Integer pV = m.get(p.getVisitante());
			if (pV == null) {
				m.put(p.getVisitante(), puntosVisitante);
			} else {
				m.put(p.getVisitante(), pV + puntosVisitante);
			}
		}
		return m;
	}

	private static void mostrarGanador(Map<String, Integer> puntos) {
		int puntosGanador = -1;
		String ganador = "";
		for (String equipo : puntos.keySet()) {
			int n = puntos.get(equipo);
			if (n > puntosGanador) {
				puntosGanador = n;
				ganador = equipo;
			}
		}
		System.out.println("El ganador es " + ganador + " con " + puntosGanador + " puntos");
	}

	private static Set<Partido> leerFichero() {
		HashSet<Partido> p = new HashSet<>();
		try (Scanner f = new Scanner(new File("resultadosLiga.txt"))) {
			while (f.hasNext()) {
				p.add(new Partido(f.next(), f.nextInt(), f.next(), f.nextInt()));
			}
		} catch (FileNotFoundException e) {
			System.err.println("Falta el fichero de resultados");
			System.err.println("PONTE EN CONTACTO CON EL PROFESOR");
			System.exit(0);
		} catch (Exception e) {
			System.err.println("Error al leer fichero de resultados");
			System.err.println("PONTE EN CONTACTO CON EL PROFESOR");
			System.exit(0);
		}
		return p;
	}
}
