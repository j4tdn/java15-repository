package view;

public class Ex02DivisionAsThrows {

	public static void main(String[] args) {
		// Cách 2: Hậu xử lí--> khi mà xảy ra lỗi, đảm bảo đoạn mã phía sau vẫn được
				// thực thi
				// 2.2 Throw/Throws
				//Không cần throws các runtime exception
		System.out.println("D1: " + divide(8, 2));
		System.out.println("D2: " + divide(2, 0));
		System.out.println("D3 " + divide(4, 2));

	}
	public static int divide(int a, int b) throws ArithmeticException{
		return a/b;

		
	}
}
	
	
//	public static int divide(int a, int b) {
//		try {
//			return a/b;
//		} catch (ArithmeticException e) {
//			System.out.println("Mau so khong the la so 0 ");
//			
//		}
//		return Integer.MAX_VALUE;
		
	


/*D1: 4
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at view.Ex02DivisionAsThrow.divide(Ex02DivisionAsThrow.java:17)
	at view.Ex02DivisionAsThrow.main(Ex02DivisionAsThrow.java:11)
*/
