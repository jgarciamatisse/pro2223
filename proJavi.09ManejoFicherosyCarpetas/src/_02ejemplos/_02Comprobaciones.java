package _02ejemplos;

import java.io.File;
import java.util.Date;

public class _02Comprobaciones {
	public static void main(String[] args) {
		File carpetaSrc = new File("src");
		File paquetePruebas = new File(carpetaSrc,"_01pruebas");
		File paqueteEjercicios = new File(carpetaSrc,"_03ejercicios");
		File ejercicio1 = new File(paqueteEjercicios, "_01CarpetaActual.java");
		
		System.out.println("Existe: " + carpetaSrc + ": " + carpetaSrc.exists()); 
		System.out.println("Existe: " + paquetePruebas + ": " + paquetePruebas.exists()); 
		System.out.println("Existe: " + paqueteEjercicios + ": " + paqueteEjercicios.exists()); 
		System.out.println("Existe: " + ejercicio1 + ": " + ejercicio1.exists()); 
		
		System.out.println("isFile: " + carpetaSrc + ": " + carpetaSrc.isFile()); 
		System.out.println("isFile: " + paquetePruebas + ": " + paquetePruebas.isFile()); 
		System.out.println("isFile: " + paqueteEjercicios + ": " + paqueteEjercicios.isFile()); 
		System.out.println("isFile: " + ejercicio1 + ": " + ejercicio1.isFile()); 
		
		System.out.println("isDirectory: " + carpetaSrc + ": " + carpetaSrc.isDirectory()); 
		System.out.println("isDirectory: " + paquetePruebas + ": " + paquetePruebas.isDirectory()); 
		System.out.println("isDirectory: " + paqueteEjercicios + ": " + paqueteEjercicios.isDirectory()); 
		System.out.println("isDirectory: " + ejercicio1 + ": " + ejercicio1.isDirectory()); 
		
		System.out.println("length: " + carpetaSrc + ": " + carpetaSrc.length()); 
		System.out.println("length: " + paquetePruebas + ": " + paquetePruebas.length()); 
		System.out.println("length: " + paqueteEjercicios + ": " + paqueteEjercicios.length()); 
		System.out.println("length: " + ejercicio1 + ": " + ejercicio1.length()); 
		
		System.out.println("Ultimo cambio " + ejercicio1 + ": " + ejercicio1.lastModified());
		System.out.println("Ultimo cambio " + ejercicio1 + ": " + new Date(ejercicio1.lastModified()));
		
		
		
	}
}
