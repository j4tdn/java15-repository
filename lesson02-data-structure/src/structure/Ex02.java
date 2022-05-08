package structure;

public class Ex02 {
	public static int year = 2000;

	// local varibale ---> block scope
	// Biến
	// KDL nguyên thủy -> dữ liệu được lưu trữ ở stack
	// access modifier: phạm vi truy cập
	public static void main(String[] args) {

		int year = 2002;
		System.out.println("year: " + year);
		// KDL đối tượng

		demo();

		int age = 24;
		int salary = 24;

		age = 28;
		salary = age;
		salary = 32;

		System.out.println("Age: " + age);
		System.out.println("Age: " + salary);

	}

	public static void demo() {
		System.out.println("age: " + Ex02.year);
	}
}
