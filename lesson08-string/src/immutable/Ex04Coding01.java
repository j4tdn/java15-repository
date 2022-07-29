package immutable;

public class Ex04Coding01 {
	public static void main(String[] args) {
		String s = "JAVA15";
		String s1 = "COURSE";

		// 1. Tính chiều dài của chuỗi
		System.out.println("do dai: " + s.length());
		System.out.println("===========================");

		// 2.
		String s3 = s + s1;
		// System.out.println("do dai: " + s3.length());
		System.out.println("===========================");

		// 3.
		System.out.println("index3: " + s.charAt(2));
		System.out.println("===========================");

		// 4.
		for (int i = 0; i < s.length(); i++) {
			System.out.println("index " + i + " : " + s.charAt(i));
		}
		System.out.println("===========================");
		// 5. Dùng indexof và lastIndexOf
		int min = 1;
		int max = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'A') {
				if(i<=min) {
					min = i;
				}
				if(i>max) {
					max = i;
				}
				System.out.println("index " + min + " : " + s.charAt(min));
				System.out.println("index " + max + " : " + s.charAt(max));
			}
		}
	}
}
