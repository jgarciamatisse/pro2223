package _02ejemplos;

import java.io.File;
import java.util.Scanner;

public class _04ContenidoCarpetas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Carpeta: ");
		String nombreCarpeta = tec.nextLine();
		
		
		File carpeta = new File(nombreCarpeta);
		if(carpeta.isDirectory()) {
			//Mostrar el contenido de la carpeta: podemos usar list
			String[] contenido1 =	carpeta.list();
			System.out.println("----- Contenido de " + nombreCarpeta);
			for(String s: contenido1) {
				System.out.println(s);
			}
			
			//Mostrar las subcarpetas de la carpeta indicada por el usuario
			File[] contenido2 = carpeta.listFiles();
			System.out.println("----- Subcarpetas de " + nombreCarpeta);
			for(File f: contenido2) {
				if(f.isDirectory()) {
					System.out.println(f);
				}
			}
			//Mostrar los ficheros de la carpeta indicada por el usuario
			File[] contenido3 = carpeta.listFiles();
			System.out.println("----- Ficheros de " + nombreCarpeta);
			for(File f: contenido3) {
				if(f.isFile()) {
					System.out.println(f);
				}
			}
			
			 
		} else {
			System.out.println("La carpeta no existe");
		}
		
		
	}
}
