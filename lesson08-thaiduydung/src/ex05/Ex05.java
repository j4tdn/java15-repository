package ex05;

import java.util.Scanner;

public class Ex05 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		String input1 = checkInput();
		System.out.print("Enter a string: ");
		String input2 = checkInput();
		System.out.println("Longest common substring: " + getLongestCommonSubstring(input1, input2));
	}

	private static String checkInput() {
		String input = sc.nextLine();
		if (input.length() > 250) {
			System.err.println("String length mustn't more than 250 characters!");
			System.err.print("Enter again: ");
			return checkInput();
		}
		if (!input.matches("[A-Z]+")) {
			System.err.println("String must be [A-Z]");
			System.err.print("Enter again: ");
			return checkInput();
		}
		return input;
	}

	// copy trên mạng nhưng ko hiểu ??
	private static String getLongestCommonSubstring(String s1, String s2) {
		int max = 0;
		int[][] dp = new int[s1.length()][s2.length()];
		int endIndex = -1;

		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					// if first row or column
					if (i == 0 || j == 0) {
						dp[i][j] = 1;
					} else {
						dp[i][j] = dp[i - 1][j - 1] + 1;
					}

					if (max < dp[i][j]) {
						max = dp[i][j];
						endIndex = i;
					}
				}
			}
		}
		// We want String upto endIndex, we are using endIndex+1 in substring.
		return s1.substring(endIndex - max + 1, endIndex + 1);
	}
}