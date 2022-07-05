package view;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01FirstDegreeEquation {
	static int nhap() {
		int so;
		Scanner ip = new Scanner(System.in);
		while (true) {
			String str = ip.nextLine();
			so = Integer.parseInt(str);
			return so;
		}
	}

	public static void main(String[] args) {
		int a;
		int b;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		Scanner scanner = new Scanner(System.in);
		do {
			try {
				System.out.println("Nhập số a: ");
				a = nhap();
				System.out.println("Nhập số b: ");
				b = nhap();
				if(a == 0) {
					System.out.println("Lỗi chia cho 0.");
				}else {
					double nghiem = (double)-b / (double)a;
					System.out.println("Nghiệm= " + decimalFormat.format(nghiem));
					break;
				}
			} catch (NumberFormatException e1) {
				System.out.println("Lỗi chuyển đổi định dạng số.");
			}
//			} catch (ArithmeticException e2) {
//				System.out.println("Lỗi chia cho 0.");
//			}
		} while (true);
	}
}