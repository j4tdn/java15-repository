package view;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] a = new int[10];
		for (int i = 0; i < 5; i++) {
			while (true) {
				int b = rd.nextInt(20, 30);
				int c = 0;
				for (int j = 0; j < i; j++) {
					if (b == a[j]) {
						c = 1;
						break;
					}
				}
				if (c == 0) {
					a[i] = b;
					break;
				}
			}
			System.out.println("phan tu trong mang la : " + a[i]);
		}
	}
}
