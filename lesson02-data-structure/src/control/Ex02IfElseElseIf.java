package control;

import java.util.Random;

public class Ex02IfElseElseIf {
	public static void main(String[] args) {
			Random rd = new Random();
			String result = Check(rd.nextFloat(10));
			System.out.println(result);
	}
	
	private static String Check(float score) {
		String result = "";
		if(score < 5) {
			result = "BAD";
		}
		else if (score < 6.5) {
			result = "MEDIUM";
		}
		else if (score < 8) {
			result = "GOOD";
		}
		else result = "VERY GOOD";
		return result;
	}
}
