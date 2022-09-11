package logic;

public class LeastCommonMultiple {
	public static void main(String[] args) {
		int[] numbers = { 2, 4, 8, 5};
		
		
		System.out.println("dcm " + lcm(numbers));

	}

	private static int gcm(int a, int b) {
		while(a != b) {
			if ( a > b) {
				a =a - b;
			}else {
				b =b - a;
			}
		}
		return a;
	}
	private static int lcm(int[] element) {
		int result = gcd(element[0], element[1]);
		for (int i = 2; i < element.length; i++) {
			result  = gcd(result, element[i]);
		}
		return result;
	}
	private static int gcd(int a, int b) {
		return (a * b) / gcm(a, b);
	}
}
