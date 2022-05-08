package structure;

//Kí tự //: chú thích 1 dòng
//Kí tự /**/: chú thích nhiều dòng
//Xóa 1 dòng: ctrl d
//Chạy chương trình: javac Ex01TestMainMethod.java, java Ex01TestMainMethod
//Eclipse Run -> Run || [Fn] Ctril F11
//				 Chạy hết chương trình 1 lần

//Eclipse Run -> Debug
//	==> breakpoint
// Toggle: YES -> <-NO

/**
 * Java executable class
 * 	+ methods
 */
public class Ex01TestMainMethod {
	//ctrl space
	public static void main(String[] args) {
		//start
		System.out.println("Welcome to JAVA15 class");
		System.out.println("Today: lesson 02-data-structure");
		
		anotherMain();
		//end
	}
 
	// method structure
	// --> void: kiểu dữ liệu trả về
	// --> anotherMain tên phương thức
	public static void anotherMain() {
		System.out.println("Another main method");
		
    