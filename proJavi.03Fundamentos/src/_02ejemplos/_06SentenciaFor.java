package _02ejemplos;

public class _06SentenciaFor {
	public static void main(String[] args) {
		
		//Mostrar del 1 al 3
		//Con while
		System.out.println("Mostrar 1 a 3 con while");
		int num = 1;
		while (num <= 3) {
			System.out.println(num);
			num++;
		}
		
		//Mostrar 1 a 3 
		//con for
		System.out.println("Mostrar 1 a 3 con for");
		for(int n = 1; n <= 3; n++) {
			System.out.println(n);
		}
		
		//Sumar numeros entre 1 y 3
		//con while
		num = 1;
		int suma = 0;
		while (num <= 3) {
			suma = suma + num; //suma += num;
			num++;
		}
		System.out.println("Suma del 1 al 3 con while: " + suma);
		
		//Sumar numeros entre 1 y 3
		//con for
		suma = 0;
		for(int n = 1; n <= 3; n++) {
			suma = suma + n; //suma += n;
		}
		System.out.println("Suma del 1 al 3 con for: " + suma);
		
		//con for: VERSIÓN MALA
		num = 1;
		for(suma = 0; num <= 3; suma += num) {
			num ++;
		}
		//con for: VERSION MALA
		for(num = 1, suma = 0; num <= 3; suma += num, num ++) {
		}
		
		//con for: VERSION MALA
		num = 1;
		suma = 0;
		for( ;num <= 3; ) {
			suma += num;
			num ++;
		}
		
	}
}







