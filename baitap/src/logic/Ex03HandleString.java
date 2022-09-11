package logic;

public class Ex03HandleString {
	public static void main(String[] args) {
		String s = "    I        am     developer   ";
		s = s.trim();
		System.out.println(s);
		s = s.replaceAll("\\s+", " ");
		System.out.println(s);
		String[] words = s.split("\\s");
		String result = "";
		StringBuilder sb = new StringBuilder();
		for (int i = words.length -1; i >= 0; i--) {
			
			sb.append(words[i] + " ");
		}
		System.out.println(sb);
	}
}
