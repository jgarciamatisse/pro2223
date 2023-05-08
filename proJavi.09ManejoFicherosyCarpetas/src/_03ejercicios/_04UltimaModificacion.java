package _03ejercicios;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;

public class _04UltimaModificacion {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Carpeta: ");
		String nombreCarpeta = tec.nextLine();
		
		File c = new File(nombreCarpeta);
		if(!c.isDirectory()) {
			System.out.println("No existe o no es una carpeta");
		} else {
			File[] contenido = c.listFiles(f -> f.isFile());
			//o bien ...
			File[] contenido2 = c.listFiles((f) -> {return f.isFile();});
			//o bien ...
			File[] contenido3 = c.listFiles(new FileFilter () {
				@Override
				public boolean accept(File f) {
					return f.isFile();
				}
			});
			for(File f: contenido) {
				System.out.println(f.getName() + " - " + f.length() + " bytes");
			}
		}
	}
}
