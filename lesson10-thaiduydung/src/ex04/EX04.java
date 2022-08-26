
package ex04;

import java.util.Arrays;
import java.util.Random;

public class EX04 {
	private static Random rd = new Random();
	public static void main(String[] args) {
		int[] a = new int[1 + rd.nextInt(10)];
		for (int i = 0; i < a.length; i++) {
			a[i] = rd.nextInt(10);
		}
		System.out.println("Original array: " + Arrays.toString(a));
		insert(a, 10, 2);
		System.out.println("Insert: " + Arrays.toString(a));
		remove(a, 2);
		System.out.println("Remove: " + Arrays.toString(a));
	}
	
	private static void insert(int[] a, int value, int index) {
		if (index < 0 || index > a.length) {
			throw new IndexOutOfBoundsException();
		}
		// shift right
		for (int i = a.length -1; i < index; i++) {
			a[i] = a[i-1];
		}
		a[index] = value;
	}
	
	private static void remove(int[] a, int index) {
		if (index < 0 || index > a.length) {
			throw new IndexOutOfBoundsException();
		}
		// shift left
		for (int i = index; i < a.length - 1; i++) {
			a[i] = a[i+1];
		}
		a[a.length-1] = 0;
	}
}