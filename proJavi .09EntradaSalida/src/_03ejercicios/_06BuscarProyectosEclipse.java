package _03ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFileChooser;

public class _06BuscarProyectosEclipse {
	public static void main(String[] args) {
		JFileChooser chooser = new JFileChooser(".");
		chooser.setDialogTitle("Selecciona carpeta");
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		//
		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			try (PrintWriter salida = new PrintWriter(new File("proyectos.txt"))) {
				buscarProyectos2(chooser.getSelectedFile(),salida);
			} catch (FileNotFoundException e) {
				System.out.println("No se puede crear el fichero");
			}
		}

	}

	// Versión recursiva
	public static void buscarProyectos(File carpeta, PrintWriter salida) {
		if (esProyectoEclipse(carpeta)) {
			salida.println(carpeta);
		} else {
			// Obtenemos las subcarpetas
			File[] subcarpetas = carpeta.listFiles(f -> f.isDirectory());
			// Buscamos proyectos en las subcarpetas
			for (File c : subcarpetas) {
				buscarProyectos(c,salida);
			}
		}
	}

	// Versión iterativa
	public static void buscarProyectos2(File carpeta, PrintWriter salida) {
		List<File> pendientes = new LinkedList<>();
		pendientes.add(carpeta);
		while (!pendientes.isEmpty()) {
			File actual = pendientes.remove(0);
			if (esProyectoEclipse(actual)) {
				salida.println(actual);
			} else {
				// Obtenemos las subcarpetas
				File[] subcarpetas = actual.listFiles(f -> f.isDirectory());
				// Buscamos proyectos en las subcarpetas
				for (File c : subcarpetas) {
					pendientes.add(c);
				}
			}
		}
	}

	/**
	 * Devuelve si f es un proyecto de eclipse o no. Es decir, una carpeta que
	 * contiene los tres elementos característicos de un proyecto
	 * 
	 * @param f
	 * @return
	 */
	private static boolean esProyectoEclipse(File f) {
		return f.isDirectory() && 
				new File(f, ".classpath").isFile() 	&& 
				new File(f, ".project").isFile() && 
				new File(f, ".settings").isDirectory();

	}
}
