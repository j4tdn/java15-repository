package structure;

public class Ex02 {

	public static int year = 2003;

	public static void main(String[] args) {
		// bien
		// kdl nguyen thuy --> gia tri duoc luu tru o stack
		int year = 1998;

		System.out.println("year: " + year);

		demo();
		
		int age = 24;
		int salary = 24;
		
		age = 28;
		salary = age;
		salary = 32;
		
		System.out.println("Age: " + age);
		System.out.println("salary: " + salary);

		// kdk doi duong
	}

	public static void demo() {
		System.out.println("age: " + Ex02.year);
	}
}
// format coder -> ctrl shift f 