package structure;

// Comment: chu thich
public class Ex01TestMainMethod {
   public static void main(String[] args) {
	   System.out.println("Welcome to JAVA15 class");
	   System.out.println("Today: lesson02-data-structure");
	   
	   anotherMain();
   }
   
   // method structure --> anotherMain ten phuong thuc
   // --> void: kieu du lieu tra ve
   //         : khong tra ve gi ca
   public static void anotherMain() {
	   System.out.println("Year --> " + Ex02.year);
   }
}
