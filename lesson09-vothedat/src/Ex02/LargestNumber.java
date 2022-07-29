package Ex02;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = Integer.parseInt(ip.nextLine());
		while(n > 0) {
			String s = ip.nextLine();
			getLargestNumbers(s);
			n--;
		}
	}

	private static void getLargestNumbers(String s) {
		int n;
		int count = 1, max = 0, firstIndex = 0;
		for(int i = 1; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i)) && Character.isDigit(s.charAt(i-1))) {
				count++ ;
			} else count = 1;
			if(count >= max) {
				max = count;
				firstIndex = i - max + 1;
			}
	    }
		for(int i = firstIndex; i <= firstIndex + max - 1; i++) {
			System.out.print(s.charAt(i));
		}
	}
}
