package _03ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _09Baloncesto {
	public static void main(String[] args) {
		List<String> listaFaltas = new ArrayList<>(Arrays.asList(
				"abel","luis","miguel","pablo","miguel",
				"luis", "pablo","pablo","pablo","pablo",
				"luis",	"luis", "luis"));
		
		Map<String, Integer> m = new HashMap<>();
		for(String jugador: listaFaltas) {
			Integer numFaltas = m.get(jugador);
			if(numFaltas == null) {
				m.put(jugador, 1);
			} else {
				numFaltas++;
				m.put(jugador, numFaltas);
				if(numFaltas == 5) {
					System.out.println("Expulsado " + jugador);
				}
			}
		}
		
	}
}
