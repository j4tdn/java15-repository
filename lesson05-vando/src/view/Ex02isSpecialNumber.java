package view;

public class Ex02isSpecialNumber {
	public static boolean isSpecialNumber(int number) {
	int a = 0;
		for(int i = 1; i <= number; i++) {
			a = a + i;
			if(a >= number) {
				break;
		}
	}
	return (a == number);
	}
	public static void main(String[] args) {
		System.out.println(isSpecialNumber(15));
	}
}
