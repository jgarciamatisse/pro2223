package _02ejemplos._06RequisitosMiembros;

import java.util.Arrays;
import java.util.HashSet;

public class TestHashSet {
	public static void main(String[] args) {
	
		//Los HashSet y LinkedHashSet requieren que la clase miembro
		//tenga reescrito el método hashCode()
		//Con la clase Cliente no funcionaría bien:
		// contains no encontraria elementos.
		// la inserción podría admitir duplicados
		System.out.println("Clientes ------------------");
		HashSet<Cliente> clientes = new HashSet<>(Arrays.asList(
				new Cliente("1","a"),
				new Cliente("1","a"),
				new Cliente("2","b"),
				new Cliente("3","c")
		));
		System.out.println(clientes.contains(new Cliente("1","a")));
		System.out.println(clientes);
		
		//Con Proveedor funcionará, porque tiene equals y hashCode
		System.out.println("Proveedores ---------------");
		HashSet<Proveedor> prov = new HashSet<>(Arrays.asList(
				new Proveedor("1","a"),
				new Proveedor("1","a"),
				new Proveedor("2","b"),
				new Proveedor("3","c")
		));
		System.out.println(prov.contains(new Proveedor("1","a")));
		System.out.println(prov);
	}
}
