package structure;

public class Ex03 {
	public static void main(String[] args) { // terminate x
		int number = 18;

		// modified(number);
		int updated = update(number);

		System.out.println("number: " + number); // 18
		System.out.println("updated: " + updated); // 99
	}

	// access_modifier [static] return_type method_name(list of parameters) {
	// body
	// }

	// pass by value
	// int input = number
	public static void modified(int input) {
		// local variable
		input = 99;
	}

	public static int update(int input) {
		input = 99;
		return input;
	}
}