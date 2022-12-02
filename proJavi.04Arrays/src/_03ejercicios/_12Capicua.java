package _03ejercicios;

public class _12Capicua {
	public static void main(String[] args) {
		String[] frase = {"casa","de","la","de","casa"};
		System.out.println(esCapicua(frase));

	}

	public static boolean esCapicua(String[] v) {
		boolean encDiferencia = false;
		for (int i = 0, j = v.length - 1; i < j && !encDiferencia; i++, j--) {

			if (!v[i].equals(v[j])) {
				// if (v[i].equals(v[j]) == false) {
				encDiferencia = true;
			}
		}
		if (encDiferencia) {
			return false; // no es capicua
		} else {
			return true; // es capicua
		}
	}

	public static boolean esCapicua2(String[] v) {
		boolean esCap = true;
		for (int i = 0; i < v.length / 2 && esCap; i++) {
			if (!v[i].equals(v[v.length - 1 - i])) {
				esCap = false;
			}
		}
		if (esCap) {
			return false; // no es capicua
		} else {
			return true; // es capicua
		}
	}
}
