import java.util.Scanner;

public class Ex01FirstDegreeEquation {
	private static Scanner ip = new Scanner(System.in);
	private static float a = 0;
	private static float b = 0;

	public static void main(String[] args) {

		do {
			System.out.println("Enter a and b: ");
			try {
				a = Integer.parseInt(ip.nextLine());
				b = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException n) {
				System.out.println(">>> Invalid number !!!");
			}
		} while (true);

		System.out.println(firstDegreeEquation(a, b));
	}

	public static float firstDegreeEquation(float a, float b) {
		if (a == 0) {
			throw new ArithmeticException("a must be different 0");
		}
		return -b/a;
	}
}
