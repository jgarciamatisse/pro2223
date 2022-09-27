package _03ejercicios;

import java.util.Scanner;

public class _06Horas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Segundos: ");
		int seg = tec.nextInt();
		
		int horas = seg / (60 * 60)/*3600*/;
		seg = seg % (60 * 60)/*3600*/;
		
		System.out.format("%d horas y %d segundos", horas, seg);

	}
}
