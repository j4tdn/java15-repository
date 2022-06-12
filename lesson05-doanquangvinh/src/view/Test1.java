package view;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		String inputString = "120abu02muzk586cyx";
		String digitStr = "";
		int tmp = 0;
		int max = 0;
		ArrayList<Integer> digits = new ArrayList<Integer>();

		for (int i = 0; i < inputString.length(); i++) {
			if (Character.isDigit(inputString.charAt(i))) {
				digitStr += inputString.charAt(i);
			} else {
				if (!digitStr.isEmpty()) {
					digits.add(Integer.parseInt(digitStr));
					digitStr = "";
				}
			}
		}
		if (!digitStr.isEmpty()) {
			digits.add(Integer.parseInt(digitStr));
			digitStr = "";
		}

		for (int i = 0; i < digits.size(); i++) {
		//	System.out.println(digits.get(i));
			int r1 = tmp > digits.get(i) ? tmp : digits.get(i);
			System.out.println(r1);
		}
		System.out.println(max);
	}
}