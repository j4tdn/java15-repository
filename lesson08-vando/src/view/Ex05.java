package view;

public class Ex05 {

	private static String longestsubstring(String s1, String s2) {
		int Start = 0;
		int Max = 0;
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				int x = 0;
				while (s1.charAt(i + x) == s2.charAt(j + x)) {
					x++;
					if (((i + x) >= s1.length()) || ((j + x) >= s2.length()))
						break;
				}
				if (x > Max) {
					Max = x;
					Start = i;
				}
			}
		}
		return s1.substring(Start, (Start + Max));
	}

	public static void main(String[] args) {
		String s1 = "s1: ABCEDEABCEDFGKKK";
		String s2 = "s2: ABCEDCBBCEDFGKK";

		System.out.println("Chuỗi chung con dài nhất: " + longestsubstring(s1, s2));
	}

}
