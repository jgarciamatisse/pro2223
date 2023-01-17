package ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
	final static int N = 3;

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		ArrayList<String> contrasenyas = new ArrayList<>(Arrays.asList("aaa"));
		while (true) {
			System.out.println("Indica contraseña actual y dos veces la nueva: ");
			String actual = tec.next();
			String nueva1 = tec.next();
			String nueva2 = tec.next();
			cambiarContrasenya(contrasenyas, actual, nueva1, nueva2);
		}

	}

	public static void cambiarContrasenya(ArrayList<String> contrasenyas, String actual, String nueva1, String nueva2) {
		if(!nueva1.equals(nueva2)) {
			System.out.println("Las dos versiones de la nueva contraseña tienen que coincidir");
		} else {
			String ultima = contrasenyas.get(contrasenyas.size()-1);
			if(!actual.equals(ultima)) {
				System.out.println("La contraseña indicada es incorrecta");
			} else if (contrasenyas.contains(nueva1)){
				System.out.println("La contraseña se ha usado recientemente");
			} else {
				//Todo correcto. Actualizamos la contraseña
				contrasenyas.add(nueva1); //La añadimos al final de la lista
				//Dejar N contraseñas almacenadas como máximo
				if(contrasenyas.size() > N) {
					contrasenyas.remove(0);
				}
				System.out.println("Contraseña cambiada correctamente");
			}
		}
		

	}

}
