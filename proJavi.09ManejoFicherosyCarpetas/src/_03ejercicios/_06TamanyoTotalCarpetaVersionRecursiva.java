package _03ejercicios;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class _06TamanyoTotalCarpetaVersionRecursiva {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Carpeta: ");
		String nombreCarpeta = tec.nextLine();
		
		File c = new File(nombreCarpeta);
		if(!c.isDirectory()) {
			System.out.println("No existe o no es una carpeta");
		} else {
			System.out.println("Total: " + tamanyoCarpeta(c));
		}
	}
	public static double tamanyoCarpeta(File c) {
		double total = 0;
		File[] contenido = c.listFiles();
		for(File f: contenido) {
			if(f.isFile()) total += f.length();
			else if (f.isDirectory()) total += tamanyoCarpeta(f);
		}
		return total;
	}
}
