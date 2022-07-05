package view;

public class Ex02DivisionAsThrows {
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
 * view.Ex02DivisionAsThrows.divide(Ex02DivisionAsThrows.java:11) at
 * view.Ex02DivisionAsThrows.main(Ex02DivisionAsThrows.java:7)
 */
