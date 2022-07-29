package view;

public class Ex02DivisionAsThrows {
	public static void main(String[] args) {
		//Cách 2: Hậu xử lí --> Xử lí khi xảy ra lỗi, đảm bảo mã phía sau vẫn được thực thi
		//2.2 Throw/ Throws
		System.out.println("D1: " + devide(10,5));
		System.out.println("D2: " + devide(2,0));
		System.out.println("D3: " + devide(4,2));
	}
	
	// no need throws runtime exception --> unnecessary
	// not require to process(try/catch/throw/throws) at calling place
	private static int devide(int a,int b) /*throws ArithmeticException*/ {
		return a/b;
	}
	/*
	 * Exception in thread "main" java.lang.ArithmeticException: / by zero
		at view.Ex02DivisionAsThrow.devide(Ex02DivisionAsThrow.java:13)
		at view.Ex02DivisionAsThrow.main(Ex02DivisionAsThrow.java:8)
	 */
	
	
}
