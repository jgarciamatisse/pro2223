package _03ejerciciosInterfacesYGenericidad._01conjuntos;

//Es un interfaz genérico porque usa <T> para 
//indicar que hay un tipo pendiente de determinar
public interface Coleccion <T> {
	void agregar(T elemento);
	void eliminar(T elemento);
	boolean estaVacia();
	int talla();
	boolean contiene(T elemento);
}
