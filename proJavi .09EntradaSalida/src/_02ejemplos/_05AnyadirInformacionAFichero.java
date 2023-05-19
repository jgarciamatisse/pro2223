package _02ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class _05AnyadirInformacionAFichero {
	public static void main(String[] args) {
		try(PrintStream f = new PrintStream(new FileOutputStream(new File("nombres.txt"), false));) {
			Scanner tec = new Scanner(System.in);
			System.out.println("Nombre: ");
			String nombre = tec.nextLine();

			//Añadimos el nombre al fichero
			f.println(nombre);
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo abrir el fichero");
		} 
		
		
	}
}
