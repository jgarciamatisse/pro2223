package ejercicio5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Ejercicio5 {
	public static void main(String[] args) {
		ArrayList<Alumno> alumnos = new ArrayList<>(Arrays.asList(
				new Alumno("pepe","1dam",20),
				new Alumno("rosa","2dam",21),
				new Alumno("luis","1dam",21),
				new Alumno("sole","1dam",22),
				new Alumno("jose","1smr",23),
				new Alumno("mara","1smr",24),
				new Alumno("sara","2smr",25),
				new Alumno("pere","1vdj",25)
		));
		
		Map<String, Integer> m = Utiles.mapear(alumnos, (a)-> a.getGrupo());
		System.out.println(m);
		
		Map<String, Integer> m2 = Utiles.mapear(alumnos, new Selector<Alumno>() {

			@Override
			public String seleccionar(Alumno elemento) {
				return elemento.getGrupo();
			}
			
		});
		System.out.println(m2);
	}
}








