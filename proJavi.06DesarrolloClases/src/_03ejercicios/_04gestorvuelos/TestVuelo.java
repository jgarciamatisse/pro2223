package _03ejercicios._04gestorvuelos;

import _02ejemplos._01Tiempo.Tiempo;

public class TestVuelo {
	public static void main(String[] args) {
		Vuelo v = new Vuelo("IB101","Valencia","Madrid", new Tiempo(10,0,0), new Tiempo(11,30,0),6);
		// o bien
//		Tiempo s = new Tiempo (19,20,0);
//		Tiempo ll = new Tiempo (21,5,0);
//		Vuelo v = new Vuelo("IB101","Valencia","Madrid", s, ll,4);

		System.out.println(v);
		
		v.reservarAsiento("miguel", "11111111A");
		v.reservarAsiento("luis", "22222222B");
		v.reservarAsiento("pablo", "33333333C");
		System.out.println(v);	

		v.reservarAsiento("VICTOR", "444444444D",'V');
		v.reservarAsiento("PATRICIA", "555555555D",'P');
		System.out.println(v);	
//		System.out.println(v);
	}
}
