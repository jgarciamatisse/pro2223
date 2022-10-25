package _02ejemplos;

import java.util.Scanner;

public class _20ProgramacionModular {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Longitud de la habitación: ");
		double l = tec.nextDouble();

		System.out.println("Anchura de la habitación: ");
		double a = tec.nextDouble();
		
		double precio = precioHabitacion(l,a); //l y a son los PARAMETROS REALES del método
		System.out.println("Precio: " + precio);		
	}

	//Método que devuelve la superficie de un rectangulo
	//dadas la longitud y la anchura
	public static double superficie (double longitud, double anchura) {
		//longitud y anchura son los PARAMETROS FORMALES del método
		double s = longitud * anchura;
		
		return s;
	}
	
	//Metodo que calcula el precio de una habitacion en función de
	//sus dimensiones
	public static double precioHabitacion (double longitud, double anchura) {
		//El precio se calcula a razon de 1.7 euros el metro cuadrado
		
		//Calculamos la superficie
		double metros = superficie(longitud,anchura);
		//Calculamos el precio
		double precio = metros * 1.7;
		
		return precio;
		
	}
}






