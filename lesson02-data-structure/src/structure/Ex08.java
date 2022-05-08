package structure;

public class Ex08 {
	public static void main(String[] args) {
		int a = 12;
		int b = 36;

		// case 1 ==> code in MAIN method ==> hard code
		int tmp = a; // tmp =5
		a = b;
		b = tmp;

		System.out.println("a: " + a);
		System.out.println("b: " + b);

		swap(a, b);

		System.out.println("====AFTER SWAP====");

		System.out.println("a: " + a); // 12
		System.out.println("b: " + b); // 36

	}

	// case 2 ==> create a METHOD for reusable
	// int f = a 12
	// int s = b 36
	private static void swap(int f, int s) {

		int tmp = f;
		f = s;
		s = tmp;
		System.out.println();
	}
}
