package view;

public class Ex02 {
	private static String capitalizeWord(String str) {
		String words[] = str.split("\\s+");
		String capitalizeWord = "";
		for (String w : words) {
			
			String first = w.substring(0, 1);
			String afterfirst = w.substring(1);
			capitalizeWord += first.toUpperCase() + afterfirst + " ";
		}
		return capitalizeWord.trim();
	}

	public static void main(String[] args) {
		String s1 = "aDam Le     vAN john Son";
		
		System.out.println(capitalizeWord(s1.toLowerCase()));
	}

}