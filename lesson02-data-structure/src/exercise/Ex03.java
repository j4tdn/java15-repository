package exercise;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int num = ip.nextInt();
		if (checkSymmetryNum(num) == 1) {
			System.out.println("La so doi xung");
		} else if (checkSymmetryNum(num) == 0) {
			System.out.println("Khong la so doi xung");
		} else {
			System.out.println("Invalid value!");
		}
	}

	public static int checkSymmetryNum(int num) {
		int i = 1;
		int tmp1 = 0;
		int tmp2 = num;
		if (num > 0) {
			for (int r = 0; num != 0; num /= 10) {
				r = num % 10;
				tmp1 = tmp1 * 10 + r;
			}
		} else {
			return -1;
		}
		if (tmp1 == tmp2) {
			return 1;
		} else {
			return 0;
		}
	}
}
