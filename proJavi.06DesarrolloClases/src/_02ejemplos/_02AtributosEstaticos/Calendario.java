package _02ejemplos._02AtributosEstaticos;

/*Esta clase sigue el patrón SINGLETON
 * Este patrón tiene como objetivo evitar que se 
 * puedan crear varios objetos de la clase. Es decir,
 * que haya un unico objeto de la clase
 * 
 * Cuando se use la clase por primera, se inicializará automáticamente el 
 * atributo estático c y, por tanto, se ejecutará el constructor Calendario()
 * 
 * Esto ocurrirá una sola vez, ya que el constructor Calendario() es PRIVATE
 * y no se puede llamar directamente desde otras clases.
 * 
 * Para obtener el calendario, en lugar de llamar a new Calendario(),
 * usaremos el método Calendario.getInstance(), que nos devolverá el 
 * Calendario c
 */
public class Calendario {
	private static Calendario c = new Calendario();
	
	private Calendario() {
		System.out.println("Creando calendario ...");
		
		//Esto es para que el constructor tarde tiempo en ejecutarse
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		// -------------
		
		System.out.println("Calendario creado ...");
	}
	
	//Cuando 
	public static Calendario getInstance() {
		return c;
	}

}
