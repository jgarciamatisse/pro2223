package _03ejercicios;

public class _13Subsecuencia {
	public static void main(String[] args) {
		
		int[] numeros = {2,3,1,2,4,1,2,13,4,9,10,13};
		System.out.println(posSubsecuencia(numeros));
		
	}
	public static int posSubsecuencia(int[] v) {
		int pos = -1;
		for (int i = 0; i < v.length - 2  && pos == -1; i++) {
			if(v[i] + 1 == v[i + 1] && v[i] + 2 == v[i + 2]) {
//			if(v[i] == v[i + 1] -1 && v[i] == v[i + 2] - 2) {
				pos = i;
			}
		}
		return pos;
	}
}
