package Ex02;

import java.util.Scanner;

/**
 * Viết chương trình tìm kiếm kí tự có số lần xuất hiện nhiều nhất trong chuỗi.
Nếu tồn tại các ký tự có số lần xuất hiện bằng nhau. In ra các ký tự đó cách nhau bởi dấu
phẩy. Yêu cầu chuỗi chỉ gồm các ký tự trong phạm vi [a-zA-Z]
Ví dụ: input: aaaababbbddc  output: a
input: aaaaccdcec  output: a, c
 * */
public class Ex02 {
	public static void main(String[] args) {
		String s = "aaaababbbddc";
		int max = 0;
		int min = Integer.MAX_VALUE;
		int posMax = -1;
		int i = 0;
		while(i < s.length()) {
	    	int count = 0;
	    	for(int j = i; j< s.length(); j++) {
	    		if(s.charAt(i) == s.charAt(j)) {
	    			count++;
	    		} else {
	    			break;
	    		}
	    	}
	    	if(count > max) {
	    		max = count;
	    		posMax = i;
	    	}
	    	 i = i+ count;
	    }
		System.out.println(max +" \"" +s.substring(posMax, posMax + max) +"\" ");
	}
}
