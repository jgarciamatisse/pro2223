package _03ejercicios;

public class _02Nif {
	public static void main(String[] args) {
		validarNif("19838499S");
		validarNif("1983a8499S");
		
	}
	public static boolean validarNif(String nif) {
		try {
			
		char letra = nif.charAt(nif.length()-1);
		int numero = Integer.parseInt(nif.substring(0,nif.length()-1));
		
		int resto = numero % 23;
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		
		if(letras.charAt(resto) == letra) {
			return true;
		} else {
			return false;
		}
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
