package structure;

public class Ex05 {
	public static void main(String[] args) {
		/**
		 * KDL nguyên thủy
		 * 1. int , float , double , char ,... đều lưu trữ ở STACK 
		 * 2.các kiểu dữ liệu trên chỉ lưu trữ được single value ( giá trị đơn lẻ )
		 * 3. mục đính chính : lưu trữ 1 thông tin và luôn có giá trị
		 *  KDL đối tượng 
		 *  1. Những kdl đối tượng thuộc Java như String , Integer , Float trong khi int phải bắt buộc luôn có
		 * giá thì Integer thì có thể có hoặc không ( null ở HEAP ) và hữu ích trong một vài trường hợp ( dùng những phương thức để xử lí )
		 */
char letter = 'A'; 
System.out.println(" letter : " + letter);
Character character = new Character('B');
System.out.println("character :" + character);
System.out.println("checking" + character.isAlphabetic(letter));
String input = "12314b" ;
System.out.println(" Isnumber:  " + input.matches("\\d+"));
Integer number = new Integer (10);
System.out.println("Number" + number);
	}
}
