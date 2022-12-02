package examen;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.print("Temperatura: ");
		double temp = tec.nextDouble();
		
		System.out.print("Invierno o verano?: ");
		String estacion = tec.next().toUpperCase();
		
		if (estacion.equals("INVIERNO")) {
			System.out.print("Dia o noche?: ");
			String hora = tec.next().toUpperCase();
			
			if (hora.equals("DIA")) {
				if (temp > 21) {
					System.out.format("La temperatura es demasiado alta. Bajela %5.2f grados. "
							+ "Con ello ahorrará un %5.2f %% en su factura de electricidad%n",temp - 21, (temp - 21) * 3);
				} else {
					System.out.println("La termperatura es adecuada");
				}
			} else if (hora.equals("NOCHE")) {
				if (temp > 17) {
					System.out.format("La temperatura es demasiado alta. Bajela %5.2f grados. "
							+ "Con ello ahorrará un %5.2f %% en su factura de electricidad%n", temp - 17, (temp - 17) * 3);
				} else {
					System.out.println("La termperatura es adecuada");
				}
			} else {
				System.out.println("Datos incorrectos");
			}
		} else if (estacion.equals("VERANO")) { // Verano
			if (temp < 25) {
				System.out.format("La temperatura es demasiado baja. Subala %5.2f grados. "
						+ "Con ello ahorrará un %5.2f %% en su factura de electricidad%n",25 - temp, (25 - temp) * 3);
			} else {
				System.out.println("La termperatura es adecuada");
			}
		} else {
			System.out.println("Datos incorrectos");
		}

	}
}