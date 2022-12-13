package _02ejemplos;

public class _04ClasesEnvoltorio {
	public static void main(String[] args) {
		//La forma estricta de usar String
		String nombre = new String("pepe");
		//La forma no estricta de usar String
		String apellido = "gotera";
		
		//La forma estricta de usar clases envoltorio, como Integer
		Integer edad = new Integer(40);
		System.out.println(edad.intValue());
		
	}
}
