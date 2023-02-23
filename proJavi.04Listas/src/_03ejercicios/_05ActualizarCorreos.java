package _03ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class _05ActualizarCorreos {
	public static void main(String[] args) {
		ArrayList<String> pasado = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
		ArrayList<String> actual = new ArrayList<>(Arrays.asList("b","c","d","f","g"));
		
		//Correos que hay que eliminar: Los que estaban el pasado y no están el actual
		for(String alu: pasado) {
			if(!actual.contains(alu)) {
				System.out.println("Eliminar cuenta de " + alu);
			}
		}
		
		//Correos que hay que eliminar: Los que estaban el pasado y no están el actual
		for(String alu: actual) {
			if(!pasado.contains(alu)) {
				System.out.println("Crear cuenta de " + alu);
			}
		}
		
	}
}
