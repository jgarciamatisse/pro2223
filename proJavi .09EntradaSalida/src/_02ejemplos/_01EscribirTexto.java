package _02ejemplos;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class _01EscribirTexto {
	public static void main(String[] args) {
		//Para escribir texto en un fichero se utiliza la
		//clase PrintStream
		
		//Escribir en un fichero "numeros1a100.txt" los numeros 
		// del 1 al 100. Cada numero en una linea
		PrintStream f = null;
		try {
			//Si el fichero no existe, lo crea.
			//Si el fichero existe LO SOBREESCRIBE.
			f = new PrintStream ("numeros1a100.txt");
			
			for(int num = 1; num <= 100; num++) {
				//PrintStream es la clase a la que pertenece System.out
				//Por tanto tenemos los metodos print y prinln
				f.println(num);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error al abrir el fichero");
		} finally {
			if(f != null) {
				f.close();
			}
		}
	}
}
