package view;

/**
 * 
 * Xâu s1 có dộ dài m và s2 có độ dài n ( m,n là hai số tự nhiên; n,m<250) Biết
 * rằng s1,s2 chỉ chứa các kí tự ‘A’...’Z’.
 * 
 * Yêu cầu: Hãy viết phương trình tìm xâu con chung dài nhất của xâu s1 và s2.
 * 
 * Dữ liệu vào: Nhập từ bàn phím 2 xâu s1 và s2. Kết quả: Xuất ra màn hình xâu
 * con chung của 2 xâ s1 và s2. Example: Input: S1:ABCEDEABC S2:ABCEDCBBCK
 * Output: ABCED
 *
 */
public class Ex05 {
	public static void main(String[] args) {
		String s1 = "DAGBCEDCABCGHJ";
		String s2 = "DABCEDCBBCK";	
		System.out.println("Chuoi lon nhat la: " + findLargerString(s1, s2));
	}
	private static String findLargerString(String s1, String s2) {
		String s3 = null;
		String s4 = null;
		String names = "";
		String ss = "";
		int max = 0;
		int count = 0;
		int count1 = 0;
		if(s1.length() < s2.length()) {
			s3 = s1;
			s4 = s2;
		}
		else {
			s3 = s2;
			s4 = s1;
		}
		System.out.println(s3);
		System.out.println(s4);
		for (int i = 0; i < s3.length(); i++) {
		//	System.out.print("i = " + i + ", ");
			names += s3.charAt(i);
		//	System.out.print("names = " + names +", ");
			if (s4.contains(names)) {
				++count;
				if (count >= max) {
					max = count;
					ss = names;
				//	System.out.println("ss = " +ss );
				}
			} else {
				if(names.length() > 1) {
					i = count1;
					count1++;
				}
				names = "";
				count = 0;
			}
		}
		return ss;
		
	}
}
