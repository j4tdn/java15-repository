package view;

import java.awt.image.RescaleOp;
import java.util.ArrayList;
import java.util.Iterator;

public class Ex03MaxValidNumber {
	public static void main(String[] args) {
		String numberMixText = "1200abu02mu8799zk586cyx";
        System.out.println(findMaxNumber(numberMixText));
	}

	private static int findMaxNumber(String numberMixString) {
		int maxNumber = 0;
		int tmp = 0;
		for (int i = 0; i < numberMixString.length(); i++) {
			if (numberMixString.charAt(i) > 47 && numberMixString.charAt(i) < 58) {
				maxNumber = maxNumber*10 + (numberMixString.charAt(i) - '0');
				//System.out.println(numberMixString.charAt(i)- '0');
			} else {
				tmp = Math.max(tmp, maxNumber);
				maxNumber = 0;
			}
		}
		return Math.max(tmp, maxNumber);
	}
}
