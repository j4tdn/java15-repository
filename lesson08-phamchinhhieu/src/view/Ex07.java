package view;

public class Ex07 {
	public static void main(String[] args) {
		String s = "aaabaaabbaaaaa";
		CorrectSubsequence(s);
	}
	private static void CorrectSubsequence(String s) {
		int count = 0;
		int max = 0;
		int min = s.length();
		int startmax = 0, endmax = 0, startmin = 0, endmin = 0;
		int index = 0;
		for(int i = 0 ; i < s.length() - 1;i++) {
			if(s.charAt(i + 1) == s.charAt(i)) {
				count++;
			}
			else {
				if(count < min) {
					min = count;
					startmin = index;
					endmin = i + 1;
				}
				count = 0;
				index = i + 1;
			}
			if(count > max) {
				max = count;
				endmax  = i + 2;
				startmax = index;
			}
			
		}
		System.out.println((max + 1) + " " + s.substring(startmax, endmax) + "[" + (startmax + "]"));
		System.out.println((min + 1) + " " + s.substring(startmin, endmin) + "[" + (startmin + "]"));
	}
}
