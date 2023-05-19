package _02ejemplos;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _09LeerFicheroBinario {
	public static void main(String[] args) {
		//Leemos el fichero datospersonales.bin y lo mostramos por pantalla
		try(DataInputStream f = new DataInputStream (new FileInputStream("datospersonales.bin"))){
			while(true) {
				String nombre = f.readUTF();
				double estatura = f.readDouble();
				int edad = f.readInt();
				
				System.out.println(nombre + " - " + edad + " - " + estatura);
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo abrir el fichero");
		} catch (EOFException e) {
			//Se ha terminado el fichero
		} catch (IOException e) {
			System.out.println("Error al cerrar el fichero");
		}
		
	}

}
