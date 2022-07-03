package view;

public class Ex02DivisionAsThrows {
	public static void main(String[] args) {
		// Cách 2 : Hậu xử lý --> Xử lí khi xảy ra lỗi , đảm bảo đoạn mã phía sau vẫn
		// được thực thi
		// 2.2 Throw/Throws
		System.out.println("D1:" + divide(5, 5));
		System.out.println("D1:" + divide(2, 0));
		System.out.println("D1:" + divide(4, 2));
	}

	// No need to throw runtime exception --> unecessary
	// not require to process at calling place
	private static int divide(int a, int b) /* throws ArithmeticException */ {
		return a / b;
	}

}
