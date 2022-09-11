package view;

public class Ex02DivisiomAsThrows {
	
	
	public static void main(String[] args) {
		//hậu xử lý--> xử lý khi xảy ra lỗi, đam bảo đoạn mã 
		//throw/ throws
		System.out.println("D1: " + divide(5, 5));
		System.out.println("D1: " + divide(5, 0));
		System.out.println("D1: " + divide(20, 5));
		
	}
	//no need to throws runtime exception --> unnecessary
	//ko cần thiết ném lỗi ngoại lệ runtime
	//not require no process(try/catch/throw/throws) at calling place
	private static int divide(int a, int b) {
		return a / b;
	}
}
