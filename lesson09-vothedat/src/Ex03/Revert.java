package Ex03;

public class Revert {
	public static void main(String[] args) {
		String s = "welcome     to java15       class";
		reverve(s);
	}
        private static void reverve(String s) {  	
        	String formattedText = "";
        	String k = s.replaceAll("\\s+", " ");
        	String[] words = k.split("\\s");
        	for(int i = 0; i < words.length; i++) {
        		String word = words[i];
        		String Text = "";
        		for (int j = word.length()-1; j >= 0; j--)
                {
                    Text = Text + word.charAt(j);
                }
                formattedText = formattedText + Text + " ";
        	}
    		System.out.println(formattedText);
	}
}
