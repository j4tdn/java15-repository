package structure;

public class Ex03 {
	public static void main(String[] args) {
		int number= 18;
		int updated = update(number);
		System.out.println("number: " + number);
		System.out.println("updated:" + updated);
		int r1 = sum(5, 7);
		int r2 = sum(2, 4);
	}

	public static int sum(int a, int b) {
		return a + b;

	}

	public static void modifide(int input) {
		input = 99;
	}



public static int update(int input) {
	input =99;
	return input;
}
}