package _02ejemplos;

import java.util.ArrayList;
import java.util.LinkedList;

public class _01ArrayVsLinked {
	final static int SIZE = 400000;
	public static void main(String[] args) {
		long t1, t2;
		
		
		ArrayList<Integer> al = new ArrayList<>();
		t1 = System.currentTimeMillis();
		for(int i = 0; i < SIZE; i++) {
			al.add(0,i);
		}
		t2 = System.currentTimeMillis();
		System.out.println("ArrayList " + (t2 - t1));

		LinkedList<Integer> ll = new LinkedList<>();
		t1 = System.currentTimeMillis();
		for(int i = 0; i < SIZE; i++) {
			ll.add(0,i);
		}
		t2 = System.currentTimeMillis();
		System.out.println("LinkedList " + (t2 - t1));
		
	}
}
