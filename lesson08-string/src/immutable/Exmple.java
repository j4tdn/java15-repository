package immutable;

public class Exmple {
	public static void main(String[] args) {
		String text = "aaaaaabbbcdddd";
		int count = 1;
		int longest = Integer.MIN_VALUE;
		int shortest  = Integer.MAX_VALUE;
		int longestInd = 0;
		int shortestInd = 0;
		
		// int countMIn = 0;
		for (int i = 1; i < text.length(); i++) {
			
			if (text.charAt(i) == text.charAt(i - 1)) {
				count++;
							
				
			}else {
				if(count > longest) {
					longest = count;
					longestInd = i - count;
				}	
				if(count < shortest) {
					shortest = count;
					shortestInd = i - count;
				}
				count = 1;
			}			

		}
		System.out.println(longest);
		System.out.println(shortest);
		System.out.println(longestInd);
		System.out.println(shortestInd);
		
	}

}
