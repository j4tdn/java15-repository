package ex02;

import java.util.Scanner;
// Lesson05 Exam KF
// Bai 2: Viết hàm kiểm tra một số có phải là số đặc biệt không. Biết rằng nếu
// tổng tất cả các số nguyên từ 1 đến n bằng S thì S là số đặc biệt.
public class CheckSpecialNumberApp {
	private static Scanner sc = new Scanner(System.in);
	public static boolean isSpecialNumber(int n) {
		int S = 0;
		for(int i = 1; i <= n; i++) {
			S += i;
			if(n == S) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int n;
		System.out.print("Input n: ");
		n = Integer.parseInt(sc.nextLine());
		boolean result = isSpecialNumber(n);
		String outputResult = result ? n + " is a special number!" : n + " is not a special number!";
		System.out.println(outputResult);
	}
}
