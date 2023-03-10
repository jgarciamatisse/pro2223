package _03ejercicios._01aulas;

public class Test {
	public static void main(String[] args) {
		Aula a = new Aula (1,10,20);
		AulaInformatica ai = new AulaInformatica(2,10,20,5);
		AulaMusica am1 = new AulaMusica(3,10,20,true);
		AulaMusica am2 = new AulaMusica(4,10,20,false);
		
		System.out.println(a);
		System.out.println(ai);
		System.out.println(am1);
		System.out.println(am2);
		
	}
}
