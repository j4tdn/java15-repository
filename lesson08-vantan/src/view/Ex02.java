package view;

public class Ex02 {
	public static void main(String[] args) {
		String name = "tran van tan979";
		try {
			System.out.println(getName(name));
		} catch (Exception e) {
			e.getMessage();
		}
	}
	private static String getName(String name) throws Exception {
		if(name.matches(".*[a-zA-Z].*")) {
			throw new Exception("Names can only be written in lowercase and uppercase letters");			
		}
		String[] words = name.split("\\s+");
		StringBuilder builder = new StringBuilder();
		for (String word : words) {
			String formatted = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
			builder.append(formatted+ " ");
		}
		return builder.toString();
	}
}
