package exercise;

import java.lang.Math;

public class Ex01Exponential {
	public static void main(String[] args) {
		int n = 100;
		for (int i = 1; i < n; i++) {
			n = (int) Math.pow(2, i);
			System.out.println("n là lũy thừa của 2");
		}
		System.out.println("n không phải là lũy thừa của 2");
	}
}
