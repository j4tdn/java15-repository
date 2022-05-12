package view;

import java.util.Random;

public class Ex07Random {
	public static void main(String[] args) {
		Random rd = new Random();
		int num1, num2, num3, num4, num5;
		num1 = rd.nextInt(20, 30);
		do {
			num2 = rd.nextInt(20, 30);
		} while (num2 == num1);
		do {
			num3 = rd.nextInt(20, 30);
		} while (num3 == num1 || num3 == num2);
		do {
			num4 = rd.nextInt(20, 30);
		} while (num4 == num1 || num4 == num2 || num4 == num3);
		do {
			num5 = rd.nextInt(20, 30);
		} while (num5 == num1 || num5 == num2 || num5 == num3 || num5 == num4);
	System.out.println(num1+", "+num2+", "+num3+", "+num4+", "+num5);
	}
}
