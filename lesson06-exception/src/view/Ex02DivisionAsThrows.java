package view;

public class Ex02DivisionAsThrows {
	public static void main(String[] args) {
		// cách 2: Hậu xử lý --> Xử lý khi xảy ra lỗi, đảm bảo đoạn mã phía sau vẫn được thực thi
		// 2.1 Throw/Throws
	System.out.println("D1: " + divide(10, 5));
	System.out.println("D2: " + divide(2, 0));
	System.out.println("D3: " + divide(4, 2));
	
	}
	//Uncheck = Runtime Exception
	// no need to throws runtime exception --> unnecessary
	// no require to process(try/catch/throw/throws) at calling place
	private static int divide(int a, int b) /*throws ArithmeticException*/ {
			return a/b;
	}
}
