package _02ejemplos;

import java.io.File;
import java.util.Arrays;

public class _03ContenidoCarpetas {
	public static void main(String[] args) {
		File carpetaProyecto = new File(".");
		File carpetaSrc = new File("src");
		
		System.out.println("Contenido de carpeta del proyecto: ");
		String[] contenidoProyecto = carpetaProyecto.list();
		System.out.println(Arrays.toString(contenidoProyecto));
		
		System.out.println("Contenido de carpeta src: ");
		System.out.println(Arrays.toString(carpetaSrc.list())); //Lo mismo que antes, pero al vuelo
		
		//Mostrar las clases que hay en los paquetes de src
		System.out.println("Clases del proyecto --------------------");
		String[] contenidoSrc = carpetaSrc.list();
		for(String nombre: contenidoSrc) {
			File paquete = new File(carpetaSrc, nombre);
			if(paquete.isDirectory()) {
				String[] clases = paquete.list();
				for(String clase: clases) {
					System.out.println(clase);
				}
			}
		}
		
		//Lo mismo con listFiles
		System.out.println("Clases del proyecto --------------------");
		File[] filesSrc = carpetaSrc.listFiles();
		for(File paquete: filesSrc) {
			if(paquete.isDirectory()) {
				String[] clases = paquete.list();
				for(String clase: clases) {
					System.out.println(clase);
				}
			}
		}
		
	}
}
