package _02ejemplos;

public class _05LaClaseMath {
	public static void main(String[] args) {
		System.out.println("Numero E: " + Math.E);
		System.out.println("Numero PI: " + Math.PI);
		
		//Redondeo
		System.out.println("Ceil: " + Math.ceil(48.23));
		System.out.println("Floor: " + Math.floor(48.287394798374987343));
		System.out.println("Round: " + Math.round(48.23));
		System.out.println("Round: " + Math.round(48.23f));
		
		//Hay dos métodos round, uno que devuelve un int y otro
		//que devuelve un long
		long redondeado = Math.round(48.23); //Recibe un double
		int redondeado2 = Math.round(48.23f);//Recibe un float
		
		//Funciones tringonometricas
		System.out.println("Seno de 90: " + Math.sin(Math.PI/2));
		
		//Otras funciones:
		System.out.println("Valor absoluto 10: " + Math.abs(10));
		System.out.println("Valor absoluto -10: " + Math.abs(-10));
	}
}








