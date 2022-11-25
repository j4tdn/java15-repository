package exam;

import java.util.HashSet;

public class HappyNumber {
	public static void main(String[] args) {
		
		int n = 13;
		System.out.println(n + " " + check(n));
		int m = 19;
		System.out.println(m + " " + check(m));
		
	}
	private static int sumSquare(int number) {
		int result = 0;
		while(number>0) {
			result += (int)Math.pow(number%10, 2);
			number /= 10;
		}
		return result;
	}
	private static boolean check(int number) {
		HashSet<Integer> collectors = new HashSet<Integer>();
		int temp = sumSquare(number);
		while(true) {
			if(temp == 1) return true;
			if(collectors.contains(temp)) return false;
			collectors.add(temp);
			temp = sumSquare(temp);
		}
	}
}
	