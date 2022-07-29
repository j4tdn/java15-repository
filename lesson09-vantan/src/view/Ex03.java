package view;

public class Ex03 {
	public static void main(String[] args) {
		String s =" Welcome to JAVA10 class";
		System.out.println(revert(s));
		
	}
	private static String revert(String s) {
		String[] words = s.split("\\s+");
		StringBuilder builder = new StringBuilder();
		for (String word : words) {
			builder.append(reverse(word) + " ");
		}
		return builder.toString();
		
	}
	private static String reverse(String s) {
		StringBuilder builder = new StringBuilder();
		for (int i = s.length()-1; i >= 0; i--) {
			builder.append(s.charAt(i));
		}
		return builder.toString();
	}
	
}
