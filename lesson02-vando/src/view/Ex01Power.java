package view;

import java.util.Scanner;

public class Ex01Power {
			public static void main(String[] args) {

				Scanner ip = new Scanner(System.in);

				System.out.println("Nhập số: ");
				int number = Integer.parseInt(ip.nextLine());
//				if (isPowerOfTwo(number) == true) {
//					System.out.println(number + " Là lũy thừa của 2");
//				} else {
//					System.out.println(number + " Không phải Là lũy thừa của 2");
//				}
				boolean isPower = isPowerOfTwo(number);
				System.out.println("==> " + isPower);
				
				System.out.println("==============================");
				
				System.out.println("8-2: " + isPower(8, 2));
				System.out.println("7-3: " + isPower(7, 3));
				System.out.println("2-8: " + isPower(2, 8));

			}
			private static boolean isPowerOfTwo(int n) {
//				if (1 == n)
//					return true;
//				int x = n / 2;
//				int y = n % 2;
//				if (1 == y) {
//					return false;
//				} else {
//					return isPowerOfTwo(x);
//				}
				
				double log = Math.log(n) / Math.log(2);
				System.out.println(n + " ==> " + log);
				
				return Math.ceil(log) == Math.floor(log);
				
			}
			private static boolean isPower(int a, int b) {
				double log = a > b ?Math.log(a) / Math.log(b) : Math.log(b) / Math.log(a);
				return Math.ceil(log) == Math.floor(log);
			}
}
