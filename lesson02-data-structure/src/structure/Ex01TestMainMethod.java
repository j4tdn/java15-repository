package structure;

// Kí tự //: chú thích 1 dòng
// Kí tự /**/: chú thích nhiều dòng
// Xóa 1 dòng: ctrl d
// Chạy chương trình: javac Ex01TestMainMethod.java(compiler), java Ex01TestMainMethod(interpreter)
// Eclipse Run -> Run || [Fn] Ctrl F11
//                Chạy hết chương trình 1 lần

// Eclipse Run -> Debug
//    ==> breakpoint
// Toggle: YES -> <- NO

/**
 * Java executable class
 *   + methods
 */
public class Ex01TestMainMethod {
	// ctrl space
	// main method
	public static void main(String[] args) {
		// start
		System.out.println("Welcome to JAVA15 class");
		System.out.println("Today: lesson02-data-structure");
		
		// calling
		anotherMain();
		// end
		
		System.out.println("Year --> " + Ex02.year);
	}
	
	// method structure 
	// --> void: kiểu dữ liệu trả về
	//         : không trả về gì cả
	// --> anotherMain tên phương thức
	public static void anotherMain() {
		System.out.println("Another main method");
	}
}
