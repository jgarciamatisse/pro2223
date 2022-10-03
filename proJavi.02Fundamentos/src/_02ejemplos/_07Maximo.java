package _02ejemplos;

import java.util.Scanner;

public class _07Maximo {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		//Aplicar un 8% de descuento si las compras superan los 40euros.
		//El decuento maximo sera de 12 euros.
		System.out.println("Importe: ");
		double importe = tec.nextDouble();
		
		if(importe > 40) {
			double descuento = Math.min(importe * 8 / 100.0, 12);
//			double descuento = importe * 8 / 100.0;
//			if(descuento > 12) {
//				descuento = 12;
//			}
			System.out.println("Descuento: " + descuento);
		}
		
	}
}
