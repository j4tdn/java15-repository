import java.util.Scanner;

/**
 * Giải phương trình bậc nhất ax + b = 0 .
 * Các hệ số nhập vào từ bàn phím.
 * Sử dụng try-catch để bẫy các lỗi 
 * khi nhập sai kiểu dữ liệu, ví dụ nhập số nhưng nhập chữ;Bẫy lỗi chia 0
 * trường hợp xảy ra lỗi phải thông báo cho người dùng biết và nhập lại đến khi a b hợp lệ
 * in ra kết qua x = -b/a
 * */
public class Ex01LinearQuation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a,b;
		while(true) {
			try {
				System.out.print("Enter a = ");
				a = Double.parseDouble(input.nextLine());
				System.out.print("Enter b = ");
				b = Double.parseDouble(input.nextLine());
				System.out.println(a + "*x + " + b + " = 0");
				System.out.println("==> x = " + divide(a, b));
				break;
			} catch (NumberFormatException e) {
				System.out.println("Error: Input must be a number! Please enter again!");
			} catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private static double divide(double a, double b) {
		if(a == 0) {
			throw new ArithmeticException("Error: divide by 0! Please enter again!");
		}
		return -b / a;
	}
}
