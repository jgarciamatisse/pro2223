package _02ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _03LeerSoloEdades {
	public static void main(String[] args) {
		Scanner f = null;
		try {
			f = new Scanner(new File("datospersonales.txt"));
			//Calcular la media de las edades que hay en el fichero
			int suma = 0;
			int cont = 0;
			while(f.hasNext()) {
				if(f.hasNextInt()) {
					suma += f.nextInt();
					cont++;
				} else {
					//Leemos la linea y la desechamos
					f.nextLine();
				}
			}
			System.out.println("Media: " + (double)suma / cont);
			
		} catch (FileNotFoundException e) {
			System.out.println("No se puede abrir el fichero");
		} finally {
			if(f != null) {
				f.close();
			}
		}
	}

}
