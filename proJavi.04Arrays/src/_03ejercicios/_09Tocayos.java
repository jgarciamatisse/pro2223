package _03ejercicios;

public class _09Tocayos {
	public static void main(String[] args) {
		String[] grupo1 = {"ana","luis","miguel"};
		String[] grupo2 = {"pepe", "pepa", "uriel", "ana", "jose", "luis"};
		int cont = 0;
		
		//Recorremos el primer grupo
		for (int i = 0; i < grupo1.length; i++) {
			//Buscamos a grupo1[i] en el grupo 2
			boolean encontrado = false;
			for (int j = 0; j < grupo2.length && !encontrado; j++) {
				if(grupo1[i].equals(grupo2[j])) {
					encontrado = true;
					cont++;
				}
			}
			if(encontrado) {
				System.out.println(grupo1[i] + " tiene un tocayo en el 2º grupo");
			}
		}
		System.out.println(cont + " personas del primer grupo tienen tocayo");
		
	}
}	
