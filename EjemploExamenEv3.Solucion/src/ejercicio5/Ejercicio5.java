package ejercicio5;

public class Ejercicio5 {
	public static void main(String[] args) {
		//Alguien tiene varios terrenos y varios vinos anyejos.
		//Ponerlos en un array, recorrerlos y calcular su valor total
		Object[] propiedades = {
				new VinoAnyejo("Coto", 2020),
				new Terreno("aeafr22",10),
				new VinoAnyejo("Abadia", 2010),
				new Terreno("aeafr22",12),
				new VinoAnyejo("La bodega", 2012)
		};
		
		double suma = 0;
		for (int i = 0; i < propiedades.length; i++) {
			suma += ((Valorable)propiedades[i]).valorar();
		}
		System.out.println(suma);
	}
	
}
