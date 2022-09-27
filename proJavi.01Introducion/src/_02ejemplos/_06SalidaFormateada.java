package _02ejemplos;

public class _06SalidaFormateada {
	public static void main(String[] args) {
		int precio1 = 185;
		int precio2 = 76;
		System.out.println("Precio: " + precio1 + " euros");
		System.out.println("Precio: " + precio2 + " euros");

		System.out.format("Precio: %d euros %n", precio1);
		System.out.format("Precio: %d euros %n", precio2);
		
		System.out.format("Precio: %5d euros %n", precio1);
		System.out.format("Precio: %5d euros %n", precio2);
		
		System.out.format("Precio: %05d euros %n", precio1);
		System.out.format("Precio: %05d euros %n", precio2);
		
		System.out.format("Precio: %-5d euros %n", precio1);
		System.out.format("Precio: %-5d euros %n", precio2);
		
		double estatura1 = 1.866;
		double estatura2 = 1.799997;
		
		System.out.println("Estatura " + estatura1 + " metros");
		System.out.println("Estatura " + estatura2 + " metros");
		
		System.out.format("Estatura %f metros %n", estatura1);		
		System.out.format("Estatura %f metros %n", estatura2);		
		
		System.out.format("Estatura %6.2f metros %n", estatura1);		
		System.out.format("Estatura %6.2f metros %n", estatura2);		
		
		System.out.format("Estatura %-6.2f metros %n", estatura1);		
		System.out.format("Estatura %-6.2f metros %n", estatura2);		
		
		
	}
}
