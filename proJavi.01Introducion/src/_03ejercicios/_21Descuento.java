package _03ejercicios;

import java.util.Scanner;

public class _21Descuento {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Importe de la compra: ");
		double importe = tec.nextDouble();
		double tipoDescuento = 0;
		double desc = 0;
		if(importe > 40) {
			tipoDescuento = 8;
			desc = importe * tipoDescuento / 100;
			if(desc > 12) {
				desc = 12;
			}
		} 
		
		System.out.println("Descuento aplicado: " + tipoDescuento + " %");
		System.out.println("Importe del descuento: " + desc + " €");
		System.out.println("A pagar: " + (importe - desc));

	}
}
