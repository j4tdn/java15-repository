package exercise;

import bean.LongShortestString;

// 5 "aaaaa" [9]
// 1 "b" [3]

public class Ex03 {
	public static void main(String[] args) {
		String s = "aaabaaabbaaaaa";
		System.out.println(findLongShortestString(s));
	}

	private static LongShortestString findLongShortestString(String s) {
		int longOfLongestString = 1;
		String detailOfLongestString = null;
		int indexOfLongestString = 0;
		int longOfShortestString = 1;
		String detailOfShortestString = null;
		int indexOfShortestString = 0;

		int count = 1;
		int index = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i - 1) == s.charAt(i)) {
				count++;
				continue;
			} else {
				if (count > longOfLongestString) {
					longOfLongestString = count;
					detailOfLongestString = s.substring(index, i);
					indexOfLongestString = i;
					index += count;
					continue;
				}
				if (count < longOfShortestString) {
					longOfShortestString = count;
					detailOfShortestString = s.substring(index, i);
					indexOfShortestString = i;
					index += count;
				}
			}
		}
		return new LongShortestString(longOfLongestString, detailOfLongestString, indexOfLongestString,
				longOfShortestString, detailOfShortestString, indexOfShortestString);
	}

}
