package immutable;

public class Ex08FormatString {
	public static void main(String[] args) {
		// string --> lower, upper letters, numbers and spaces
		// separator --> split
		String text = "wElcome   ,,- To  --  jaVA15  Class";
		System.out.println(format(text));
		
		// require --> format: first word's letter have to be upper case, others will be
		// lower case;
	}

	private static String format(String text) {
		String formattedWord = "";
		String[] words =  text.split("[\\s,-]{1,}");
		for(String word: words) {
			char firstLetter = word.charAt(0);
			formattedWord += Character.toUpperCase(firstLetter) + 
					word.substring(1).toLowerCase() + " ";
		}
		return formattedWord;
	}
}