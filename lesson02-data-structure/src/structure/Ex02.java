package structure;

public class Ex02 {
	
	// global variable--> attribute
	// use ofany function in class Ex02 and also Ex02's external
	// accesss modifier: pham vi truy cap
	// private: chi duoc phep su dung ben trong own class
	// public: duoc phep su dung o moi noi --> static 
	
	// sttic  --> Class's scope --> Laays class goi duoc
	// non-static --> object's scope
	// de goi bien non-static trong class
	// Minh phaitao doi tuong tu class do roi lay doi tuong goi bien non-static
	
	public static int year = 2003; 
	
	public static void main(String[] args) {
		// local variable --> block scope
		// bien
		// KDl nguyen thuy --> gia trij duoc luu tru ow stack
		int year = 1998;
		System.out.println("year: " + year);
		
		demo();
		
		int age = 24;
		int salary = 24;
		
		age = 28;
		salary = age;
		salary = 32;
		
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
		
	}
		// forctrl shift f
	public static void demo () {
		System.out.println("age: " + Ex02.year); ///2003
	}
}
