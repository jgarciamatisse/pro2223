package _01pruebas;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamsYLambda {
	public static void main(String[] args) {
		
		ArrayList<String> palabras = new ArrayList<>(Arrays.asList(
				"casa","mariposa","solo","subordinado"));
	
		//Contar las palabras que contienen 'a'
		long num = palabras.stream().filter(s->s.indexOf('a')!=-1).count();
		System.out.println(num);
		
		
		//Calcular la longitud media de las palabras que empiezan por s
		double longitudMedia = palabras.stream().filter(s->s.charAt(0) == 's').mapToInt(String:: length).average().getAsDouble();
		System.out.println(longitudMedia);
		
		
	}
}
