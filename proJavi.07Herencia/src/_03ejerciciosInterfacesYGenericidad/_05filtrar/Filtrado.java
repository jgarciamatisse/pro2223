package _03ejerciciosInterfacesYGenericidad._05filtrar;

import java.util.ArrayList;
import java.util.function.Predicate;

import _03ejerciciosInterfacesYGenericidad._03publicaciones.Publicacion;

public class Filtrado {
	public static void main(String[] args) {
		//Crear lista con publicaciones
		
		
		//Usando el método mostrar ....
		//Mostrar las publicaciones cuyo código de publicación es par.
		//Mostrar las publicaciones cuyo título tiene una longitud mayor que 5
		//Mostrar las publicaciones del año actual
		//Mostrar las publicaciones cuyo año está entre 2000 y 2005 y cuyo título contiene la palabra “casa”.
		//Mostrar las publicaciones que son libros
		
	}

	public static <T> void mostrar(ArrayList<T> l, Predicate<T> p) {
		for(T elemento: l) {
			if(p.test(elemento)) {
				System.out.println(elemento);
			}
		}
	}
}
