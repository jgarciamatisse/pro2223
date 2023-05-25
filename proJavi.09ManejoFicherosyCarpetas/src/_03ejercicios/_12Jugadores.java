package _03ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;

public class _12Jugadores {
	public static void main(String[] args) {
		grabarJugadores();
		mostrarJugadores();
		ordenarJugadores();
	}

	public static void grabarJugadores() {
		try (PrintStream f = new PrintStream("jugadores.txt")) {
			Scanner tec = new Scanner(System.in);
			int dorsal;
			do {
				System.out.println("Dorsal: ");
				dorsal = tec.nextInt();
				tec.nextLine();
				if (dorsal != 0) {
					System.out.println("Nombre: ");
					String nombre = tec.nextLine();
					System.out.println("Estatura: ");
					double estatura = tec.nextDouble();

					f.println(dorsal);
					f.println(nombre);
					f.println(estatura);
				}
			} while (dorsal != 0);
		} catch (FileNotFoundException e) {
			System.out.println("No se puede abrir el fichero");
		}
	}

	public static void mostrarJugadores() {
		try (Scanner f = new Scanner(new File("jugadores.txt")).useLocale(Locale.US)) {
			while (f.hasNext()) {
				int dorsal = f.nextInt();
				f.nextLine();
				String nombre = f.nextLine();
				double estatura = f.nextDouble();
				System.out.println(dorsal + " - " + nombre + " - " + estatura);
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se puede abrir el fichero");
		}
	}

	public static void ordenarJugadores() {
		TreeSet<Jugador> ts = new TreeSet<>();
		try (Scanner f = new Scanner(new File("jugadores.txt")).useLocale(Locale.US)) {
			while (f.hasNext()) {
				int dorsal = f.nextInt();
				f.nextLine();
				String nombre = f.nextLine();
				double estatura = f.nextDouble();
				ts.add(new Jugador(dorsal, nombre, estatura));
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se puede abrir el fichero");
		}

		try (PrintStream f = new PrintStream("jugadores.txt")) {
			for (Jugador j : ts) {
				f.println(j);
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se puede escribir el fichero");
		}

	}
}
