package structure;

public class Ex02 {
	public static int year = 2003;
	// bien o ben ngoai main se duoc goi la global variable -> attribute ( thuoc
	// tinh )
	// use of any function in class Ex02 and also Ex02's external
	// chu public also named Acessmodifier ( pham vi truy cap )

	public static void main(String[] args) {
		/**
		 * bien gom co 2 loai 1 kdl nguyen thuy => KDL nguyen thuy se luu tru o stack 2
		 * kdl doi tuong mot class se gom nhieu method method A --> {} method B --> {}
		 * bien trong ham main goi la local variable => block scope ( pham vi chi su
		 * dung o trong ham main )
		 */
		int year = 1998;

		System.out.println("year" + year); //1998
		demo();
		int age = 24;
		int salary = 24;
		age = 28;
		salary = age;
		salary = 32;
		System.out.println("age" + age);
		System.out.println("Salary" +  salary);
		
		
	}

	public static void demo() {
		System.out.println("year " + Ex02.year); //2003
	}
}
