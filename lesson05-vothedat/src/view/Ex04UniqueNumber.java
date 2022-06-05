package view;

import java.util.Scanner;

public class Ex04UniqueNumber {
	private static int getUniqueNumbers(int Number[], int n, int a) {
		 int tmp = a;
         int count = 0;
         for(int i = 0; i < n; i++) {
        	 if(Number[i] == tmp) count++;
         }
         return count;
	}
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = Integer.parseInt(ip.nextLine());
		int cnt = 0;
		if (n > 2 && n < 20) {
			int Number[] = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.println("Nhap phan tu " + (i + 1) + ":");
				Number[i] = Integer.parseInt(ip.nextLine());
			}
			for (int num : Number) {
				if(getUniqueNumbers(Number, n, num) == 0) {
					System.out.println("result: " + num + " ");
				}
			}
		}
	}
}
