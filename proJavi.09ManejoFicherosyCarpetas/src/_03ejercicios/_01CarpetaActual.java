package _03ejercicios;

import java.io.File;
import java.io.IOException;

public class _01CarpetaActual {
	public static void main(String[] args) {
		try {
			File f1 = new File(".");
			System.out.println(f1.getCanonicalPath());
		
		} catch (IOException e) {
			System.out.println("Error");
		}
	}
}
