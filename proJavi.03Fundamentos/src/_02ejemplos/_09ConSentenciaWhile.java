package _02ejemplos;

public class _09ConSentenciaWhile {
	public static void main(String[] args) {
		//Contar el número de intentos que tenemos que 
		//hacer antes de obtener un 6 al lanzar un dado
		
		int cont = 0;
		
		int dado = lanzarDado();
		System.out.println("Dado: " + dado);
		cont ++;

		while(dado != 6) {
			dado = lanzarDado();
			System.out.println("Dado: " + dado);
			cont++;
		}
			
		System.out.println(cont);
		
	}
	public static int lanzarDado() { 
		return (int) (1 + Math.random() * 6);
	}
}
