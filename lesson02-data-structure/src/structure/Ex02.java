package structure;

/**
 * class
 * 	+ methodA --> {}
 * 	+ methodB --> {}
 */
public class Ex02 {
	
	//global variable --> attribute (thuoc tinh)
	//use of any function in class Ex02 and also Ex02's external
	//access modifier: phạm vi truy cập
	//private: chỉ được phép sử dụng bên trong own class
	//public: được phép dùng ở mọi nơi --> static?
	
	//static --> Class's scope
	//non-static --> object's scope
	//Để gọi biến non-static trong class
	//Mình phải gọi đối tượng từ class đó rồi lấy đối tượng gọi biến non-static
	public static int age = 25;
	
	public static void main(String[] args) {
		//local variable --> block scope
		//Biến
		//KDL nguyên thủy ==> giá trị được lưu trữ ở stack
		int year = 1998;
		System.out.println("year" + year);//1998
		
		demo();
		
		int age = 24;
		int salary = 24;
		
		age = 28;
		salary = age;
		salary = 32;
		
		System.out.println("age: " + age);      //28
		System.out.println("salary: " + salary);//32  
		
		//KDL đối tượng 
	}
	
	//format code --> bấm ctrl shift f
	public static void demo() {
		System.out.println("age: " + age);
	}
}
