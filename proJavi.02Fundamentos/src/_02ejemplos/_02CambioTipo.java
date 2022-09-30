package _02ejemplos;

public class _02CambioTipo {
	public static void main(String[] args) {
		//Cambios de tipo IMPLICITOS
		
		byte b = 2;
		int i = b;  //<-- Esta convirtiendo b a tipo int antes
					// de poder hacer la asignación
		
		float f = 2.5f;
		double d = f; //Esta convirtiendo f a double antes 
					  // de poder hacer la asignación
		
		//Cambios de tipo EXPLÍCITOS
		double g = 5.3;
		int h = (int) g; //"casting" a entero
	}
}
