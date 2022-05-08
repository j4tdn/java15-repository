package structure;

public class Ex02 {
	public static int year=2022;

	public static void main(String[] args) {
		// Kieu du lieu nguyen thuy ==> luu o stack
		int year = 2002;
		System.out.println("Year " + year);
		inAge();
		int age=24;
		int salary=24;
		 age=28;
		 salary=age;
		 salary=32;
		 System.out.println(age + "" +salary);

	}
	public static void inAge() {
		System.out.println("Year " + year);
	}
}
