package _02ejemplos._04genericidad;

public class Test {
	public static void main(String[] args) {
		EquipoFutbol e1 = new EquipoFutbol("Equipo 1");
		e1.fichar(new JugadorFutbol("luis",1,10));
		e1.fichar(new JugadorFutbol("pepe",1,2));
		System.out.println(e1);

		EquipoBasket e2 = new EquipoBasket("Equipo 2");
		e2.fichar(new JugadorBasket("luis",1,2.1));
		e2.fichar(new JugadorBasket("pepe",1,2.05));
		System.out.println(e2);
		
		//Puedo usar EquipoGenerico en lugar de los especificos de futbol y basket
		EquipoGenerico e3 = new EquipoGenerico("Equipo 3");
		e3.fichar(new JugadorFutbol("luis",1,10));
		e3.fichar(new JugadorFutbol("pepe",1,2));
		System.out.println(e3);

		EquipoGenerico e4 = new EquipoGenerico("Equipo 4");
		e4.fichar(new JugadorBasket("luis",1,2.1));
		e4.fichar(new JugadorBasket("pepe",1,2.05));
		System.out.println(e4);
		
		//EquipoGenerico TIENE una pega: permite fichar cualquier tipo de objeto
		e4.fichar("casa");
		e4.fichar(new JugadorFutbol("luis",1,10));
		System.out.println(e4);
		
		//Equipo genérico usando la notación de diamante: 
		//Se detectan errores al compilar, que sin la notacion de diamante
		//no se detectarían.
		Equipo<JugadorFutbol> e5 = new Equipo<>("Equipo 5");
		e5.fichar(new JugadorFutbol("luis",1,10));
//		e5.fichar("casa");
//		e5.fichar(new JugadorBasket("pepe",1,2.05));
		
	}

}
