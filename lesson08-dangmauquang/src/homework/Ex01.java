package homework;
/**
	Bài 1: Viết chương trình nhập vào một chuỗi kí tự bất kì sau đó thực hiện các công việc sau :
	Yêu cầu: Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím space.
	In ra mỗi kí tự trên một dòng
	In ra mỗi từ trên mỗi dòng
	In ra chuỗi đảo ngược theo kí tự
	In ra chuỗi đảo ngược theo từ
 */
public class Ex01 {
	public static void main(String[] args) {
		String str = "xin chào";
		
		// In ra mỗi kí tự trên một dòng
		System.out.println("In ra mỗi kí tự trên một dòng");
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println("=============================");
		
		System.out.println("In ra mỗi từ trên mỗi dòng");
		String[] formattedWord = str.split("\s+");
		for (int i = 0; i < formattedWord.length; i++) {
			System.out.println(formattedWord[i]);
		}
		System.out.println("=============================");

		System.out.println("In ra chuỗi đảo ngược theo kí tự");
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
		System.out.println("=============================");


		System.out.println("In ra chuỗi đảo ngược theo từ");
		String[] revertWord = str.split("\s+");
		for (int i = revertWord.length - 1; i >= 0 ; i--) {
			System.out.println(revertWord[i]);
		}

	}
	
	
	
}
