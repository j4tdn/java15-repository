package view;

import java.util.Scanner;

public class Ex03Symmetrical {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhap so can kiem tra:");
		int input = sc.nextInt();
		CheckSymmetrical(input);
	}

	private static void CheckSymmetrical(int input) {
		int save = input;
		int output = 0;
		while (input > 0) {
			int x = input % 10;
			input = input / 10;
			output = output * 10 + x;

		}
		if (save == output) {
			System.out.println(save + " Là số đối xứng");
		} else {
			System.out.println(save + " Không phải là số đối xứng");

		}

	}
}
