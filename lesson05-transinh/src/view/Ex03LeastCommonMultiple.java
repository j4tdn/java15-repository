package view;

public class Ex03LeastCommonMultiple {
	public static void main(String[] args) {
		// Problem 01: Get LCM of 2 elements
		
		// Step 1: Get GCD of 2 elements
		
		// Step 2: Formula --> LCM = (a * b) / GCD(a, b)
		System.out.println("LCM of 4 & 6: " + lcm(4, 6));
		System.out.println("LCM of 28 & 12: " + lcm(28, 12));
		System.out.println("LCM of 6 & 8: " + lcm(6, 8));
		
		System.out.println("\n========================\n");
		
		// Problem 02: Get LCM of n elements
		int[] elements = {3,5,12};
		System.out.println("LCM of n elements: " + lcm(elements));
	}
	
	private static int lcm(int[] elements) {
		int length = elements.length;
		if (length == 0) {
			System.out.println("Require --> At least 1 element");
			return Integer.MIN_VALUE;
		}
		
		if (length == 1) {
			System.out.println("Info --> Array only has 1 element");
			return elements[0];
		}
		
		int result = lcm(elements[0], elements[1]);
		
		for (int i = 2; i < length; i++) {
			result = lcm(result, elements[i]);
		}
		
		return result;
	}
	
	/**
	 * Least Common Multiple = Bội chung nhỏ nhất
	 * Greatest Common Divisor = Ước chung lớn nhất
	 */
	private static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
	
	private static int gcd(int a, int b) {
		while(a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
}