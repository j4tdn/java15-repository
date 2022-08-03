package view;

public class Ex05LongestSubstring {
	public static void main(String[] args) {
		String s1 = "CTUABCEDAEABC";
		String s2 = "ABCEDACBBCK";
		String result = longestString(s1, s2);
		System.out.println(result);

	}

	private static String longestString(String s1, String s2) {

		int count = 0;
		int indexs1 = 0;
		String temp = "";
		String result = "";
		while (true) {
			for (int j = 0; j < s2.length(); j++) {

				if (s1.charAt(indexs1) == s2.charAt(j)) {

					temp += s1.charAt(indexs1);
					indexs1++;
				} else {
					if (temp.length() > result.length()) {
						result = temp;
					}
					temp = "";

				}
				if (indexs1 > s1.length() - 1) {
					break;
				}

			}
			indexs1++;
			if (indexs1 > s1.length() - 1) {
				break;
			}
		}

		return result;

	}
}
