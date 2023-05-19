package _02ejemplos;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class _06RecorrerEstructuraCarpetas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Carpeta: ");
		String nombreCarpeta = tec.nextLine();
		
		File c = new File(nombreCarpeta);
		if(!c.isDirectory()) {
			System.out.println("No existe o no es una carpeta");
		} else {
			List<File> carpetasPendientes = new LinkedList<>();
			//Situacion inicial: Esta pendiente la carpeta indicada por el usuario
			carpetasPendientes.add(c);
			
			
			//Mientras queden carpetas pendientes de recorrer
			while(!carpetasPendientes.isEmpty()) {
				//Tomo la primera carpeta
				File carpeta = carpetasPendientes.get(0);
				carpetasPendientes.remove(0);
				
				
				//La recorremos
				File[] contenido = carpeta.listFiles();
				
				for(File f: contenido) {
					System.out.println(f.getName());
					if(f.isDirectory()) {
						//La añadimos a carpetas pendientes
						carpetasPendientes.add(f);
					}
				}
				
			}
			
			
		}
	}
}
