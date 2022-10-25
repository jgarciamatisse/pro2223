package _02ejemplos;

public class _22Sobrecarga {
	//En programación, se dice que algo está 
	//sobrecargado cuando se usa para hacer más de una cosa.
	
	//Por ejemplo: El operador '+' está sobrecargado:
	//Se usa para la suma aritmetica: int a = b + c 
	//Se usa para concatenar cadenas: String texto = "El precio es " + p + " euros"
	
	
	//Los métodos tambien pueden estar sobrecargados:
	// - Si dos metodos se llaman igual, se dice que están sobrecargados.
	// Para que pueda haber sobrecarga, los métodos se tienen que diferenciar
	// en el numero o tipo de sus parametros.
	public static void main(String[] args) {
		linea(10);
		linea(20);
		linea(10,'=');
	}
	/**
	 * Muestra por pantalla una linea formada por el caracter '*'
	 * @param longitud la longitud que queremos que tenga la linea
	 */
	public static void linea(int longitud) {
		int cont = 0;
		while (cont < longitud) {
			System.out.print("*");
			cont = cont + 1;
		}
		System.out.println();
	}
	/**
	 * Muestra por pantalla una linea formada por determinado caracter
	 * @param longitud la longitud que queremos que tenga la linea
	 * @param caracter el caracter con que queremos que este formada la linea
	 */
	public static void linea(int longitud, char caracter) {
		int cont = 0;
		while (cont < longitud) {
			System.out.print(caracter);
			cont = cont + 1;
		}
		System.out.println();
	}
}
