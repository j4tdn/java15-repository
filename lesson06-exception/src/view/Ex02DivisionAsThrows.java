package view;

public class Ex02DivisionAsThrows {
	public static void main(String[] args) {
		// Cách 2: Hậu xử lý --> Xử lý khi xảy ra lỗi để đảm bảo đoạn mã phía sau vẫn
		// được thực thi
		// 2.2 Throw/

		System.out.println("D1: " + divide(10, 2));
		System.out.println("D1: " + divide(2, 0));
		System.out.println("D1: " + divide(4, 2));
	}

	// No need to throws runtime exception --> unnecessary
	// No require to process(try/catch/throw/throws) at calling place
	private static int divide(int a, int b) /* throws ArithmeticException */ {
		return a / b;
	}
}
