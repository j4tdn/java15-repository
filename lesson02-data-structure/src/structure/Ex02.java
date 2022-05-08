package structure;

public class Ex02 {
	public static int yeah = 2003;

	public static void main(String[] args) {
		// Biến
		// KDL nguyên thủy ==> giá trị được lưu trữ ở stack
		int year = 1998;
		System.out.println("year: " + year);
		demo();
		// KDL đối tượng
		
		int age = 24;
		int salary = 24;
		
		age = 28;
		salary = age;
		salary = 32;
		
		System.out.println("Age: " + age);
		System.out.println("Salary:" + salary);
	}

	public static void demo() {
		System.out.println("age: " +  Ex02.yeah);
	}
}
