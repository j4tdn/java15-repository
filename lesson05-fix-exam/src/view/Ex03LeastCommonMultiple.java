package view;

/**
 * Cho mảng A gồm n phần tử (2 < n < 20). Ak = [1, 10]
Tìm bội chung nhỏ nhất của các phần tử trong mảng
VD1: Ak = [2, 3] >> BCNN = 6
VD2: Ak = [2, 3, 4] >> BCNN = 12
 * */
public class Ex03LeastCommonMultiple {
	public static void main(String[] args) {
		//Least Common Multiple: BCNN
		//Greatest Common Divisor: UCLN
		
		//problem 1: get LCM of 2 elements
		System.out.println("LCM of 4 & 6: " + lcm(4, 6));
		System.out.println("LCM of 28 & 12: " + lcm(28, 12));
		System.out.println("LCM of 6 & 8: " + lcm(6, 8));
		
		System.out.println("====================");
		//step 1: get LCM of n elements
		int[] elements1 = {2, 3, 4};
		System.out.println("LCM of n elements: " + lcm(elements1));
		int[] elements2 = {3, 5, 12};
		System.out.println("LCM of n elements: " + lcm(elements2));
	}
	
	private static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}
	
	private static int gcd(int a, int b) {
		while(a != b) {
			if(a > b) {
				a = a - b;
			}else {
				b = b - a;
			}
		}
		return a;
	}
	
	private static int lcm(int[] elements) {
		int length = elements.length;
		if(length == 0) {
			System.out.println("Require --> At least 1 element");
			return Integer.MIN_VALUE;
		}
		
		if(length == 1) {
			System.out.println("Info --> Array only has 1 element");
			return elements[0];
		}
		
		int result = lcm(elements[0], elements[1]);
		for(int i = 2; i < length; i++) {
			result = lcm(result, elements[i]);
		}
		return result;
	}
}
