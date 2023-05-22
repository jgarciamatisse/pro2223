package _03ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class _01Notas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int numNotas = 0;
		File f = new File("notas.txt");
		if(f.isFile()) {
			try(Scanner fe = new Scanner(f)){
				while(fe.hasNextInt()) {
					fe.nextInt();
					numNotas ++;
				}
			} catch (FileNotFoundException e) {
				System.out.println("No se puede abrir el fichero");
			}
		}
		
		boolean append = true;
		boolean terminar = false;
		if(numNotas == 20) {
			System.out.println("Ya tienes 20 notas, quieres volver a empezar (S/N)? ");
			String respuesta = tec.next();
			if(respuesta.equalsIgnoreCase("S")) {
				append = false;
				numNotas = 0;
			} else {
				terminar = true;
			}
		}
		
		if(!terminar) {
			
			try(PrintStream fs = new PrintStream(new FileOutputStream (f,append))){
				int nota;
				do {
					
					System.out.println("Nota " + (numNotas + 1) + ": ");
					nota = tec.nextInt();
					if(nota >= 0 && nota <= 10) {
						fs.println(nota);
						numNotas++;
					}
					
				} while (nota >= 0 && nota <= 10 && numNotas < 20);
			} catch (FileNotFoundException e) {
				System.out.println("No se pudo abrir el fichero");
			}
		}
		
	}
}
