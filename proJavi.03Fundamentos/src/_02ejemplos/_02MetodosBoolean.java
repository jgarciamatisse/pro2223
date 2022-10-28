package _02ejemplos;

import java.util.Scanner;

public class _02MetodosBoolean {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Dia de la semana (1-7): ");
		int dia = tec.nextInt();
		//Como condición, se puede poner una llamada a un método que 
		//devuelve un boolean
		if(esLectivo(dia)) {
			System.out.println("Hoy hay clase");
		} else {
			System.out.println("No hay clase");
		}
	}
	/**
	 * Devuelve si un dia de la semana es o no lectivo
	 * @param diaSemana numero entre 1(lunes) y 7(domingo)
	 * @return true si el dia es lectivo y false si no lo es
	 */
	public static boolean esLectivo(int diaSemana) {
		boolean lectivo;
		if(diaSemana == 6) {
			lectivo = false;
		} else if(diaSemana == 7) {
			lectivo = false;
		} else {
			lectivo = true;
		}
		return lectivo;
	}
	
}
