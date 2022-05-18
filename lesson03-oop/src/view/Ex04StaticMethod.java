package view;

public class Ex04StaticMethod {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;

		// Ex04StaticMethod o1 = new Ex04StaticMethod();

		System.out.println(" r1: " + Ex04StaticMethod.sum(a, b));
		System.out.println(" r2: " + sum(a, b));
		System.out.println(" r3: " + sum(a, b));
		// int result = o1.sum(a, b);
	}

	// static : not depends of calling object , khong phu thuoc doi tuong dang goi
	// : depends on class
	// non-static : depends on calling object

	private static int sum(int a, int b) {
		return a + b;
	}
}
