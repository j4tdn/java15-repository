package structure;

public class Ex05 {
	// KDL Nguyên thủy - Primity Type
	// int, float, double, char=> STACK
	// lưu trữ được single value, giá trị đơn lẻ

	// KDL Đối tượng - Object Type
	// KDL đối tượng có sẵn của JAVA: String, Interger, Float....

	// int vs Interger
	// int => Stack, luôn luôn có giá trị
	// Interger ==> HEAP --> có thể có giá trị là null
	public static void main(String[] args) {

		char letter = 'A';
		System.out.println("Letter " + letter);

		Character character = new Character('B');
		System.out.println(" Character " + character);
		System.out.println("Checking " + Character.isAlphabetic(letter));

		String input = "21asfs";
		System.out.println((" isNumber: " + input.matches(("\\d+"))));
	}

}
