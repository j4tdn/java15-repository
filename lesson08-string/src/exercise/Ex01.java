package exercise;

public class Ex01 {
	public static void main(String[] args) {
		String str = "aBcD172#@!";
		int[] arr = { 0, 0, 0 };
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				arr[0]++;
			}
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				arr[1]++;
			}
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				arr[2]++;
			}
		}
		System.out.println("Num of UpperCase: " + arr[0]);
		System.out.println("Num of LowerCase: " + arr[1]);
		System.out.println("Num of Number: " + arr[2]);
	}
}
