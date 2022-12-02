package examen;

public class Ejercicio4 {
	
	public static double calcularNota(String[] respuestasCorrectas, String[] respuestasAlumno){
		int correctas = 0;
		int incorrectas = 0;
		for (int i = 0; i < respuestasAlumno.length; i++) {
			if(respuestasCorrectas[i].equals(respuestasAlumno[i])) {
				correctas ++;
			} else if(respuestasAlumno[i].equals(" ")) {
				//No hacer nada
			} else {
				incorrectas++;
			}
			
			//De otra forma
			correctas = 0;
			incorrectas = 0;
			if(respuestasCorrectas[i].equals(respuestasAlumno[i])) {
				correctas ++;
			}  else if(!respuestasAlumno[i].equals(" ")) {
				incorrectas++;
			}
			
		}
		double nota = correctas * (10.0 / respuestasCorrectas.length) -
						  incorrectas * (10.0 / respuestasCorrectas.length / 3) ;
			
		return Math.max(0, nota); //La nota no sera menor que 0
	}
	
	public static void main(String[] args) {
		//Test 1: 10 notas, todas correctas
		String[] notasCorrectasTest1 = {"A","A","A","B","B","B","C","C","C","C"};
		String[] notasDelAlumnoTest1 = {"A","A","A","B","B","B","C","C","C","C"};
		System.out.format("Test 1: Debe dar 10.00 y da %05.2f%n", calcularNota(notasCorrectasTest1, notasDelAlumnoTest1));
		
		//Test 2: 9 notas, 4 correctas, 3 incorrectas y 2 en blanco
		String[] notasCorrectasTest2 = {"A","A","B","B","B","C","C","C","C"};
		String[] notasDelAlumnoTest2 = {"A","A","B","B"," "," ","A","A","A"};
		System.out.format("Test 2: Debe dar 03.33 y da %05.2f%n", calcularNota(notasCorrectasTest2, notasDelAlumnoTest2));
		
		//Test 2: 5 notas, 1 correcta, 4 incorrectas 
		String[] notasCorrectasTest3 = {"A","A","B","B","B"};
		String[] notasDelAlumnoTest3 = {"A","C","C","C","C"};
		System.out.format("Test 3: Debe dar 00.00 y da %05.2f%n", calcularNota(notasCorrectasTest3, notasDelAlumnoTest3));
	}

}
