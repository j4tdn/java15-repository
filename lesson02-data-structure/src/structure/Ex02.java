package structure;

public class Ex02 {
	// global variable
	public static int age = 25;
	public static void main(String[] args) {
		// Biến
		// KDL nguyên thủy ==> giá trị được lưu trữ ở stack
		// local variable
		int year = 1998;
		
		System.out.println("year: " + year);
		
		demo();
		
		int age = 24;
		int salary = 24;
		
		age = 28;
		salary = age;
		salary = 32;
		
		System.out.println("Age: " + age);
		System.out.println("Salary " + salary);

		// KDL đối tượng
	}
	public static void demo() {
		System.out.println("age: " + age);
	}
}
