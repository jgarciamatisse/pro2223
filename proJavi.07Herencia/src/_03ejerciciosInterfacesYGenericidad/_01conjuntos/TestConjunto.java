package _03ejerciciosInterfacesYGenericidad._01conjuntos;

public class TestConjunto {
	public static void main(String[] args) {
		
		Conjunto <String> palabras = new Conjunto<>();
		palabras.agregar("casa");
		palabras.agregar("silla");
		palabras.agregar("mesa");
		palabras.agregar("casa");
		System.out.println(palabras);
		
		
	}

}
