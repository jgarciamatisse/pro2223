package _03ejercicios;

import java.util.Scanner;

public class _18Hora12 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Hora");
		int hora = tec.nextInt();

		System.out.println("Minuto: ");
		int min = tec.nextInt();
		
		if(hora == 0) {
			System.out.format("Son las %02d horas y %02d minutos AM", 12, min);
		} else if(hora < 12) {
			System.out.format("Son las %02d horas y %02d minutos AM", hora, min);
		} else if (hora == 12) {
			System.out.format("Son las %02d horas y %02d minutos PM", 12, min);
		} else {
			System.out.format("Son las %02d horas y %02d minutos PM", hora - 12, min);
		}
		
	}

}
