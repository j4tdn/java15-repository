package view;

import java.util.Arrays;

/*
 * Cho n xâu chuỗi, mỗi chuỗi bao gồm các ký tự la tinh thường và chữ số. Đoạn các
ký tự số liên tục tạo thành một số nguyên. Ở mỗi xâu chuỗi trích ra các số nguyên và tìm số lớn
nhất, sắp xếp các số lớn nhất nhận được từ các xâu đã cho và in ra theo thứ tự không giảm, mỗi số
được đưa ra dưới dạng không có các số 0 không có nghĩa (024)
Nếu chuỗi rỗng hoặc chuỗi chỉ chứa các ký tự latinh thì số lớn nhất của chuỗi đó là 0
Ví dụ: với n = 1 : xâu 01a2b3456cde478 : Kết quả: 3456
với n = 2 : xâu aa6b546c6e22h, aa6b326c6e22h: Kết quả: 326, 546
 * */
public class Ex02LargestNumber {
	public static void main(String[] args) {
		String s1 = "01a2b3456cde478";
		String s2 = "aa6b546c6e22h, aa6b326c6 e22h";

//		String[] numberAsString = s1.split("[a-z]+");
//		System.out.println("===================");
		String[] numberAsString = new String[s1.length() / 2];
		int running = 0 ;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s1.length(); i++) {
			char letter = s1.charAt(i);
			if (Character.isDigit(letter)) {
				sb.append(letter);
			} else {
				numberAsString[running++] = sb.toString();
				sb.delete(0, sb.length());
			}
		}

	}

//	private static int[] getLargestNumber(String s, int extension) {
//		String numberOnly = s.replaceAll("[^0-9]", " ");
//		String[] numberString = numberOnly.split("\\s+");
//		int[] numbers = new int[numberString.length];
//		for (int i = 0; i < numbers.length; i++) {
//			if (numberString[i].charAt(0) == 0) {
//				numberString[i].substring(1);
//			}
//			numbers[i] = Integer.parseInt(numberString[i]);
//		}
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 1; j < numbers.length; i++) {
//				if (numbers[i] < numbers[j]) {
//					int tmp = numbers[j];
//					numbers[i] = numbers[j];
//					numbers[j] = tmp;
//				}
//			}
//		}
//		return Arrays.copyOfRange(numbers, 0, extension);
//	}
}
