package _02ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _02LeerTexto {
	// La lectura de ficheros de texto se puede hacer usando
	// la clase Scanner. Esta permite transformar textos en
	// tipos int (nextInt()), double (nextDouble()), etc ...
	public static void main(String[] args) {
		Scanner f = null;
		try {
			// Si el fichero existe, lo abre y se posiciona al
			// comienzo del fichero para leer de el
			// Si el fichero no existe o no tenemos permisos para abrirlo,
			// se produce excepcion
			f = new Scanner(new File("numeros1a100.txt"));
			
			//Leer los numeros del fichero y sumarlos
			int total = 0;
			while(f.hasNext()) {
				int n = f.nextInt();
				total += n;
			}
			System.out.println(total);

		} catch (FileNotFoundException e) {
			System.out.println("No se pudo abrir el fichero");
		} finally {
			if (f != null) {
				f.close();
			}
		}

	}
}
