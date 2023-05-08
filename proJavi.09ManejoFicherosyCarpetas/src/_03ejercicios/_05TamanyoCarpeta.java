package _03ejercicios;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class _05TamanyoCarpeta {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Carpeta: ");
		String nombreCarpeta = tec.nextLine();
		
		File c = new File(nombreCarpeta);
		if(!c.isDirectory()) {
			System.out.println("No existe o no es una carpeta");
		} else {
			
			File[] contenido = c.listFiles(f -> f.isFile());
			long total = 0;
			for(File f: contenido) {
				total += f.length();
			}
			System.out.println("Tamaño total: " + total);
		}
		
	}
}
