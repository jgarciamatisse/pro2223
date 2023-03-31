package _03ejerciciosInterfacesYGenericidad._01conjuntos;

import java.util.ArrayList;

public class Conjunto <T> implements Coleccion<T>{
	private ArrayList <T> elementos; //para almacenar los elementos del conjunto

	//Constructor que crea el conjunto vacio
	public Conjunto () {
		elementos = new ArrayList<> ();
	}

	@Override
	public void agregar(T elemento) {
		if(!elementos.contains(elemento)) {
			elementos.add(elemento);
		}
	}

	@Override
	public void eliminar(T elemento) {
		elementos.remove(elemento);
	}

	@Override
	public boolean estaVacia() {
		return elementos.size() == 0;
	}

	@Override
	public int talla() {
		return elementos.size();
	}

	@Override
	public boolean contiene(T elemento) {
		return elementos.contains(elemento);
	}
	
	@Override
	public String toString() {
		String res = "";
		for(T e: elementos) {
			res += e.toString() + ", ";
		}
		return res.substring(0,res.length() - 2);
	}
}








