package _02ejemplos;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class _08EscribirFicheroBinario {
	public static void main(String[] args) {
		// El usuario introduce nombre, edad y estatura
		// y la grabamos en un fichero binario

		try (DataOutputStream f = new DataOutputStream(new FileOutputStream("datospersonales.bin"))) {
			Scanner tec = new Scanner(System.in);
			String nombre;
			int edad;
			double estatura;
			do {
				System.out.println("Nombre: ");
				nombre = tec.nextLine();
				if (!nombre.isEmpty()) {
					System.out.println("Edad: ");
					edad = tec.nextInt();
					System.out.println("Estatura: ");
					estatura = tec.nextDouble();
					tec.nextLine();
					
					//Escribimos la info al fichero
					f.writeUTF(nombre);
					f.writeInt(edad);
					f.writeDouble(estatura);
				}
			} while (!nombre.isEmpty());
		} catch (FileNotFoundException e) {
			System.out.println("No se puede abrir el fichero");
		} catch (IOException e) {
			System.out.println("Error al cerrar el fichero");
		}
	}
}
