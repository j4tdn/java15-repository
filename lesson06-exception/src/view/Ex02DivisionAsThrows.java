package view;

public class Ex02DivisionAsThrows {
	public static void main(String[] args) {
		//Cách 2: Hậu xử lý --> Xử lý khi xảy ra lỗi, đảm bảo đoạn mã phía sau vẫn được thực thi 
		//throw/throws
		
		System.out.println("D1: " + divide(5, 5));
		System.out.println("D2: " + divide(5, 0));
		
	}
	
	private static int divide(int a, int b) throws ArithmeticException{
		return a/b;
	}
}
