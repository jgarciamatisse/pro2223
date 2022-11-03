package _03ejercicios;

import java.util.Scanner;

public class _26Mes {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce numero de mes: ");
		int numeroMes = tec.nextInt();
		System.out.println("El mes " + numeroMes + " tiene " + diasMes(numeroMes)  + " dias");
		
		System.out.println("Introduce nombre de mes: ");
		String nombreMes = tec.next();
		System.out.println("El mes " + nombreMes + " tiene " + diasMes(nombreMes)  + " dias");
		
		
	}

	public static int diasMes(int mes) {
		int dias = 31; 
		if(mes == 2) dias = 28;
		else if(mes == 4) dias = 30;
		else if(mes == 6) dias = 30;
		else if(mes == 9) dias = 30;
		else if(mes == 11) dias = 30;
		
		return dias;
	}
	public static int diasMes2(int mes) {
		int dias = 31; 
		if(mes == 2) dias = 28;
		else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) dias = 30;
		
		return dias;
	}

	public static int diasMes(String mes) {
		int dias = 31; 
		if(mes.equalsIgnoreCase("febrero")) dias = 28;
		else if(mes.equalsIgnoreCase("abril")) dias = 30;
		else if(mes.equalsIgnoreCase("junio")) dias = 30;
		else if(mes.equalsIgnoreCase("septiembre")) dias = 30;
		else if(mes.equalsIgnoreCase("noviembre")) dias = 30;
		
		return dias;
	}
}
