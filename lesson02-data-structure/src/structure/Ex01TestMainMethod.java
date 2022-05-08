package structure;

//kí tự // : chú thích 1 dòng

//kí tự /*...*/: chú thích nhiều dòng
//Xóa 1 dòng: Ctrl D
//Chạy chương trình: javax ....java ; java ...
//Eclipse Run -> || Ctrl + F11

public class Ex01TestMainMethod {
	// ctrl space
	public static void main(String[] args) {
		// start
		System.out.println("Hello World");
		System.out.println("Today: lesson02-date-structure");

		anotherMain();

		System.out.println("Age --->" + Ex02.year);
		// end
	}

	// method structure
	// --> void: kiểu dữ liệu trả về (không trả về gì cả)
	// --> anotherMain tên phương thức
	public static void anotherMain() {
		System.out.println("Another main method");

	}
}
