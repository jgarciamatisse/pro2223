package _02ejemplos;

public class _05Incremento {
	public static void main(String[] args) {
		//Mostrar por pantalla del 1 al 5
		int numero = 1;
		while (numero <= 5) {
			System.out.println(numero);
			numero ++;
		}
		
		//Mostrar del 1 al 5
		numero = 1;
		while (numero <= 5) {
			System.out.println(numero++);
		}
	}
}
