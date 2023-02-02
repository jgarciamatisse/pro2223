package _03ejercicios._02reservaslibreria;

import java.util.Scanner;

public class GestionReservas {
	static Scanner tec = new Scanner(System.in);
	public static void main(String[] args) {
		ListaReservas l = new ListaReservas();
		int opcion;
		do {
			System.out.println("1.- Reservar");
			System.out.println("2.- Cancelar reserva");
			System.out.println("3.- Pedido");
			System.out.println("4.- Recepcion");
			System.out.println("0.- Salir");
			System.out.print("Elige una opcion: ");
			opcion = tec.nextInt();
			if(opcion < 0 || opcion > 4) {
				System.out.println("Opcion incorrecta");
			} else {
				switch (opcion) {
				case 1: reservar(l); break;
				case 2: cancelar(l); break;
				case 3: pedido(l);break;
				case 4: recepcion(l); break;
				}
			}
			
		} while (opcion != 0);
	}
	
	

	private static void reservar (ListaReservas l) {
		System.out.println("Nif: ");
		String nif = tec.next(); tec.nextLine();
		
		System.out.println("Nombre: ");
		String nombre = tec.nextLine();
		
		System.out.println("Telefono: ");
		String telefono = tec.nextLine();
		
		System.out.println("Codigo de libro: ");
		int codigo = tec.nextInt();
		
		System.out.println("Numero ejemplares: ");
		int ejemplares = tec.nextInt();
		
		l.reservar(nif, nombre, telefono, codigo, ejemplares);
	}
	private static void cancelar(ListaReservas l) {
		System.out.println("Nif: ");
		String nif = tec.next(); tec.nextLine();
		
		System.out.println("Codigo de libro: ");
		int codigo = tec.nextInt();
		
		l.cancelar(nif,codigo);
	}

	private static void pedido(ListaReservas l) {
		System.out.println("Codigo de libro: ");
		int codigo = tec.nextInt();
		System.out.println("Ejemplares reservados: " + l.numEjemplaresReservadosLibro(codigo));
		
	}
	private static void recepcion(ListaReservas l) {
		System.out.println("Codigo de libro: ");
		int codigo = tec.nextInt();
		
		l.reservasLibro(codigo);
	}
}
