package ejercicio5;

import java.util.Calendar;

public class VinoAnyejo implements Valorable {
	String nombre;
	int anyo;
	public VinoAnyejo (String nombre, int anyo) {
		this.nombre = nombre;
		this.anyo = anyo;
	}
	@Override
	public double valorar() {
		return (Calendar.getInstance().get(Calendar.YEAR) - anyo ) * 3;
	}
	
}
