package ejercicio4;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		System.out.println("Carpeta: ");
		String nombreCarpeta = tec.next();
		
		File carpeta = new File(nombreCarpeta);
		if(!carpeta.isDirectory()) {
			System.out.println("No se encuentra la carpeta indicada");
		} else {
			long maxLength = 0;
			File masGrande = null;
			
			LinkedList<File> pendiente = new LinkedList<>();
			pendiente.add(carpeta);
			
			while(!pendiente.isEmpty()) {
				File c = pendiente.remove(0);
				File[] contenido = c.listFiles();
				for(File f: contenido) {
					if(f.isDirectory()) pendiente.add(f);
					else if(f.isFile()) {
						//comprobamos si es un fichero de texto
						if(f.getName().toUpperCase().endsWith(".TXT")) {
							if(f.length() > maxLength) {
								maxLength = f.length();
								masGrande = f;
							}
						}
					}
				}
			}
			System.out.println("Mas grande: " + masGrande);
			System.out.println("Tamanyo: " + maxLength);
			
		}
	}

}
