package exercise;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int number;
		Scanner ip = new Scanner(System.in);
		number = ip.nextInt();
		if (checkExponentialOf2(number)) {
			System.out.println("La luy thua cua 2");
		} else {
			System.out.println("Khong la luy thua cua 2");
		}

	}

	public static boolean checkExponentialOf2(int num) {
		do {
			if(num % 2 == 0) {
				num  /= 2;
			} else {
				return false;
			}
		} while(num > 1);
		return true;
	}
}
