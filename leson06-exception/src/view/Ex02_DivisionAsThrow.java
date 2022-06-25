package view;

public class Ex02_DivisionAsThrow {
	public static void main(String[] args) {
		//2.2 Throw/Throws
		System.out.println("D1: " + divide(5, 0));
	}
	private static int divide(int a, int b) throws ArithmeticException {
		return a/b;
	}
}
