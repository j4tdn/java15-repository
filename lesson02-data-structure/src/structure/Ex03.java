package structure;

public class Ex03 {
	public static void main(String[] args) {
		int number = 18;
		mod(number);
		int updated = update(number);
		System.out.println("number: "  + number);
		System.out.println("updated: "  + updated);
	}
	public static void mod(int input){
		input = 99;
	}
	public static int update(int input) {
		input = 32;
		return input;
	}
}
