package structure;

public class Ex02 {
	// global variable --> thuoc tinh
	public static int year = 2003;

	public static void main(String[] args) {
		// local variable chi dung trong ham main
		int year = 1998;
		System.out.println("year:" + year);
		demo();
		int age = 24;
		int salary = 24;
		age = 28;
		salary = age;
		salary = 32;
		System.out.println("Age :"+ age);
		System.out.println("Salary :"+ salary);
	}

	public static void demo() {
		System.out.println("age : " + Ex02.year);
	}

}
