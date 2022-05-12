package main;

import java.util.Arrays;

public class Task35 {
	public static void main(String[] args) {
		int[] nbs = { 13, 1, 13, 25, 33, 16, 11 };
		
		System.out.println(Arrays.toString(odd(nbs)));
	}
	public static int[] odd(int[] elements) {
		int[] result = new int[elements.length];
		int count = 0;
		for (int element : elements) {
			if(element % 2 != 0) {
				result[count] = element;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
