package structure;

public class Ex05 {
	public static void main(String[] args) {
		// KDL nguyên thủy
		// + int, float, double, char --> STACK
		// + lưu trữ được single value, giá trị đơn
		// + Khởi tạo giá trị thì dùng toán tử = => int a = 5;
		
		// KDL đối tượng
		// + KDL đối tượng có sẵn của JAVA: String, Integer, Float 
		// + KDL do mình tạo ra: Item, Employee, Student
		// + Khởi tạo giá trị thì dùng toán tử new để tạo ra ô nhớ ở HEAP
		
		// int vs Integer
		
		// int      --> STACK, luôn luôn có giá trị
		//          --> lưu trữ
		
		// Integer --> HEAP, có thể có giá trị hoặc không NULL
		//             lưu trữ, hỗ trợ các phương thức hữu ích 
		char letter = 'A';
		System.out.println("letter: " + letter);
		
		Character character = new Character('B');
		character = null;
		System.out.println("character: " + character);
		System.out.println("checking: " + Character.isAlphabetic(letter));
		
		String input = "25a3615";
		System.out.println("isNumber: " + input.matches("\\d+"));
	}
}
	


