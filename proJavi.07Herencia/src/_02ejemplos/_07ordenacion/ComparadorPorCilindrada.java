package _02ejemplos._07ordenacion;import java.util.Comparator;

public class ComparadorPorCilindrada implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo v1, Vehiculo v2) {
		if(v1.getCilindrada() < v2.getCilindrada()) return -1;
		else if(v1.getCilindrada() > v2.getCilindrada()) return 1;
		else return 0;
	}

}
