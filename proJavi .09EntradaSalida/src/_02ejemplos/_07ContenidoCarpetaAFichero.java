package _02ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class _07ContenidoCarpetaAFichero {
	// Dado un nombre de carpeta que indica el usuario
	// Escribir en un fichero de texto el nombre de los archivos y carpetas que
	// contiene dicha carpeta.
	// El nombre del fichero será "Contenido de XXXXX.txt", donde XXXXX será el
	// nombre
	// de la carpeta

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Carpeta: ");
		String nombreCarpeta = tec.next();

		File carpeta = new File(nombreCarpeta);
		if (!carpeta.isDirectory()) {
			System.out.println("La carpeta no existe");
		} else {
			try (PrintStream fs = new PrintStream("Contenido de " + carpeta.getName() + ".txt")) {

				File[] subcarpetas = carpeta.listFiles(f -> f.isDirectory());
				Arrays.sort(subcarpetas, (f1, f2) -> {
					return f1.getName().compareTo(f2.getName());
				});
				for (File f : subcarpetas) {
					fs.println(f);
				}

				File[] ficheros = carpeta.listFiles(f -> f.isFile());
				Arrays.sort(ficheros, (f1, f2) -> {
					return f1.getName().compareTo(f2.getName());
				});
				for (File f : ficheros) {
					fs.println(f);
				}

			} catch (FileNotFoundException e) {
				System.out.println("No se pudo abrir el fichero");
			}

		}
	}
}
