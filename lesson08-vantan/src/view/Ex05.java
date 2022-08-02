package view;

public class Ex05 {
	/*
	 * IDEA : cho vòng lặp for chạy từ 0 đến chuỗi hết chuỗi ngắn hơn giữa 2 chuỗi.
	 *- so sánh giá trị của 2 chuỗi tại từng vị trí i
	 * nếu giống thì tăng đếm lên, cộng vào chuỗi trung gian kí tự đó. nếu khác thì reset lại 
	 * count và chuỗi trung gian.
	 * -so sánh biến đếm với biến độ dài nhất chuỗi có thể giống nhau, nếu count lớn hơn 
	 * thì gán count cho max và gán chuỗi trung gian cho chuỗi kết quả
	 * 
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		String s1 = "AASDGJSHASHAJSHASH";
		String s2 = "AASDGKSHUGDGJSHASH";
		System.out.println(getStringSame(s1, s2));
		
	}
	private static String getStringSame(String s1, String s2) {
		StringBuilder builder = new StringBuilder();
		StringBuilder result= new StringBuilder();
		int count = 0;
		int max= Integer.MIN_VALUE;
		int leng = s1.length() < s2.length() ? s1.length() : s2.length();
		for (int i = 0; i < leng; i++) {
			if(s1.charAt(i) == s2.charAt(i)) {
				count++;
				builder.append(s1.charAt(i));
				if(count > max) {
					max = count;
					result = builder;
				}
			}else {
				count = 0;
				builder = new StringBuilder("");
			}
		}
		return result.toString();
	}
}
