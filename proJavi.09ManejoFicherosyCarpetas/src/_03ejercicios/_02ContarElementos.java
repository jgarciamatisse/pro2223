package _03ejercicios;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class _02ContarElementos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Carpeta: ");
		String nombreCarpeta = tec.nextLine();
		
		File c = new File(nombreCarpeta);
		if(!c.isDirectory()) {
			System.out.println("No existe o no es una carpeta");
		} else {
			int contFicheros = 0;
			int contCarpetas = 0;
			File[] contenido = c.listFiles();
			for(File f: contenido) {
				if(f.isFile()) contFicheros++;
				else if(f.isDirectory()) contCarpetas++;
			}
			System.out.println("Numero ficheros: " + contFicheros);
			System.out.println("Numero carpetas: " + contCarpetas);
		}
		
	}
}
