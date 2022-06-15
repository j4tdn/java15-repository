package view;
import java.util.Scanner;

//05.KT
public class Ex01 {
	static boolean isPowerOf(int a, int b) {
		if (a < b) {
			for (int i = 1; i < b; i++) {
				if (Math.pow(a, i) == b) {
					return true;
				}
			}
		} else {
			for (int i = 1; i < a; i++) {
				if (Math.pow(b, i) == a) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap 2 so bat ky: ");
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("ket qua : " +isPowerOf(a, b));
	}
}
