package ex03;

public class ex03 {
		public static void main(String[] args) {
			String text = "Welcome     to JAVA10    class";
			
			revert(text);
		}
		
		private static void revert(String text) {
			String [] words = text.split("\\s+");
			String reversedString = "";
	        for (int i = 0; i < words.length; i++)
	        {
	            String word = words[i];
	            String reverseWord = "";
	            for (int j = word.length()-1; j >= 0; j--)
	            {
	                reverseWord = reverseWord + word.charAt(j);
	            }
	            reversedString = reversedString + reverseWord + " ";
	        }
	        System.out.println(reversedString);
		}
	
}
