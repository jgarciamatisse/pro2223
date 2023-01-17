package _03ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class _01Tocayos {
	//Dados dos grupos de personas, decir quienes del 
	// primer grupo tienen un tocayo en el segundo
	public static void main(String[] args) {
		String codigo = "1";
		System.out.println(Integer.valueOf(codigo.charAt(0)));
		System.out.println(Integer.parseInt(codigo.substring(0,1)));
		
		
		String[] grupo1 = {"luis","ana","juan","manuel"};
		String[] grupo2 = {"pere", "jose", "ana", "pablo", "juan"};
		
		//Creo una lista con los elementos de grupo2
		ArrayList<String> lista = new ArrayList<>(Arrays.asList(grupo2));
		
		//Recorro el grupo1
		for (int i = 0; i < grupo1.length; i++) {
			if(lista.contains(grupo1[i])) {
				System.out.println(grupo1[i] + " tiene tocayo en el grupo 2");
			}
		}
		
	}
}








