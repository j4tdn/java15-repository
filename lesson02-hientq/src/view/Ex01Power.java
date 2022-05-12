package view;

import java.util.Scanner;

// Viet chuong trinh kiem tra n co phai luy thua cua x khong?
public class Ex01Power {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * Function input value tu ban phim va return ve ket qua
	 * @param promt
	 * @param error
	 * @return
	 */
	private static int inputValueInto(String promt, String error) {
		int n;
		while (true) {
			System.out.print(promt);
			String nInText = sc.nextLine();
			if (nInText.matches("\\d+")) {
				n = Integer.parseInt(nInText);
				break;
			} else {
				System.out.println(error);
			}
		}
		return n;
	}

	/**
	 * Function kiem tra n co phai la luy thua cua co so x hay khong? Return true/false
	 * @param n
	 * @param x
	 * @return
	 */
	private static boolean isPowerOf(int n, int x) {
		double log = Math.log(n) / Math.log(x);
		return Math.ceil(log) == Math.floor(log);
	}

	public static void main(String[] args) {
		int n, x;
		n = inputValueInto("Nhap n: ", "Invalid number! Please try again!");
		x = inputValueInto("Nhap x: ", "Invalid number! Please try again!");

		String result = isPowerOf(n, x) ? n + " is power of " + x : n + " is not power of " + x;
		System.out.println(result);
	}

}
