package _03ejercicios;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class _06TamanyoTotalCarpeta {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Carpeta: ");
		String nombreCarpeta = tec.nextLine();
		
		File c = new File(nombreCarpeta);
		if(!c.isDirectory()) {
			System.out.println("No existe o no es una carpeta");
		} else {
			long total = 0;
			LinkedList<File> pendiente = new LinkedList<>();
			pendiente.add(c);
			
			while(!pendiente.isEmpty()) {
				File carpeta = pendiente.remove(0);
				File[] contenido = carpeta.listFiles();
				for(File f: contenido) {
					if(f.isFile()) total += f.length();
					else if(f.isDirectory()) pendiente.add(f);
				}
			}
			System.out.println("Total: " + total);
		}
		
	}
}
