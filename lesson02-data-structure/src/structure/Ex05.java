package structure;

public class Ex05 {
	public static void main(String[] args) {
		
		// kiểu dữ liệu nguyên thủy 
		// + int float,double được lưu trữ ở stack 
		// + chỉ lưu trữ được giá trị đơn lẻ
		// + 
		
		
		// kiểu dữ liệu đối tượng
		// kiểu dữ liệu đối tượng có sẵn của java ,String, Integer, float
		// int với Integer
		// int --> stack , luôn luôn có giá trị 
		// ----> lưu trữ giá trị
		// integer --> có thể có hoặc ko 
		// integer là một class lưu trữ hỗ trợ các phương thức hữu ích
		// khởi tạo ra giá trị dùng toán tử new để tạo ra ô nhớ
		
		int number = 10;
		char letter = 'A';
		Integer digit = new Integer(123);
		System.out.println("ItemA: " + digit);
		Character character = new Character('B');
		System.out.println("character: "+character);
		System.out.println("checking: "+character.isAlphabetic(letter));
		
		String input = "12636";
		System.out.println("isnumber: "+ input.matches("\\d+")); 
	}

		
}
