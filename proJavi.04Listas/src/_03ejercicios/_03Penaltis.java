package _03ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class _03Penaltis {
	public static void main(String[] args) {
		ArrayList<String> nombres = new ArrayList<>(Arrays.asList("pepe","pablo","luis"));
		ultimoEnTirar(nombres, 2,1);
	}
	private static void ultimoEnTirar(ArrayList<String> nombres, int b, int p) {
		int lanzamientos = 0;
		while(b > 0) {
			//El primer jugador lanza penalti y se va al final de la lista
			String j = nombres.remove(0); //Elimina y devuelve lo eliminado
			nombres.add(j);
			// o bien ....
			//String j = nombres.get(0);
			//nombres.remove(0);
			//nombres.add(j)
			
			lanzamientos ++;
			if(lanzamientos % p == 0) {
				b --;
			}
		}
		System.out.println("Ultimo lanzador: " + nombres.get(nombres.size()-1));
	}
}
