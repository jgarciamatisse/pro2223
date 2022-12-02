
package _03ejercicios;

public class _02Lluvias {
	public static void main(String[] args) {
		double[] p = {2,3,4,4,4,5,4,3,2,2,2,8,6,7,5,4,2,0,0,0,0,1,1,2,3,3,0,1,2,3,1};
		System.out.println("Lluvia total del mes: " + lluviaTotal(p));
		System.out.println("Lluvia media: " + lluviaMedia(p));
		System.out.println("Maxima lluvia:  " + lluviaMaxima(p));
		System.out.println("Dia mas lluvia: " + (diaMasLluvia(p) + 1));
	}
	
	public static double lluviaTotal(double[] p) {
		double total = 0;
		for (int i = 0; i < p.length; i++) {
			total += p[i];
		}
		return total;
		
	}
	public static double lluviaMedia(double[] p) {
		double total = 0;
		for (int i = 0; i < p.length; i++) {
			total += p[i];
		}
		return total / p.length;
	}
	public static double lluviaMedia2(double[] p) {
		return lluviaTotal(p) / p.length;
	}
	
	public static double lluviaMaxima(double p[]) {
		double max = p[0];
		for (int i = 1; i < p.length; i++) {
			if(p[i] > max) {
				max = p[i];
			}
		}
		return max;
	}
	public static double lluviaMinima(double p[]) {
		double min = p[0];
		for (int i = 1; i < p.length; i++) {
			if(p[i] < min) {
				min = p[i];
			}
		}
		return min;
	}
	public static int diaMasLluvia(double p[]) {
		double max = p[0];
		int posMax = 0;
		for (int i = 1; i < p.length; i++) {
			if(p[i] > max) {
				max = p[i];
				posMax = i;
			}
		}
		return posMax;
	}
	
	public static int contarDiasLluviaX (double[] p, double x) {
		int cont = 0;
		for (int i = 0; i < p.length; i++) {
			if(p[i] == x) {
				cont++;
			}
		}
		return cont;
	}
	
	public static double lluviaTotalPeriodo (double p[], int ini, int fin) {
		double suma = 0; 
		for (int i = ini; i <= fin; i++) {
			suma += p[i];
		}
		return suma;
	}
	public static int contarDiasLluviaCreciente(double p[]) {
		int cont = 0;
		for (int i = 0; i < p.length - 1; i++) {
			if(p[i] < p[i+1]) {
				cont++;
			}
		}
		return cont;
	}
	
	public static int primerDiaLluviaX (double  p[], double x) {
		int primerDia = -1;
		
		for (int i = 0; i < p.length && primerDia == -1; i++) {
			if(p[i] == x) {
				primerDia = i;
			}
		}
		return primerDia;
		
	}
	public static int primerDiaLluviaX2 (double  p[], double x) {
		
		for (int i = 0; i < p.length; i++) {
			if(p[i] == x) {
				return i;
			}
		}
		return -1;
		
		
	}
	public static int ultimoDiaLluviaX (double  p[], double x) {
		int primerDia = -1;
		
		for (int i = p.length - 1 ; i >= 0 && primerDia == -1; i--) {
			if(p[i] == x) {
				primerDia = i;
			}
		}
		return primerDia;
		
	}

}



