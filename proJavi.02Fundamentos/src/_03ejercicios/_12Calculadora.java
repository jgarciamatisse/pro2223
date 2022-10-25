package _03ejercicios;

import java.util.Scanner;

public class _12Calculadora {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Primer numero: ");
		int num1 = tec.nextInt();
		System.out.println("Segundo numero: ");
		int num2 = tec.nextInt();
		System.out.println("Operacion: ");
		String op = tec.next();
	
		if(op.equals("+")) {
			System.out.format("%d + %d = %d",num1, num2, num1 + num2);
		} else if(op.equals("-")) {
			System.out.format("%d + %d = %d",num1, num2, num1 - num2);
		} else if(op.equals("*")) {
			System.out.format("%d + %d = %d",num1, num2, num1 * num2);
		} else if(op.equals("/")) {
			System.out.format("%d + %d = %d",num1, num2, num1 / num2);
		} 
	}

}


