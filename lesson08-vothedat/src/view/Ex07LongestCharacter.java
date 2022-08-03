package view;

public class Ex07LongestCharacter {
	public static void main(String[] args) {
		String text = "aaabbbaaabbbbbaaaaa";
		int count = 1, max = 0, firstIndex = 0, min = text.length(), firstIndex1 = 0, count1 = 1, min2 = text.length(), count2 = 1;
		for (int i = 1; i < text.length(); i++) {
			if (text.charAt(i) == text.charAt(i - 1)) {
				count++;
			} else
				count = 1;
			if (count > max) {
				max = count;
				firstIndex = i - max + 1;
			}
		}
		for (int i = 1; i < text.length(); i++) {
			if(text.charAt(i) == text.charAt(i-1)) {
				count1++;
			} else count1 = 1;
			count2 = count1;
			if(count2 < min && count2 > 1) min = count2;
		}
		System.out.println(max);
		System.out.println(firstIndex);
		for (int i = firstIndex; i <= firstIndex + max - 1; i++) {
			System.out.print(text.charAt(i));
		}
		System.out.println("\n================================");
		System.out.println(text.length());
		System.out.println(min);
		System.out.println(firstIndex1);
		// for(int i1 = firstIndex1; i1 <= firstIndex1 + min - 1; i1++) {
		// System.out.print(text.charAt(i1));
		// }
	}
}
