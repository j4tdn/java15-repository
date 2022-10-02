package ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * Bài 2(15đ). Viết chương trình tìm kiếm kí tự có số lần xuất hiện nhiều nhất trong chuỗi.
Nếu tồn tại các ký tự có số lần xuất hiện bằng nhau. In ra các ký tự đó cách nhau bởi dấu
phẩy. Yêu cầu chuỗi chỉ gồm các ký tự trong phạm vi [a-zA-Z]
Ví dụ: input: aaaababbbddc  output: a
input: aaaaccdcec  output: a, c
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		String s = "aaaababbbddc";
		List<String> myList = new ArrayList<String>(Arrays.asList(s.split("")));
		List<String> maxLetter = myList.stream()
				.distinct()
				.collect(Collectors.toList());
		maxLetter.forEach(System.out::printf);
		int[] count = new int[maxLetter.size()];
		for(int i = 0; i < maxLetter.size(); i++) {
			for(int j = 0; j < myList.size(); j++) {
				if(myList.get(j).equals(maxLetter.get(i))) {
					count[i] += 1;
				}
			}
		}
		int max = 0;	
		for(int i = 0; i< count.length; i++) {
			if(count[i] >= max) {
				max = count[i];
			}
		}
		int[] letter = findletter(count, max);
		System.out.println();
		for(int i = 0; i < letter.length;i++) {
			System.out.print(maxLetter.get(letter[i]) + " ");
		}
		
		
	}
	private static int[] findletter(int[] count, int max) {
		int index = 0;

		int[] letter = new int[count.length];

		for(int i = 0; i < count.length; i++) {
			if(count[i] == max) {
				letter[index++] = i;
			}
		}
		return Arrays.copyOfRange(letter, 0,index);
	}
}
