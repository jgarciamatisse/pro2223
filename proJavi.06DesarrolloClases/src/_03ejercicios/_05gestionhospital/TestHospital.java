package _03ejercicios._05gestionhospital;

public class TestHospital {
	public static void main(String[] args) {
		Hospital h = new Hospital();
		h.ingresarPaciente("luis", 20);
		h.ingresarPaciente("pedro", 21);
		h.ingresarPaciente("raul", 12);
		h.ingresarPaciente("miguel", 30);
		h.ingresarPaciente("rosa", 40);
		h.ingresarPaciente("a", 20);
		h.ingresarPaciente("p", 21);
		h.ingresarPaciente("r", 12);
		h.ingresarPaciente("m", 30);
		h.ingresarPaciente("r", 40);
		System.out.println(h);
		
		do {
			h.darAltas();
			System.out.println("---------");
			System.out.println(h);
		} while (h.getNumLibres() < 5);
	}

}
