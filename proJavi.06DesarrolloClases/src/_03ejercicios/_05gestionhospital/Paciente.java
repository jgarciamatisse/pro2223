package _03ejercicios._05gestionhospital;

import java.util.Random;

public class Paciente implements Comparable<Paciente> {
	private String nombre;
	private int edad;
	private int estado;
	private static Random r = new Random(1);
	
	public Paciente(String n, int e){
		this.nombre = n;
		this.edad = e;
		this.estado = r.nextInt(5)  + 1;
	}
	
	public int getEdad(){
		return edad;
	}
	public int getEstado(){
		return estado;
	}
	public void mejorar(){
		if (estado > 0) {
			this.estado --;
		}
	}
	public void empeorar(){
		if (estado < 5) {
			this.estado ++;
		}
	}
	public String toString(){
		String textoEstado;
		switch(estado) {
		case 0: textoEstado = "curado"; break;
		case 1: textoEstado = "muy leve"; break;
		case 2: textoEstado = "leve"; break;
		case 3: textoEstado = "enfermo"; break;
		case 4: textoEstado = "grave"; break;
		default: textoEstado = "muy grave"; 
		}
		return nombre + " " + edad + " " + textoEstado;
	}
	public String toString2(){
		String[] textoEstado = {"curado","mul leve","leve","enfermo","grave","muy grave"};
		return nombre + " " + edad + " " + textoEstado[estado];
	}
	public int compareTo(Paciente p){
		//Si this esta mas leve que p, devolver negativo
		if(this.estado < p.estado) return -1;
		//Si this esta menos leve que p, devolver positivo
		else if(this.estado > p.estado) return 1;
		//Si estan igual de leves/graves comparamos por edad
		else if(this.edad < p.edad) return -1;
		else if(this.edad > p.edad) return 1;
		else return 0;
	}
	public int compareToV2(Paciente p){
		if(this.estado == p.estado) return this.edad - p.edad;
		else return this.estado - p.estado;
	}
}
