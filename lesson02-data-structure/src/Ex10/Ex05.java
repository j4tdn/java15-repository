package Ex10;

public class Ex05 {
	public static void main(String[] arge) {
		// Kiểu dữ liệu nguyên thủy
		// + int, float, double, char --> STACK
		// + lưu trữ được single value, giá trị đơn
		// + Khởi tạo giá trị thì dùng toán tử = -> ingt a = 5;
		
		// Kiểu dữ liệu đối tượng
		// + Kiểu dữ liệu có sẵn có sẵn của JAVA: String, Integer, Float
		// + KDL do mình tạo ra: Item, Employye, Student
		// + Khởi tạo gia trị dùng toán tử new để tạo ra ô nhớ ở HEAP
		
		// int vs integer
		
		// int  --> STACK, luôn luôn có giá trị
		// Interger  --> HEAP, có thể có giá trị hoặc không NUll
	    //    lưu trữ, hỗ trợ các phương thức hữu ích
		char letter = 'A';
		System.out.println("letter: " + letter);
		
		Character character = new Character('B');
		System.out.println("character: " + character);
		System.out.println("checking: " + Character.isAlphabetic(letter));
		
		String input = "25a3615";
		System.out.println("isNumber: " + input.matches("\\d+"));
		
		System.out.println("isNumber: " + input.matches());
	}

}
