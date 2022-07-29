package immutable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Ex08FormatString {
	public static void main(String[] args) {
		// String --> lower , upper letters and number and spaces;
		String text = "wElcome To jaVA15 Class";
		// requirement --> first word's letter have to be uppercase , others will be
		// lower case;
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			// System.out.println(ch);
			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9' || ch == ' ') {
				ch = Character.toLowerCase(ch);

				String tmp = Character.toString(ch);
				// tmp = tmp.trim();
				// tmp = tmp.replace("\\s+", " ");
				// tmp = tmp.replace(" " + 1, tmp.toUpperCase());
				// System.out.print(ch);
				// System.out.println();
				System.out.print(tmp);
				//if (tmp.charAt(i) == ' ' ) {
				//	char next = tmp.charAt(i+1);
				//	Character.toUpperCase(next);
				//	System.out.print(tmp);
				//}

			}
		}
	}
}
