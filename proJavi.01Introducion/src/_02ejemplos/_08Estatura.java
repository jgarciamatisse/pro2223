package _02ejemplos;

import java.util.Scanner;

public class _08Estatura {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double est = tec.nextDouble();

		if (est > 2)
			System.out.println("Muy alto");
		else if (est > 1.7)
			System.out.println("Alto");
		else if (est > 1.6)
			System.out.println("Estatura media");
		else
			System.out.println("Bajo");

	}
}
