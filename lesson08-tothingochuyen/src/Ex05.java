import java.util.Scanner;

/**
 * Xâu s1 có dộ dài m và s2 có độ dài n ( m,n là hai số tự nhiên; n,m<250)
Biết rằng s1,s2 chỉ chứa các kí tự ‘A’...’Z’.
Yêu cầu: Hãy viết phương trình tìm xâu con chung dài nhất của xâu s1 và s2.
Dữ liệu vào: Nhập từ bàn phím 2 xâu s1 và s2.
Kết quả: Xuất ra màn hình xâu con chung của 2 xâ s1 và s2.
Example:
Input: S1:ABCEDEABC
S2:ABCEDCBBCK
Output: ABCED
 * */
public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1,s2;
		System.out.print("Enter string 1: ");
		s1 = input.nextLine();
		System.out.print("Enter string 2: ");
		s2 = input.nextLine();
		System.out.println("Longest common substring: " + getLongestCommonSubstring(s1, s2));
		
	}
	
	private static String getLongestCommonSubstring(String s1, String s2) {
		String result = "";
		for(int i = 0; i < s1.length(); i++) {
			for(int j = i + 1; j < s1.length(); j++) {
				if(s2.contains(s1.substring(i, j))) {
					if(result.length() < s1.substring(i, j).length()) {
						result = s1.substring(i, j);
					}
				}
			}
		}
		return result;
	}
}
