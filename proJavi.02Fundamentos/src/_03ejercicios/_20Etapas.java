package _03ejercicios;

import java.util.Scanner;

public class _20Etapas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Personas: ");
		int personas = tec.nextInt();
		
		int cont = 0;
		int inf = 0, pub = 0, ado = 0, adu = 0, vej = 0, anc = 0;
		
		while(cont < personas) {
			System.out.println("Edad " + (cont  + 1) + ": ");
			int edad = tec.nextInt();
			
			if (edad <= 10 ) inf = inf + 1;
			else if (edad <= 14 ) pub = pub + 1;
			else if (edad <= 21 ) ado = ado + 1;
			else if (edad <= 55 ) adu = adu + 1;
			else if (edad <= 70 ) vej = vej + 1;
			else anc = anc + 1;
			
			cont = cont + 1;
		}
		
		System.out.format("Infancia:     %5.2f %% %n", (100.0 * inf) / personas);
		System.out.format("Pubertad:     %5.2f %% %n", (100.0 * pub) / personas);
		System.out.format("Adolescencia: %5.2f %% %n", (100.0 * ado) / personas);
		System.out.format("Adultez:      %5.2f %% %n", (100.0 * adu) / personas);
		System.out.format("Vejez:        %5.2f %% %n", (100.0 * vej) / personas);
		System.out.format("Ancianidad:   %5.2f %% %n", (100.0 * anc) / personas);
	}
}
