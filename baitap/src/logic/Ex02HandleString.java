package logic;

import bean.CountLetter;

public class Ex02HandleString {
	public static void main(String[] args) {
		String s = "hello java15";
		System.out.println(getWoSon(s));
		//System.out.println(Character.toString(s.charAt(3)));

	}

	private static CountLetter getWoSon(String text) {
		
		int countWowel = 0;
		int countSon = 0;
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			switch (c) {
			case 'u':
			case 'e':
			case 'o':
			case 'a':
			case 'i':
				countWowel++;
				break;

			}

		}
		countSon = text.length() - countWowel;
		return new CountLetter(countWowel, countSon);
	}
}
