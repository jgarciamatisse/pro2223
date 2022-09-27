package _03ejercicios;

import java.util.Scanner;

public class _10Segundos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int d,h,m,s;
		
		System.out.println("Segundos: ");
		s = tec.nextInt();
		System.out.println(s + " segundos son: " );
		
		//dias
		d = s / 86400;
		s = s % 86400;
		
		//horas
		h = s / 3600;
		s = s % 3600;
		
		//minutos
		m = s / 60;
		s = s % 60;
		
		System.out.println(d + " dias");
		System.out.println(h + " horas");
		System.out.println(m + " minutos");
		System.out.println(s + " segundos");

		
	}
}
