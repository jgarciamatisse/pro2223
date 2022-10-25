package _03ejercicios;

import java.util.Scanner;

public class _13Taxi {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("DIA o NOCHE: ");
		String dn = tec.next();

		System.out.println("Dia de la semana (1 a 7): ");
		int ds = tec.nextInt();
		
		System.out.println("Km recorridos: ");
		int km = tec.nextInt();
		
		double coste1 = km * 0.73;
		double coste2 = km * 0.84;
		double coste3 = km * 0.93;
				
		
		double coste;
		if(ds < 7) { //lunes a sabado
			if(dn.equalsIgnoreCase("DIA")) {
				coste = km * 0.73 ;
			} else {
				coste = km * 0.84;
			}
		} else { //domingos
			coste = km * 0.93;
		}

		//Aplicar coste minimo del trayecto
		if(dn.equalsIgnoreCase("DIA")) {
			//Usando math.max
			coste = Math.max(2.95, coste);
		} else {
			//Usando if
			if(coste < 4) {
				coste = 4;
			}
		}

		System.out.println("Coste trayecto: " + coste);
	}

}


