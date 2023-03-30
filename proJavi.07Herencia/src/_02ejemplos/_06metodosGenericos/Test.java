package _02ejemplos._06metodosGenericos;

import _02ejemplos._05interfaceGenerico.Alumno;
import _02ejemplos._05interfaceGenerico.Profesor;

public class Test {
	public static void main(String[] args) {
		Profesor[] profesores = {new Profesor("1","a"), new Profesor("2","b")};
		Alumno[] alumnos = {new Alumno("1","a"), new Alumno("2","b")};
		
		Object[] personas = {new Profesor("2","b"),new Alumno("1","a")};
		
		System.out.println(Utiles.minimo(alumnos));
		System.out.println(Utiles.minimo(profesores));

		System.out.println(Utiles.maximo(alumnos));
		System.out.println(Utiles.maximo(profesores));
		
		//Este dará error de ejecucion
		System.out.println(Utiles.minimo(personas));
		
		//Este, de compilacion
		//System.out.println(Utiles.maximo(personas));
		
		
	}
}
