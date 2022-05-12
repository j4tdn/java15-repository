package structure;

public class Ex02 {
	// format code --> ctrl shift f
	// global variable : biến toàn cục ->attribute
	// public: đc sử dụng mọi nơi
	// private: chỉ đc dùng trong own class
	// static : class's scope
	// non-static : object's class
	// mình phải tạo đối tượng từ class đó rồi lấy đối tượng biến non-static
	public static int age = 25;

	public static void main(String[] args) {
		// local variable : biến cục bộ -> block scope
		// biến
		// kiểu dữ liệu nguyên thủy => giá trị đc lưu trữ ở stack
		int year = 1998;
		System.out.println("year: " + year);

		demo();
		int age = 24;
		int salary = 24;
		age = 28;
		salary = age;
		salary = 32;
		System.out.println(age);
		System.out.println(salary);
		// kdl đối tượng

	}

	public static void demo() {
		System.out.println("age: " + age);
	}
}