package _02ejemplos._03ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _05DatosMezclados {
	public static void main(String[] args) {
		try (Scanner f = new Scanner(new File("datosmezclados.txt"))) {
			int suma = 0;
			int cont = 0;
			while(f.hasNext()) {
				if(f.hasNextInt()) {
					suma += f.nextInt();
					cont ++;
				}
			}
			System.out.println("Media: " + (double) suma / cont);
		} catch (FileNotFoundException e) {
			
		}
	}
}
