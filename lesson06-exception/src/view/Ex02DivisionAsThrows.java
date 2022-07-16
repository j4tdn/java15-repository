package view;

public class Ex02DivisionAsThrows {
	public static void main(String[] args) {
		// Cách 2: Hậu xử lý --> Xử lý khi xảy ra lỗi, đảm bảo đoạn mã phía sau vẫn được thực thi
		// 2.2 Throw/Throws
		
		System.out.println("D1: " + divide(5, 5));
		System.out.println("D2: " + divide(2, 0));
		System.out.println("D3: " + divide(4, 2));
	}
	
	// Unchecked-Runtime Exception
	// No need to throws runtime exception --> unnecessary
	// Not require to process(try/catch/throw/throws) at calling place
	private static int divide(int a, int b) /*throws ArithmeticException*/ {
		return a/b;
	}
	
	/*
	Exception in thread "main" java.lang.ArithmeticException: / by zero
	at view.Ex02DivisionAsThrow.divide(Ex02DivisionAsThrow.java:14)
	at view.Ex02DivisionAsThrow.main(Ex02DivisionAsThrow.java:9)
	 */
}