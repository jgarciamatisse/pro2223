package _03ejercicios._01gestionempleados;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Empresa {
	private String nombre;
	private ArrayList<Empleado> plantilla;
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		plantilla = new ArrayList<>();
	}
	
	public int getNumeroEmpleados() {
		return plantilla.size();
	}

	//Getter y setter
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Empleado> getPlantilla() {
		return plantilla;
	}
	
	public void contratar(Empleado e) throws IllegalArgumentException {
		if(plantilla.contains(e)) { 
			throw new IllegalArgumentException("No se puede contratar a alguien que ya esta contratado");
		} else {
			plantilla.add(e);
		}
	}
	
	public void despedir (Empleado e) throws NoSuchElementException {
		if(plantilla.contains(e)) { 
			plantilla.remove(e);
		} else {
			throw new NoSuchElementException("No se puede despedir a alguien que no esta contratado");
		}
	}
	public void eliminar2 (Empleado e) throws NoSuchElementException {
		if(!plantilla.remove(e)) { 
			throw new NoSuchElementException("No se puede despedir a alguien que no esta contratado");
		}
	}
	
	@Override 
	public String toString() {
		String res = "Empresa " + nombre;
		for(int i = 0; i < plantilla.size(); i++) {
			Empleado e  = plantilla.get(i);
			res += "\n" + e.toString(); // += "\n" + e;
		}
		
		//o bien
		res = "Empresa " + nombre;
		for(Empleado e: plantilla) {
			res += "\n" + e.toString(); // += "\n" + e;
		}
		
		return res;
	}
	

	
	

	
}
