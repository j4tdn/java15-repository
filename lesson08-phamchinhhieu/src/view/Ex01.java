package view;

/**
 * 
 * Viết chương trình nhập vào một chuỗi kí tự bất kì sau đó thực hiện các công
 * việc sau : Yêu cầu: Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím space.
 * In ra mỗi kí tự trên một dòng In ra mỗi từ trên mỗi dòng In ra chuỗi đảo
 * ngược theo kí tự In ra chuỗi đảo ngược theo từ
 *
 */
public class Ex01 {
	public static void main(String[] args) {
		String s = "Tôi là Phạm Chính Hiệu";
		PrintfString(s);
	}

	private static void PrintfString(String s) {
		String names[] = s.split("\\s+");
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length(); j++) {
				System.out.println(names[i].charAt(j));
			}
		}
		System.out.println("=====================");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);

		}
		System.out.println("=====================");
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("=====================");
		for (int i = 0; i < names.length; i++) {
			for (int j = names[i].length() - 1; j >= 0; j--) {
				System.out.print(names[i].charAt(j));
			}
			System.out.print(" ");
		}
	}
}

