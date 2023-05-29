package ejercicio4;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio4Recursivo {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		System.out.println("Carpeta: ");
		String nombreCarpeta = tec.next();
		
		File carpeta = new File(nombreCarpeta);
		if(!carpeta.isDirectory()) {
			System.out.println("No se encuentra la carpeta indicada");
		} else {
			File masGrande = buscarMasGrande(carpeta);
			if(masGrande != null) {
				System.out.println(masGrande);
				System.out.println(masGrande.length());
			} else {
				System.out.println("La carpeta no tiene ficheros");
			}
		}
	}

	private static File buscarMasGrande(File carpeta) {
		File[] contenido = carpeta.listFiles();
		long max = 0;
		File masGrande = null;
		for(File f: contenido) {
			if(f.isFile()) {
				if (f.length() > max && f.getName().toLowerCase().endsWith(".txt")) {
					max = f.length();
					masGrande = f;
				}
			} else if (f.isDirectory()) {
				File mg = buscarMasGrande(f);
				if (mg != null && mg.length() > max) {
					max = mg.length();
					masGrande = mg;
				}
			}
		}
		return masGrande;
	}
}






