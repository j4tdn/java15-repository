package immutable;

public class Ex08FormatString {

	public static void main(String[] args) {
		// Chuỗi bao gồm
		// In ra chữ cái đầu tiên viết hoa
		String text = "wELcome To jaVA15 Class";
		System.out.println(format(text));
	}

	private  static String format (String text) {
		String[] words = text.split("\\s,-]+");
		String formattedText ="";
		for (String word: words) {
			String formattedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
			formattedText += formattedWord + " ";
		}
		return formattedText;
	}

//		char[] charArray = text.toCharArray();
//		boolean foundSpace = true;
//		for(int i = 0; i<charArray.length; i++) {
//			
//		}
//		for(int i = 0; i<charArray.length; i++) {
//			if(Character.isLetter(charArray[i])) {
//				if(foundSpace) {
//					charArray[i] = Character.toUpperCase(charArray[i]);
//					foundSpace = false;
//				}
//			}
//			else {
//				foundSpace = true;
//			}
//				
//		}
//		text = String.valueOf(charArray);
//		System.out.println("Chuỗi sau khi đổi: \n" + text);

}
