package view;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		String s = "sadghgs265asdghja8712jash78a23jkash812s";
		//String[] numberAsString = s.split("[a-z]+");
		//System.out.println(Arrays.toString(numberAsString));
		
		String[] numberAsString = new String[s.length()/2];
		int running = 0;
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if(Character.isDigit(letter)) {
				builder.append(letter);
			}else {
				numberAsString[running++] = builder.toString();
				builder.delete(0, builder.length());
			}
		}
	}
//	private static int cut(String string) {
//		StringBuilder builder = new StringBuilder();
//	}
}
