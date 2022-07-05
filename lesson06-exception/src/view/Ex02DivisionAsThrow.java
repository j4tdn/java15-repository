package view;

public class Ex02DivisionAsThrow {
	// Cách 2: Hậu xử lí --> xử lí khi xảy ra lỗi, đảm bảo đoạn mã phía sau
	// 2.2: Throw/Throws
	public static void main(String[] args) {
		System.out.println("D1:"+ devide(5, 5));
		System.out.println("D2:"+ devide(5, 0));
		System.out.println("D3:"+ devide(4, 2));
	}
	// No need to throws runtime exception --> unnecessary
	// not require to process(try/catch/throw/throws) at calling place
	private static int devide(int a,int b) /*throws ArithmeticException*/{
		return a/b;
	}
	
}
