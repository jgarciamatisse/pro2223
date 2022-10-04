package _03ejercicios;

import java.util.Scanner;

public class _20Salario {
	//Constantes
	final static int JORNADAORDINARIA = 40;
	final static double PRECIO_ORD = 6;
	final static double PRECIO_EXT = 10;
	final static double LIMITE_IMPUESTO = 350;
	final static double IMPUESTO_ALTO = 0.9;
	final static double IMPUESTO_BAJO = 0.98;
	
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Horas trabajadas: ");
		int horas = tec.nextInt();
		
		double importeConExtras = 40 * 6 - (horas - 40) * 10;
		double importeSinExtras = horas * 6;


		
		//Separar horas ordinarias y extraordinarias
		int hordinarias, hextra;
		if(horas > JORNADAORDINARIA) {
			hordinarias = JORNADAORDINARIA;
			hextra = horas - JORNADAORDINARIA;
		} else {
			hordinarias = horas;
			hextra = 0;
		}
			
		//Calcular salario bruto
		double sBruto = hordinarias * PRECIO_ORD + hextra * PRECIO_EXT;
			
		//Calcular salario neto.
		double sNeto;
		if(sBruto > LIMITE_IMPUESTO) {
			sNeto = sBruto * IMPUESTO_ALTO;
			//sNeto = sBruto - sBruto * 10 / 100;
		} else {
			sNeto = sBruto * IMPUESTO_BAJO;
			//sNeto = sBruto - sBruto * 2 / 100;
		}
		
		System.out.println("Salario neto: " + sNeto);
	}
}
