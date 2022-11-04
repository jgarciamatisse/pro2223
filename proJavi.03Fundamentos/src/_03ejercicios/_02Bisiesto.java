package _03ejercicios;

public class _02Bisiesto {
	public static void main(String[] args) {
		
	}
	public static boolean esBisiesto(int anyo) {
		boolean b;
		if(anyo % 4 == 0) {
			if(anyo % 100 == 0) {
				if(anyo % 400 == 0) {
					b = true;
				} else {
					b = false;
				}
			} else {
				b = true;
			}
		} else {
			b = false;
		}
		return b;
	}
	public static boolean esBisiesto2(int anyo) {
		if(anyo % 400 == 0) {
			return true;
		} else if(anyo % 100 == 0) {
			return false;
		} else if(anyo % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean esBisiesto3 (int anyo) {
		return anyo % 400 == 0 || anyo % 4 == 0 && anyo % 100 != 0;
	}
}



