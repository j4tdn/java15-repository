package structure;

public class Ex03 {
	public static void main(String[] args) {
		int number = 18;

		// modified(number);
		int updated = update(number);

		System.out.println("number: " + number); // 18
		System.out.println("updated: " + updated); // 99

		int r1 = sum(5, 7);
		int r2 = sum(2, 4);
		
		System.out.println(r1 + r2);
	}

	// flexible to pass the parameters
	public static int sum(int a, int b) {
		return a + b;
	}

	public static void modified(int input) {
		input = 99;
	}

	public static int update(int input) {
		input = 99;
		return input;
	}
}
