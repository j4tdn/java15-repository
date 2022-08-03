package view;

public class Ex02 {
	public static void main(String[] args) {
		String text = "Tran    thi HOA Vien";

		String formated = text.replaceAll("\\s+", " ");
		
		String[] words = formated.split("\\s+");
		StringBuilder builder = new StringBuilder();
		for (String word : words) {
			String formatted = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
			builder.append(formatted+ " ");
		}
		System.out.println(builder);
		
	}
}
