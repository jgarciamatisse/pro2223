package _03ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _06ContarPalabras {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Nombre del fichero: ");
		String nombreFichero = tec.nextLine();
		
		//Para averiguar qué palabras contiene nos ayudamos de un Set
		Map<String,Integer> m = new LinkedHashMap<>();
		//Abrimos el fichero y lo leemos palabra a palabra
		Scanner f = null;
		try {
			f = new Scanner(new File(nombreFichero));
			while(f.hasNext()) {
				String palabra = tec.next();
				
				Integer veces = m.get(palabra);
				if(veces == null) {
					m.put(palabra, 1);
				} else {
					m.put(palabra, veces + 1);
				}
				//De otra forma ....
//				Integer veces = m.get(palabra);
//				if(veces == null) veces = 1;
//				else veces++;
//				
//				m.put(palabra, veces);
			}
			//Mostramos por pantalla el numero de veces de cada palabra
			for(String palabra: m.keySet()) {
				Integer veces = m.get(palabra);
				System.out.println(palabra + ": " + veces + " veces");
			}
			
			
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");
		} finally {
			if(f != null) {
				f.close();
			}
		}
		
		
	}

}
