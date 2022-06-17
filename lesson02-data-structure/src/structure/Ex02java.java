package structure;

public class Ex02java {
	public static int age = 25;
	
	//global variable ==> attribute
public static void main(String[] args) {
	// biến
	// kdl nguyên thủy==> giá trị được lưu trữ ở stack
	int year = 1998;
	System.out.println("year: "+year);
	demo();
	int age = 24;
	int salary = 24;
	
	
	age = 28;
	salary = age ;
	salary = 32;
	System.out.println("age" + age);
	System.out.println("salary" + salary);
	
	
	// kdl đối tượng
}
public static void demo() {
	System.out.println("age: " + Ex02java.age);
}
} 
