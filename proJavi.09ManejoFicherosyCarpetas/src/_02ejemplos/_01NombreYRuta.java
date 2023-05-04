package _02ejemplos;

import java.io.File;
import java.io.IOException;

public class _01NombreYRuta {
	public static void main(String[] args) {
		//Este objeto file representa al fichero 
		//cuyo nombre es "examen.pdf" ubicado
		//en la carpeta del proyecto.
		
		File f1 = new File("examen.pdf");
		System.out.println("getName(): " + f1.getName());
		System.out.println("getPath(): " + f1.getPath());
		System.out.println("getAbsolutePath(): " + f1.getAbsolutePath());
		System.out.println("getParent(): " + f1.getParent());
		
		File f2 = new File("facturas/factura.xls");
		System.out.println("getName(): " + f2.getName());
		System.out.println("getPath(): " + f2.getPath());
		System.out.println("getAbsolutePath(): " + f2.getAbsolutePath());
		System.out.println("getParent(): " + f2.getParent());
		
		File f3 = new File("facturas/../facturas/factura.xls");
		System.out.println("getName(): " + f3.getName());
		System.out.println("getPath(): " + f3.getPath());
		System.out.println("getAbsolutePath(): " + f3.getAbsolutePath());
		System.out.println("getParent(): " + f3.getParent());
		
		//Los métodos anteriores son dependientes de la forma que tenía el String
		//con el que se ha creado el objeto File
		
		//CanonicalPath, en cambio, se apoya en el Sistema Operativo para averiguar
		//la informacion
		try {
			System.out.println("getCanonicalPath(): " + f1.getCanonicalPath());
			System.out.println("getCanonicalPath(): " + f2.getCanonicalPath());
			System.out.println("getCanonicalPath(): " + f3.getCanonicalPath());
		} catch (IOException e) {
			System.out.println("Se ha producido un error inesperado");
		}
		
		
		
	}
}
