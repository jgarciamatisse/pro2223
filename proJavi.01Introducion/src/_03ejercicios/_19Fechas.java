package _03ejercicios;

import java.util.Scanner;

public class _19Fechas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Fecha 1: dia mes año");
		int d1 = tec.nextInt();
		int m1 = tec.nextInt();
		int a1 = tec.nextInt();

		System.out.println("Fecha 2: dia mes año");
		int d2 = tec.nextInt();
		int m2 = tec.nextInt();
		int a2 = tec.nextInt();
		
		if(a1 < a2) {
			System.out.format("%02d/%02d/%04d", d1, m1, a1);
		} else if(a2 < a1) {
			System.out.format("%02d/%02d/%04d", d2, m2, a2);
		} else if(m1 < m2) {
			System.out.format("%02d/%02d/%04d", d1, m1, a1);
		} else if(m2 < m1) {
			System.out.format("%02d/%02d/%04d", d2, m2, a2);
		} else if(d1 < d2) {
			System.out.format("%02d/%02d/%04d", d1, m1, a1);
		} else if(d2 < d1) {
			System.out.format("%02d/%02d/%04d", d2, m2, a2);
		} else {
			System.out.println("Las fechas son iguales");
		}
		
		
		// De otra forma 
		int diasFecha1 = a1 * 366 + m1 * 31 + d1;
		int diasFecha2 = a2 * 366 + m2 * 31  + d2;
		if(diasFecha1 < diasFecha2) {
			System.out.format("%02d/%02d/%04d", d1, m1, a1);
		} else if(diasFecha2 < diasFecha1) {
			System.out.format("%02d/%02d/%04d", d2, m2, a2);
		} else {
			System.out.println("Las fechas son iguales");
		}
		
		
	}

}

