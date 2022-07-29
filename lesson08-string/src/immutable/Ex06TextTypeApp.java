package immutable;

import bean.Count;

public class Ex06TextTypeApp {
	public static void main(String[] args) {
		String str = "aBcD172#@!";
		Count c;
		c = count(str);
		System.out.println("Num of UpperCase: " + c.getCountUpperCase());
		System.out.println("Num of LowCase: " + c.getCountLowerCase());
		System.out.println("Num of Number: " + c.getCountNumber());
	}

	private static Count count(String s) {
		Count c = new Count();
//		int[] arr = { 0, 0, 0 };
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
//				arr[0]++;
//			}
//			if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
//				arr[1]++;
//			}
//			if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
//				arr[2]++;
//			}
//		}

		int numOfUpperCase = 0;
		int numOfLowerCase = 0;
		int numOfNumber = 0;
		for (int i = 0; i<s.length(); i++) {
			char letter = s.charAt(i);
			if (Character.isUpperCase(letter)) {
				numOfUpperCase++;
				continue;
			}
			if (Character.isLowerCase(letter)) {
				numOfLowerCase++;
				continue;
			}
			if (Character.isDigit(letter)) {
				numOfNumber++;
			}
		}
		c.setCountUpperCase(numOfUpperCase);
		c.setCountLowerCase(numOfLowerCase);
		c.setCountNumber(numOfNumber);
		return c;
	}
}
