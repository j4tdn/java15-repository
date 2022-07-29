package view;

public class Ex03_Reverse {
	public static void main(String[] args) {
		String s = "Welcome to JAVA10 class";
		String[] words = s.split("\\s+");
		for (int i = 0; i < words.length; i++) {
			StringBuilder name = new StringBuilder(words[i]);
			words[i] = name.reverse().toString();			
		}
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
		
	}
}
