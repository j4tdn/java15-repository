package view;

import java.util.Scanner;

/*
 * Giải phương trình bậc nhất ax + b = 0 . Các hệ số nhập vào từ bàn phím. Sử dụng try -
catch để bẫy các lỗi khi nhập sai kiểu dữ liệu, ví dụ nhập số nhưng nhập chữ. Bẫy lỗi chia 0,
trường hợp xảy ra lỗi phải thông báo cho người dùng biết và nhập lại đến khi a b hợp lệ thì in ra
kết qua x = -b/a
 * */
public class Ex01SolveFirstDegreeEquation {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a = 0;
		int b = 0;
		do {
			try {
				System.out.print("Input a: ");
				a = Integer.parseInt(ip.nextLine());
				System.out.print("Input b: ");
				b = Integer.parseInt(ip.nextLine());
				if(a == 0 && b == 0) {
					System.out.println(">>>> Wealth of Counter!!");
					break;
				}
				System.out.println(">>>> Result: x = " + (float)-b/a);
				break;
			} catch (NumberFormatException e) {
				System.out.println(">>>> Invalid number!!!");
			}
			catch (ArithmeticException e) {
				System.out.println(">>>> Can't divide by zero !!!");
			}
		} while (true);
		System.out.println(">>>> Finished !!!");
	}
}
