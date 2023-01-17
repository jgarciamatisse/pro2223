package _03ejercicios;

public class _15Notas {
	public static void main(String[] args) {
		int[][] notas = { { 5, 3, 6, 8, 2 }, { 9, 9, 9, 8, 4 }, { 3, 4, 4, 2, 1 } };
		imprimirPorAlumno(notas);
		System.out.println("=====");
		imprimirPorAsignatura(notas);
		System.out.println("=====");
		mediaAlumnos(notas);
		System.out.println("=====");
		mediaAsig(notas);
		System.out.println("=====");
		asigMasFacil(notas);
		
	}

	public static void imprimirPorAlumno(int[][] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.println("Alumno " + (i + 1));
			for (int j = 0; j < n[0].length; j++) {
				System.out.println("  Asign. " + (j + 1) + ": " + n[i][j]);
			}
		}
	}

	public static void imprimirPorAsignatura(int[][] n) {
		for (int j = 0; j < n[0].length; j++) {
			System.out.println("Asignatura " + (j + 1));
			for (int i = 0; i < n.length; i++) {
				System.out.println("  Alumno " + (i + 1) + ": " + n[i][j]);
			}
		}
	}

	public static void mediaAlumnos(int[][] n) {
		// Con cada alumno ....
		for (int i = 0; i < n.length; i++) {
			// Calcular media del alumno i
			int suma = 0;
			for (int j = 0; j < n[0].length; j++) {
				suma += n[i][j];
			}
			System.out.format("Media alu. %d: %5.2f %n", i + 1, (double) suma / n[0].length);
		}
	}
	
	public static void mediaAsig(int[][] n) {
		// Con cada asignatura ...
		for (int j = 0; j < n[0].length; j++) {
			// Calcular la media de la asgnt. j
			int suma = 0;
			for (int i = 0; i < n.length; i++) {
				suma += n[i][j];
			}
			System.out.format("Media asig. %d: %5.2f %n", j + 1, (double) suma / n.length);
		}
	}

	public static void asigMasFacil(int[][] n) {
		double mediaMasAlta = -1;
		int masFacil = -1;
		// Con cada asignatura ...
		for (int j = 0; j < n[0].length; j++) {
			// Calcular la media de la asgnt. j
			int suma = 0;
			for (int i = 0; i < n.length; i++) {
				suma += n[i][j];
			}
			double media = (double)suma / n.length;
			if(media > mediaMasAlta) {
				mediaMasAlta = media;
				masFacil = j;
			}
		}
		System.out.println("Asignatura mas facil: " + (masFacil + 1));
	}
	
	public static boolean alguienSuspendeTodo(int[][] n) {
		//Busqueda por filas
		boolean alguienSuspTodo = false;
		for (int i = 0; i < n.length && !alguienSuspTodo; i++) {
			//Comprobar si el alumno i suspende todas las asignaturas
			boolean algoAprobado = false;
			for (int j = 0; j < n[0].length && !algoAprobado; j++) {
				if(n[i][j] >= 5) {
					algoAprobado = true;
				}
			}
			if(!algoAprobado) {
				alguienSuspTodo = true;
			}
		}
//		if(alguienSuspTodo) return true;
//		else return false;
		return alguienSuspTodo;
	}
}
