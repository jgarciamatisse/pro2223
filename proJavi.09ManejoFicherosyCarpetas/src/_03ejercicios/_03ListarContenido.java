package _03ejercicios;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class _03ListarContenido {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Carpeta: ");
		String nombreCarpeta = tec.nextLine();
		
		File c = new File(nombreCarpeta);
		if(!c.isDirectory()) {
			System.out.println("No existe o no es una carpeta");
		} else {
			
			File[] contenido = c.listFiles();
			//Ordenamos por nombre del archivo o carpeta
			Arrays.sort(contenido, (f1,f2) -> {
				if(f1.getName().compareTo(f2.getName()) < 0) return -1;
				else if(f1.getName().compareTo(f2.getName()) > 0) return 1;
				else return 0;
				//return f1.compareTo(f2);
			} );
			
			//Otra ordenacion: Primero las carpetas alfabéticamente y luego los archivos
			// alfabéticamente
			Arrays.sort(contenido, (f1,f2) -> {
				if(f1.isDirectory() && !f2.isDirectory()) return -1;
				else if(f2.isDirectory() && !f1.isDirectory()) return 1;
				else return f1.compareTo(f2); //Los dos son ficheros o son carpetas
			} );
			
			
			for(File f: contenido) {
				if(f.isFile()) {
					System.out.println(f.getName() + " - " + f.length() + " bytes");
				} else if (f.isDirectory()){
					System.out.println(f.getName());
				}
			}
		}
		
	}
}
