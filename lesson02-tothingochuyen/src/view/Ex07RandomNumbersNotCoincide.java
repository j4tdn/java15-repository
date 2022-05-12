package view;

import java.util.Random;

public class Ex07RandomNumbersNotCoincide {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] a = new int[5];
		
		a[0] = 20 + rd.nextInt(30 - 20 + 1);
		
		do {
			a[1] = 20 + rd.nextInt(30 - 20 + 1);
		}while(a[1] == a[0]);
		
		do {
			a[2] = 20 + rd.nextInt(30 - 20 + 1);
		}while(a[2] == a[0] || a[2] == a[1]);
		
		do{
			a[3] = 20 + rd.nextInt(30 - 20 + 1);
		}while(a[3] == a[0] || a[3] == a[1] || a[3] == a[2]);
		
		do {
			a[4] = 20 + rd.nextInt(30 - 20 + 1);
		}while(a[4] == a[0] || a[4] == a[1] || a[4] == a[2] || a[4] == a[3]);	
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]= " + a[i]);
		}
	}
}
