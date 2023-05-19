package _02ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class _06AnyadirUnFicheroAOtro2 {
	public static void main(String[] args) {
		//Añadir al fichero marcas.txt el contenido del fichero marcas2.txt
		Scanner fe = null;
		PrintStream fs = null;
		try {
			fe = new Scanner(new File("marcas2.txt"));
			fs = new PrintStream(new FileOutputStream(new File("marcas.txt"), true));
			while(fe.hasNext()) {
				String linea = fe.nextLine();
				fs.println(linea);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Error al abrir el fichero");
		} finally {
			if(fe != null) {
				fe.close();
			}
			if(fs != null) {
				fs.close();
			}
		}
		
	}
}
