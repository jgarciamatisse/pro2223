package _03ejerciciosInterfacesYGenericidad._03publicaciones;

import java.util.ArrayList;

public class TestPublicaciones {
	public static void main(String[] args) {
		ArrayList<Publicacion> misPublicaciones = new ArrayList<>();
		misPublicaciones.add(new Libro("a1", "Introduccion java", 2020));
		misPublicaciones.add(new Dvd("a2", "Consejos programación", 2020, 60));
		//Con la siguiente revista se produciría ERROR DE EJECUCIÓN al hacer el casting
		// a prestable
		//misPublicaciones.add(new Revista("r1","National geographic",2021,1));

		// Recorrido que muestra los títulos
		for (Publicacion p : misPublicaciones) {
			System.out.println(p.getTitulo());
		}

		// Recorrido que cuente cuantos están prestados
		int cont = 0;
		for (Publicacion p : misPublicaciones) {
			if (((Prestable)p).getPrestado() /* == true */ ) {
				cont++;
			}
		}
		System.out.println("Prestadas: " + cont);

		// Otra alternativa -------------------------
		ArrayList<Prestable> misPrestables = new ArrayList<>();
		misPrestables.add(new Libro("a1", "Introduccion java", 2020));
		misPrestables.add(new Dvd("a2", "Consejos programación", 2020, 60));
		//Con la siguiente revista se producirá ERROR DE COMPILACIÓN
		//porque la lista solo admite objetos Prestables
		//misPrestables.add(new Revista("r1","National geographic",2021,1));


		// Recorrido que muestra los títulos
		for (Prestable p : misPrestables) {
			System.out.println(((Publicacion)p).getTitulo());
		}

		// Recorrido que cuente cuantos están prestados
		cont = 0;
		for (Prestable p : misPrestables) {
			if (p.getPrestado() /* == true */ ) {
				cont++;
			}
		}
		System.out.println("Prestadas: " + cont);
	}
}
