package ex;

public class Ex01_LetterCount {
	public static void main(String[] args) {
		String s = "we are leaning the  bad   pro   language";
		//s = s.replaceAll("\\s+", " ");
		//System.out.println(s);
		String[] words = s.split("a");
		System.out.println(words.length);
		for(String s1:words)
		{
			System.out.println(s1);
		}
	}
}
