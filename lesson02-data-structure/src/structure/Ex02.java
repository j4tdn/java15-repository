package structure;

/*
 * class
 * +methodA --> {}
 * +methodB --> {}
 */

public class Ex02 {

	// global variable --> attribute
	// use of any function in class Ex02 and also Ex02's external
	public static int year = 2003;

	public static void main(String[] args) {
		// local variable -->block scope
		// Biến
		// KDL nguyên thủy ==> giá trị được lưu trữ
		int year = 1998;

		System.out.println("year: " + year); // 1998
		demo();
		int age = 24;
		int salary = 24;
		
		age = 28;
		salary = age;
		salary = 32;
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);

		// KDL đối tượng

	}

	public static void demo() {
		System.out.println("age: " + Ex02.year); //2003
	}

}
