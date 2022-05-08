package lession02;

public class Ex03 {

	public static void main(String[] args) {
		int number = 18;
		int updated = update(number);

		System.out.println("numer: " + number);// 18
		System.out.println("updated: " + updated);// 99

	}

//	public static int sum(int a; int b) {
//		
//		return a+b;
//	}

	public static void modified(int input) {
		input = 99;
	}

	public static int update(int input) {
		input = 2001;
		return input;
	}

}
