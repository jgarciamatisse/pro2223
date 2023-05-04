package _03ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _07TraductorSimple {
	public static void main(String[] args) {
		// Crear un Map<String,String>
		Map<String, String> m = new HashMap<>();
		Scanner f = null;
		try {
			// Abrir el fichero palabras.txt, leer las parejas de palabras
			// y almacenarlas en el Map
			f = new Scanner(new File("palabras.txt"));
			while(f.hasNext()) {
				String cast = f.next();
				String ingl = f.nextLine().trim();
				m.put(cast, ingl);
			}

			// Leer de teclado una frase introducida por el usuario
			// Descomponer la frase en palabras
			Scanner tec = new Scanner(System.in);
			System.out.println("Frase: ");
			String frase = tec.nextLine();

			String[] palabras = frase.split(" ");

			// Traducir palabra a palabra y mostrar por pantalla.
			// Si de una palabra no tenemos traducción la dejamos
			// en castellano.
			for(String p: palabras) {
				//De esta forma hacemos dos búsquedas por cada palabra
//				if(!m.containsKey(p)) {
//					System.out.print(p + " "); //Muestro la palabra en castellano
//				} else {
//					System.out.print(m.get(p) + " "); //Muestro la palabra en ingles
//				}

				//De esta forma hacemos solo una búsqueda por cada palabra
				String traduccion = m.get(p);
				if(traduccion == null) {
					System.out.print(p + " "); //Muestro la palabra en castellano
				} else {
					System.out.print(traduccion + " "); //Muestro la palabra en ingles
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Fichero incorrecto");
		} finally {
			if(f!=null) {
				f.close();
			}
		}
	}
}
