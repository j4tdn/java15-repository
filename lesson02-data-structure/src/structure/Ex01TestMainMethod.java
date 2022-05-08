package structure;

//Kí tự //: chú thích 1 dòng
//Kí tự/**/: chú thích nhiều dòng
//Xóa 1 dòng: ctrl d
//Chạy chương trình:javac Ex01TestMainMethod.java(compiler), java Ex01TestMainMethod(interpreter)
//Eclipse Run -> Run || [Fn] Ctrl F11
//				Chạy hết chương trình 1 lần
//Eclipse Run -> Debug
//		==> breakpoint
// Toggle: YES-> <-No

/**
 * 
 * @author Java executable class
 *
 */
public class Ex01TestMainMethod {
	//ctrl space
	public static void main(String[] args) {
		//start
		System.out.println("Welcome to JAVA15 class");
		System.out.println("Today: lesson02-data-structure");
	
		anotherMain();
		//end
	}
	//method structure --> anotherMain
	// -->void: kiểu dữ liệu trả về
	// -->anotherMain tên phương thức
	
	public static void anotherMain() {
		System.out.println("Another main method");
	}
}
