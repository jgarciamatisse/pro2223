package _03ejercicios._15ServidorSumas;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	final static String HOST = "localhost";
	final static int PUERTO = 5000;

	public Cliente() {
		boolean terminar = false;
		while (!terminar) {
			try {
				System.out.println("Cliente: Esperando conexión con el servidor");
				Socket skCliente = new Socket(HOST, PUERTO);
				DataInputStream flujoEnt = new DataInputStream(skCliente.getInputStream());
				DataOutputStream flujoSal = new DataOutputStream(skCliente.getOutputStream());

				// Completar
				Scanner tec = new Scanner(System.in);
				System.out.println("Numero 1: ");
				int num1 = tec.nextInt();
				System.out.println("Numero 1: ");
				int num2 = tec.nextInt();
				
				flujoSal.writeInt(num1);
				flujoSal.writeInt(num2);
				
				int resultado = flujoEnt.readInt();
				System.out.println("Suma: " + resultado);
				

				skCliente.close();
				terminar = true;
			} catch (ConnectException ex) {
				try {
					Thread.currentThread().sleep(300);
				} catch (InterruptedException ie) {
					System.out.println(ie);
				}
			} catch (IOException ex) {
				System.out.println(ex);
				terminar = true;
			}
		}
	}

	public static void main(String[] args) {
		new Cliente();
	}
}
