package _03ejercicios._01gestionempleados;

public class TestEmpresa {
	public static void main(String[] args) {
		Empresa matisse = new Empresa("Matisse DAM");
		matisse.contratar(new Empleado("luis","11111A",2000,1500));
		matisse.contratar(new Empleado("rosa","22222B",2001,1550));
		System.out.println(matisse);
	}
}
