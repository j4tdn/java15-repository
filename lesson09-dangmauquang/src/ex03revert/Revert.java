package ex03revert;
/**
 	Cho dãy kí tự chứa các kí tự thường và khoảng trắng.
	Viết chương trình loại bỏ khoảng trắng thừa và đảo chuỗi như sau:
	Example: input: Welcome to JAVA10 class
	output: emocleW ot 01AVAJ ssalc
 */
public class Revert {
	public static void main(String[] args) {
		String text = "Welcome  to JAVA10  class";
		System.out.println(revert(text));
	}

	private static String revert(String text) {
		String formattedSentence = "";
		String[] words =  text.split("[\\s]{1,}");
		

		for(String word: words) {
			StringBuilder str = new StringBuilder(word);
		    String newWord = str.reverse().toString();
		    formattedSentence += newWord += " ";
		}
		
		return formattedSentence;
	}
}
