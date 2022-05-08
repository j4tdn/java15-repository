package structure;

public class Ex02 {
	public static int year = 2001;

	public static void main(String[] args) {

		// Biến
		// Kiểu dữ liệu nguyên thủy ==> gtri đc lưu trữ ở stack
		int year = 1998;
		System.out.println("year: " + year);
		// KDL đối tượng

		demo();
		int age = 24;
		int salary = 24;
		
		age = 28;
		salary = age;
		salary = 32;
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
	}
	//fomat code -> ctrl shift f
	public static void demo() {
		System.out.println("age: " +Ex02.year);
	}
}
