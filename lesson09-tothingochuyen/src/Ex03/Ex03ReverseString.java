package Ex03;

public class Ex03ReverseString {
	public static void main(String[] args) {
		String input = "Welcome to JAVA10 class";
		revertString(input);
		
	}
	
	private static String revertString(String input) {
		String output = input.replaceAll("\\s+", " ");
		System.out.println(output);
		
		String[] words = output.split(" ");
		output = "";
		for(int i = 0; i < words.length; i++) {
			String word = words[i];
			//System.out.println(word);
			String revertWord = "";
			for(int j = word.length() - 1; j >= 0; j--) {
				revertWord += word.charAt(j);
			}
			output = output + revertWord + " ";
		}
		System.out.println("================================");
		System.out.println("After removing extra spaces and reversing the string:");
		System.out.println(output);
		return output;
	}
}
