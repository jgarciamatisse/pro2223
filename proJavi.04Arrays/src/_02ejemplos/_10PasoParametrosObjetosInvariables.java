package _02ejemplos;

public class _10PasoParametrosObjetosInvariables {
	public static void main(String[] args) {
		String palabra = "casa";
		//El paso de parametros es por referencia pero
		//los cambios no afectan a la variable 'palabra'
		//porque los String son objetos INVARIABLES.
		pasarAMayusculas(palabra);
		System.out.println(palabra);
		palabra = pasarAMayusculas2(palabra);
		System.out.println(palabra);
	}
	public static void pasarAMayusculas(String p) {
		p = p.toUpperCase();
	}
	
	public static String pasarAMayusculas2(String p) {
		return p.toUpperCase();
	}

}
