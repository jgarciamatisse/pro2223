package _03ejercicios._02reservaslibreria;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ListaReservas {
	private ArrayList<Reserva> lista;
	
	public ListaReservas () {
		lista = new ArrayList<>();
	}

	public void reservar(String nif, String nombre, String telefono, int libro, int ejemplares)
	throws IllegalArgumentException {
		Reserva r = new Reserva(nif, nombre, telefono, libro, ejemplares);
		
		if(lista.contains(r)) {
			throw new IllegalArgumentException();
		} else {
			lista.add(r);
		}
	}
	//Si la reserva ya existe, le suma el numero de ejemplares indicados como
	// parametro
	public void reservarAnyadiendo(String nif, String nombre, String telefono, int libro, int ejemplares) {
		
	}
	
	public void cancelar(String nif, int libro) throws NoSuchElementException {
		Reserva r = new Reserva(nif,"","",libro,0);
		if(!lista.remove(r)) {
			throw new NoSuchElementException();
		}
	}
	
	@Override
	public String toString() {
		String res = "";
		for (Reserva r : lista) {
			res += r; //res += r.toString();
		}
		return res;
	}
	
	public int numEjemplaresReservadosLibro(int codigo) {
		int cont = 0;
		for(Reserva r : lista) {
			//Compruebo si la reserva es del libro indicado
			if(r.getCodigo() == codigo) {
				cont += r.getEjemplares();
			}
		}
		return cont;
	}
	
	
}
