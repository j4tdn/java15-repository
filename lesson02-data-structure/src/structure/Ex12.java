package structure;

public class Ex12 {
    public static void main(String[] args) {
		// kiểu đối tượng
    	
    	// Kiểu có sẵn của Java: Integer, String, Double,...
    	int i = 7;
    	// lưu trữ ở stack vì kiểu nguyên thủy
    	Integer a = 5;//lưu trữ ở head ==>giá trị của kiểu đối tượng
    	Integer b = new Integer(55);
    	
    	// Kiểu do mình tạo ra: Item, Employee, CustomInteger
    	//CustomInteger c = 8;
    	CustomInteger d = new CustomInteger(8);
    	
    	Item item = new Item(123, "Item 123", 100);
    	
	}
}
