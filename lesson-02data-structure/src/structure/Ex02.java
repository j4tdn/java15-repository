package structure;

public class Ex02 {
	public static int year = 26;

	public static void main(String[] args) {
		int year = 2009;
		System.out.println("in ra: " + year);
		demo();
		int age = 24;
		int salary = 24;
		age = 28;
		salary = age;
		salary = 32;
		System.out.println(" age: "+ age);
		System.out.println("salary: "+ salary);
	}

	public static void demo() {
		System.out.println("tuoi: " + year);
	}
}
