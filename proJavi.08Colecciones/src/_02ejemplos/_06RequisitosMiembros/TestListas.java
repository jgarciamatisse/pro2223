package _02ejemplos._06RequisitosMiembros;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListas {
	public static void main(String[] args) {
		//Las listas tienen que tener implementado metodo equals
		//De lo contrario algunos métodos no funcionan bien
		ArrayList<Alumno> alumnos = new ArrayList<>(Arrays.asList(
				new Alumno("1","a"),
				new Alumno("2","b"),
				new Alumno("3","c")
		));
		
		System.out.println(alumnos.contains(new Alumno("1","a")));
		System.out.println(alumnos.indexOf(new Alumno("1","a")));
		
		//Si hacemos lo mismo con la clase Profesor, que tiene método equals reescrito,
		// el funcionamiento será correcto
		ArrayList<Profesor> profes = new ArrayList<>(Arrays.asList(
				new Profesor("1","a"),
				new Profesor("2","b"),
				new Profesor("3","c")
		));
		
		System.out.println(profes.contains(new Profesor("1","a")));
		System.out.println(profes.indexOf(new Profesor("1","a")));	
		
	}
}
