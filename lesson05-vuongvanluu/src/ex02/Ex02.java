package ex02;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(isSpecialNumber(15));
	}
	
	public static boolean isSpecialNumber(int a) {
		int b=0;
		for(int i = 0; i < a; i++) {
			b += i;
			if(a == b) {
				return true;
			}
		}
		
		return false;
	}
}
