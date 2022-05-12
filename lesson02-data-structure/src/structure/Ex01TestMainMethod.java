package structure;

// Ký tự //: chú thích 1 dòng
// Ký tự /**/: chú thích nhiều dòng
// Xóa 1 dòng; ctrl d
// Eclipse run -> Run || [Fn] Ctrl F11
// 			   -> Debug ==> breakpoint
/**
 * 
 * @author MSI_
 *
 */
public class Ex01TestMainMethod {
	//ctrl space
	//main method
	public static void main(String[] args) {
		//start
		System.out.println("welcom to JAVA15 class");
		System.out.println("Today: lesson02-data-structure");
		
		anotherMain();
		System.out.println("age: "+ Ex02.age );
		
		//end
	}
	//method structure 
	//--> void : kiểu dữ liệu trả về
	//			: k trả về gì cả
	// --> anotherMain tên phương thức
	public static void anotherMain() {
		System.out.println("Another main method");
	}
	
}
