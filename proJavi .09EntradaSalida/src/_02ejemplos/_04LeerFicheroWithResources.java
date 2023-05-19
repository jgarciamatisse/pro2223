package _02ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _04LeerFicheroWithResources {
	public static void main(String[] args) {
		try(Scanner f = new Scanner(new File("numeros1a100.txt"))) {
			int suma = 0;
			while(f.hasNextInt()) {
				suma += f.nextInt();
			}
			System.out.println("Suma: " + suma);
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo abrir el fichero");
		}
	}
}
