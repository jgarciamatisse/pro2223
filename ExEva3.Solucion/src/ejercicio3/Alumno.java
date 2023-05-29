package ejercicio3;

public class Alumno implements Comparable<Alumno>{
	private String nombre;
	private double nota;
	public Alumno(String nombre, double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	public String getNombre() {
		return nombre;
	}
	public double getNota() {
		return nota;
	}
	@Override
	public int compareTo(Alumno o) {
		if(this.nota < o.nota) return -1;
		else if(this.nota > o.nota) return 1;
		else return this.nombre.compareTo(o.nombre);
	}
}
