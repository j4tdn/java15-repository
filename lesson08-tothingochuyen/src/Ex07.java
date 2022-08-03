
/**
 * Cho xâu kí tự S bao gồm toàn các ký tự ‘a’ đến ‘z’, không quá 255 ký tự. “Dãy
con đúng” trong xâu S là dãy có các kí tự liền kề giống nhau
Yêu cầu:

Hãy tính độ dài lớn nhất của dãy con đúng của dãy S.
Hãy tính độ dài nhỏ nhất của dãy con đúng của dãy S.

Example: ‘aaabaaabbaaaaa’
Độ dài lớn nhất của dãy con đúng : 5 “aaaaa” [9]
Độ dài nhỏ nhất của dãy con đúng: 1 “b” [3]
Với [x] => bắt đầu từ vị trí x trong xâu S
 * */
public class Ex07 {
	public static void main(String[] args) {
		String s = "aaabaaabbaaaaa";
		int max = 0;
		int min = Integer.MAX_VALUE;
		int posMax = -1, posMin = -1;
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
	    	if(count < min) {
	    		min = count;
	    		posMin = i;
	    	}
	    	 i = i+ count;
	    }
		System.out.println(max +" \"" +s.substring(posMax, posMax + max) +"\" " + "["+posMax+"]");
		System.out.println(min +" \"" +s.substring(posMin, posMin + min) +"\" " + "["+posMin+"]");
	}
}
