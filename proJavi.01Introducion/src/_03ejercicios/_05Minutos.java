package _03ejercicios;

import java.util.Scanner;

public class _05Minutos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Segundos: ");
		int seg = tec.nextInt();
		
		int min = seg / 60;
		seg = seg % 60;
		
		System.out.format("%d minutos y %d segundos", min, seg);

	}
}
