package exercises;

public class Ex07 {
	public static void main(String[] args) {
		String text = "aaabaaabbaaaaa";
		int longestString = Integer.MIN_VALUE;
		int shortestString = Integer.MAX_VALUE;
		int count = 1;
		int dem = 1;
		String shortestValue = "";
		String tmp = "";
		String longestValue = "";
		text += " ";
		for (int i = 1; i < text.length(); i++) {

			if (text.charAt(i) == text.charAt(i - 1)) {
				tmp += text.charAt(i - 1);
				count++;
				dem++;
			} else {
				// System.out.println(count);
				if (count > longestString) {
					longestString = count;
					longestValue = i + "";
				//	System.out.println(longestValue);
				}
				if (dem < shortestString) {
					shortestString = dem;
					shortestValue = i + "";
               //     System.out.println(text.charAt(Integer.parseInt(shortestValue)));
			   //	System.out.println(shortestValue);
				}
				dem = 1;
				tmp = "";
				count = 1;

			}

		}
		System.out.println(longestString + " "
				+ text.substring((Integer.parseInt(longestValue) - longestString), Integer.parseInt(longestValue)));
		System.out.println(shortestString + " "
				+ text.substring((Integer.parseInt(shortestValue)) - shortestString, Integer.parseInt(shortestValue)));
	}
}
