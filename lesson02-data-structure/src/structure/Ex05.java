package structure;

public class Ex05 {
      //KDL nguyên thủy:
	  //- int, float, double, char --> giá trị lưu trữ ở STACK
	  //- lưu trữ dữ liệu đơn giản, dữ liệu đơn
	  // khởi tạo giá trị dùng dấu = ex: int a=5;
	
	  //KDL đối tượng:
	  //đối tượng có sẵn của JAVA: String, Integer, Float
	  //đối tượng do mình tạo ra: Item, Employee...
	  // khởi tạo giá trị dùng toán tử new để tạo ô nhớ ở HEAP
	
	
	  // int và Integer
	  // int --> STACK, luôn luôn có giá trị --> lưu trữ
	  // Integer--> HEAP, có thể có giá trị hoặc không NULL--> lưu trữ
	  //Integer digit = new Integer(122);
	  public static void main(String args) {
		  char letter = 'A';
		  System.out.println("letter: " + letter);
		  
		  //Character character = new Character('B');
		 // System.out.println("character : " + character);
		 // System.out.println("checking : " + Character.isAlphabetic(letter));
		  
		  String input = "25a";
		  System.out.println("isnumber : " + input.matches("\\d+"));
	  }
	  
	  
}
