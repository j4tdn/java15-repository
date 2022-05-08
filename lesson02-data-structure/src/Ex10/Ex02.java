package Ex10;

import javax.sound.midi.Soundbank;

public class Ex02 {
	 // global variale --> attribute
	// use of any function in class Ex2 and also Ex02's external
	// access modifier: phạm vi truy cập
	// private: chỉ được sử dụng bên trong own class
	//public : được phép truy cập m�?i nơi --> static ?
	 public static int age = 25;
	 
     public static void main(String[] args){
    	 //local variable: biến cục bộ chỉ sử dụng trong hàm main
    	 //Biến
    	 //KDL nguyên thủy ==> giá trị được lưu trữ ở strack
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
    	 
    	 //KDL đối tượng
     }
     
     public static void demo() {
    	 System.out.println("age: " + Ex02.age);
 
     }
}
