package ex;

public class Ex01_LetterCount {
	public static void main(String[] args) {
		String s = "we are leaning the  bad   pro   language";
		//s = s.replaceAll("\\s+", " ");
		//System.out.println(s);
		String[] words = s.split("\\s+");
		System.out.println(words.length);
	}
}
