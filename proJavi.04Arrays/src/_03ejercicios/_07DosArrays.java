package _03ejercicios;

public class _07DosArrays {
	public static void main(String[] args) {
		
	}
	public static double[] sumaArraysIguales(double[] a, double[] b) {
		double[] suma = new double[a.length];
		for (int i = 0; i < suma.length; i++) {
			suma[i] = a[i] + b[i];
		}
		return suma;
	}
	
	public static double[] sumaArrays(double[] a, double[] b) {
		//Creamos array del tamanyo mas grande de los dos
		double[] suma = new double[Math.max(a.length, b.length)];
		//O bien
		if(a.length > b.length) suma = new double[a.length];
		else suma = new double[b.length];

		for (int i = 0; i < a.length; i++) {
			suma[i] += a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			suma[i] += b[i];
		}
		
		return suma;
	}
	public static double[] sumaArrays2(double[] a, double[] b) {

		if(a.length > b.length) {
			double[] suma = new double[a.length];
			for (int i = 0; i < b.length; i++) {
				suma[i] = a[i] + b[i];
			}
			for (int i = b.length; i < a.length; i++) {
				suma[i] = a[i] ;
			}
			return suma;
		} else {
			double[] suma = new double[b.length];
			for (int i = 0; i < a.length; i++) {
				suma[i] = a[i] + b[i];
			}
			for (int i = a.length; i < b.length; i++) {
				suma[i] = b[i] ;
			}
			return suma;
		}
	}

}
