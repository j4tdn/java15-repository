package view;

import java.util.Random;

public class Ex07RandomFiveNumber {
	public static void main(String[] args) {
		Random rd = new Random();
		int array[] = new int[30];
		int dem=1;
		while (dem<=5) {
			int n = rd.nextInt(20,30);
			if (array[n]==0) {
				System.out.println(n+" ");
				array[n]++;
				dem++;
			}
			
		}
	}
}
