package structure;

public class Ex05 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		/*
		 * KDL nguyên thủy
		 * + int, float, double, char --> STACK
		 * + lưu trữ được single value, giá trị đơn
		 * + khởi tạo giá trị thì dùng toán tử = -> int a = 5;
		 * 
		 * KDL đối tượng
		 * + KDL đối tượng có sẵn của JAVA: String, Integer, Float
		 * + KDL do mình tạo ra: Item, Employee, Student
		 * + khởi tạo giá trị thì dùng toán tử new để tạo ra ô nhớ ở HEAP
		 * 
		 * int vs Integer
		 * int --> STACK, luôn luôn có giá trị
		 * 	   --> lưu trữ
		 * Integer --> HEAP, có thể có giá trị hoặc không NULL
		 * 		   --> lưu trữ, hỗ trợ các phương thức hữu ích
		 */
		int number = 10;
		System.out.println("number: " + number);
		
		char letter = 'A';
		System.out.println("letter: " + letter);
		
		Integer digit = new Integer(123);
		System.out.println("digit: " + digit);
		
		Character character = new Character('B');
		System.out.println("character: " + character);
		System.out.println("checking: " + Character.isAlphabetic(character));
		
		String input = "123a";
		System.out.println("isNumber: " + input.matches("\\d+"));
	}
}
