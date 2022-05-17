package view;

public class Ex04StaticMethod {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		Ex04StaticMethod.sum(a, b);
	}

	private static int sum(int a, int b) {
		return a + b;
	}
}
