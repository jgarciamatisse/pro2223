package examen;

public class Ejercicio2 {
	
	public static String contrasenyaDefecto(String nombre, String fecha) {
		String contrasenya;

		// Letras del apellido
		String apellido = nombre.toLowerCase().substring(nombre.lastIndexOf(" ") + 1);
		if (apellido.length() > 3) {
			contrasenya = apellido.substring(0, 3);
		} else {
			contrasenya = apellido;
		}

		// Numeros de la fecha
		String dia = fecha.substring(0, fecha.indexOf("/"));
		String mes = fecha.substring(fecha.indexOf("/") + 1, fecha.lastIndexOf("/"));
		String anyo = fecha.substring(fecha.lastIndexOf("/") + 1);

		if (dia.length() < 2) {
			dia = "0" + dia;
		} 

		if (mes.length() < 2) {
			mes = "0" + mes;
		} 

		contrasenya += dia + mes + anyo;

		return contrasenya;
	}
	public static String contrasenyaDefecto2(String nombre, String fecha) {
		String contrasenya;

		// Letras del apellido
		String apellido = nombre.toLowerCase().substring(nombre.lastIndexOf(" ") + 1);
		if (apellido.length() > 3) {
			contrasenya = apellido.substring(0, 3);
		} else {
			contrasenya = apellido;
		}

		// Numeros de la fecha
		int dia = Integer.parseInt(fecha.substring(0, fecha.indexOf("/")));
		int mes = Integer.parseInt(fecha.substring(fecha.indexOf("/") + 1, fecha.lastIndexOf("/")));
		int anyo = Integer.parseInt(fecha.substring(fecha.lastIndexOf("/") + 1));

		return String.format("%s%02d%02d%04d", contrasenya, dia, mes, anyo);
	}
	
	public static void main(String[] args) {
		System.out.println(contrasenyaDefecto("LUIS ABEL PEREZ", "1/2/2000"));
		System.out.println(contrasenyaDefecto("FRANCISCO JOSE RUBIO GOZALBO", "2/10/2001"));
		System.out.println(contrasenyaDefecto("LIAO WU", "1/12/2002"));
	}

	
}
