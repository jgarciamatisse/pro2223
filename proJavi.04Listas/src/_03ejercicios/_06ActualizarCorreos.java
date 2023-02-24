package _03ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _06ActualizarCorreos {
	public static void main(String[] args) {
		ArrayList<String> actual = new ArrayList<>(Arrays.asList("b","c","d","f","g","h"));
		ArrayList<String> correos = new ArrayList<>(Arrays.asList(
				"a@ieshenrimatisse.es",
				"b@ieshenrimatisse.es",
				"c@ieshenrimatisse.es",
				"d@ieshenrimatisse.es",
				"e@ieshenrimatisse.es",
				"f@ieshenrimatisse.es"
		));
	
		//Se pide actualizar la lista correos
		
		//Eliminar correos cuyo usuario no este en actual
		Iterator<String> it  = correos.iterator();
		while (it.hasNext()) {
			String cuenta = it.next();
			String usuario = cuenta.substring(0,cuenta.indexOf("@"));
			if(!actual.contains(usuario)) {
				it.remove();
			}
		}
		
		//Añadir los correos de los usuarios de actual que no estén en correos
		for(String usuario: actual) {
			String email = usuario +"@ieshenrimatisse.es";
			if(!correos.contains(email)) {
				correos.add(email);
			}
		}
		
		//Mostramos la lista actualizada
		System.out.println(correos);
		
		
	}
}
