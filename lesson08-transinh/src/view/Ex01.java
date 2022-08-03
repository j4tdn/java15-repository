package view;

public class Ex01 {
	public static void main(String[] args) {
		String text = "Tran Thi Hoa Vien";
		System.out.println(text);

		System.out.println("=============");

		// in ra mỗi kí tự trên mỗi dòng
		String oneword = text.replaceAll("\\s+", "");
		for (int i = 0; i < oneword.length(); i++) {
			System.out.println(oneword.charAt(i));
		}
		
		System.out.println("=============");

		// in mỗi từ trên mỗi dòng
		String[] words = text.split("\\s+");
		for (String word : words) {
			System.out.println(word);
		}
		
		System.out.println("=============");
		
		// in ra chuỗi đảo ngược theo từ
		for (int i = text.length() - 1; i >= 0; i--) {
			System.out.print(text.charAt(i));
		}
		System.out.println();
		
	}
}