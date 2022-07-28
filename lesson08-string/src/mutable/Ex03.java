package mutable;

public class Ex03 {
	public static void main(String[] args) {
		String s = "aaabaaabbaaaaa";
		int count = 0;
		
		// longest, shortest
		// startIndex, index
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(0) == s.charAt(1)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
