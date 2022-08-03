package homework;
/**
	Bài 7: Cho xâu kí tự S bao gồm toàn các ký tự ‘a’ đến ‘z’, không quá 255 ký tự. “Dãy
	con đúng” trong xâu S là dãy có các kí tự liền kề giống nhau
	Yêu cầu:
	
	Hãy tính độ dài lớn nhất của dãy con đúng của dãy S.
	Hãy tính độ dài nhỏ nhất của dãy con đúng của dãy S.
	
	Example: ‘aaabaaabbaaaaa’
	Độ dài lớn nhất của dãy con đúng : 5 “aaaaa” [9]
	Độ dài nhỏ nhất của dãy con đúng: 1 “b” [3]
	Với [x] => bắt đầu từ vị trí x trong xâu S
 */
public class Ex07 {
	public static void main(String[] args) {
		String str = "aaabbbddddcaab";
		int count = 1;
		int longest = 1;
		int shortest = 1;

		
		
		for (int i = 1; i < str.length(); i++) {
			
			if (str.charAt(i) == str.charAt(i - 1)) {
				count++;		
			}else {
				if(count > longest) {
					longest = count;
				}	
				if(count < shortest) {
					shortest = count;
				}
				count = 1;
			}			

		}
		System.out.println("Độ dài lớn nhất của dãy con đúng: " + longest);
		System.out.println("Độ dài nhỏ nhất của dãy con đúng: " + shortest);
		
	}

}