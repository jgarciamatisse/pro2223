package ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		ArrayList<Alumno> alumnos = new ArrayList<>();
		try (
				Scanner fe = new Scanner(new File("evaluaciones.txt")); 
				PrintWriter fs = new PrintWriter("notas.txt");) {
			while (fe.hasNext()) {
				String nombre = fe.nextLine();
				double ev1 = fe.nextDouble();
				double ev2 = fe.nextDouble();
				double faltas = fe.nextInt();
				fe.nextLine();
				double nota = (ev1 + ev2) / 2 - (0.1 * faltas);
				if (nota < 0) nota = 0;

				fs.println(nombre + " " + nota);
				alumnos.add(new Alumno(nombre, nota));

			}
		} catch (FileNotFoundException e) {
			System.out.println("No se puee abrir el fichero");
		}

		Collections.sort(alumnos);
		//O bien ordenar con un Comparator
		Collections.sort(alumnos,(a1,a2)->{
			if(a1.getNota() < a2.getNota()) return -1;
			else if(a1.getNota() > a2.getNota()) return 1;
			else return a1.getNombre().compareTo(a2.getNombre());
		});
		//-----------
		
		try (PrintWriter fs = new PrintWriter("notasOrdenadas.txt")) {
			for (Alumno a : alumnos) {
				fs.println(a.getNombre() + " " + a.getNota());
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se puede abrir fichero");
		}
	}
}
