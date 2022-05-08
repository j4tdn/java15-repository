package Homework_Lesson2;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.println("Nhập số: ");
		int number = Integer.parseInt(ip.nextLine());
		if(number == symmetry(number)) {
			System.out.println(number + " Là số đối xứng");
		}else {
			System.out.println(number + " Là số không đối xứng");
		}
		
	}
	private static int symmetry(int number) {
		int reverse = 0;
		while(number > 0) {
			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}
		return reverse;
		
	}
}
