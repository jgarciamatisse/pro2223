package _02ejemplos;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class _07RecorrerEstructuraCarpetasRecursivo {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Carpeta: ");
		String nombreCarpeta = tec.nextLine();
		
		File c = new File(nombreCarpeta);
		if(!c.isDirectory()) {
			System.out.println("No existe o no es una carpeta");
		} else {
			recorrer(c,0);
		}
	}
	public static void recorrer(File carpeta, int nivel) {
		File[] contenido = carpeta.listFiles();
		for(File f: contenido) {
			//Mostramos espacios en blanco
			for(int i = 0; i < nivel; i++) {
				System.out.print("  ");
			}
			System.out.println(f.getName());
			
			if(f.isDirectory()) {
				recorrer(f, nivel +1);
			}
		}
	}
}



