package view;

import java.util.Scanner;

public class Ex01Triangle {
	public static void main(String[] args) {
      Scanner ip = new Scanner(System.in);
      System.out.print("Please Enter numbers of n :");
      int n = ip.nextInt();
      function(n);
	}
	public static void function(int n) {
		int value = 2*n -1;
		for (int i = 1; i <= n - 1 ; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(j + "\t");
			}
			for (int k = 1; k < 2*(n -i) -1; k++) {
				System.out.print("\t");
				
			}
			for (int l = value - i + 1  ; l <= value; l++) {
				System.out.print(l + "\t");
			}
			System.out.println("");
		}
		for (int i = 1; i <= value; i++) {
			System.out.print(i + "     " );
		}
		System.out.println("");
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(j + "\t");
			}
			for (int k = 1; k < 2*(n -i) -1; k++) {
				System.out.print("\t");
				
			}
			for (int l = value - i + 1  ; l <= value; l++) {
				System.out.print(l + "\t");
			}
			System.out.println("");
		}
	}
}
