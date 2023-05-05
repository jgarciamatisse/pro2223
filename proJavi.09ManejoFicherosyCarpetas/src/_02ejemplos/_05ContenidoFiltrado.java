package _02ejemplos;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Scanner;

public class _05ContenidoFiltrado {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Carpeta: ");
		String nombreCarpeta = tec.nextLine();
		File carpeta = new File(nombreCarpeta);
		if(carpeta.isDirectory()) {
			//Mostrar archivos de la carpeta indicada por el usuario
			//usando una clase FileFilter externa
			File[] archivos = carpeta.listFiles(new FiltroFicheros());
			System.out.println(Arrays.toString(archivos));
			
			//Mostrar archivos o carpetas cuyo nombre empiece por "e"
			//usando una clase FileFilter interna
			File[] empiezaPorE = carpeta.listFiles(new FiltroE());
			System.out.println(Arrays.toString(empiezaPorE));
			
			//Mostrar solo carpetas 
			//usando una clase FileFilter creada al vuelo (anonima)
			File[] subcarpetas  = carpeta.listFiles(new FileFilter() {
				@Override
				public boolean accept(File f) {
					return f.isDirectory();
				}
			});
			System.out.println(Arrays.toString(subcarpetas));
			
			//Mostrar contenido cuyo nombre contenga "N"
			File[] conN = carpeta.listFiles((f)-> {
				return f.getName().toUpperCase().indexOf("N")!= -1;
//				if(f.getName().toUpperCase().indexOf("N")!= -1;) return true;
//				else return false;
			});
			System.out.println(Arrays.toString(conN));
			
			//Mostrar carpetas cuyo nombre tenga 10 o mas caracteres 
			
			
		} else {
			System.out.println("La carpeta no existe");
		}
		
	}
}
class FiltroE implements FileFilter {
	@Override
	public boolean accept(File f) {
		if(f.getName().toUpperCase().startsWith("E")) return true;
		else return false;
	}
	
}
