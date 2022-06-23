package view;

public class Ex02DivisionAsThrow {
	public static void main(String[] args) {

		System.out.println("D1: " + divide(10, 5));
		System.out.println("D2: " + divide(2, 0));
		System.out.println("D3: " + divide(4, 2));
	}

	private static int divide(int a, int b) throws ArithmeticException {
		
			return a / b;
		
		
	}
}

/*
 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
 * view.Ex02DivisionAsThrow.divide(Ex02DivisionAsThrow.java:11) at
 * view.Ex02DivisionAsThrow.main(Ex02DivisionAsThrow.java:7)
 */
