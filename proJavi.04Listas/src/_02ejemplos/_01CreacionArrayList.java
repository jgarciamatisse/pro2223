package _02ejemplos;

import java.util.ArrayList;

public class _01CreacionArrayList {
	public static void main(String[] args) {
		//Declaracion y creacion
		ArrayList<String> dias; //declaracion de un ArrayList de String
		dias = new ArrayList<>(); //creacion del ArrayList
		
		//Declaracion y creacion en un solo paso
		ArrayList<String> meses = new ArrayList<>();
		
		//No se pueden crear ArrayList's de tipos primitivos 
		// (byte, short, int, long, double, float, char, boolean)
		//ArrayList<int> prueba = new ArrayList<>();
		
		//Por cada tipo primitivo existe una clase envoltorio (wrapper)
		// byte -> Byte
		// short -> Short
		// int -> Integer
		// long -> Long
		// float -> Float
		// double -> Double
		// char -> Character
		// boolean -> Boolean;
		ArrayList<Integer> edades = new ArrayList<>();
		
	}
}
