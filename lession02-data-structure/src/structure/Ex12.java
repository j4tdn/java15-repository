package structure;
import bean.CustomInteger;
import bean.Item;

public class Ex12 {
	public static void main(String[] args) {
		// Kiểu đối tượng
		// Kiểu có sẵn của java: Integer, String, Double...
		Integer a=5;
		Integer b=new Integer(55);
		// Kiểu do mình tự tạo ra: Item, Employee, CustomInteger
		//CustomInteger c=8;
		CustomInteger c= new CustomInteger(8);
		Item item = new Item(123,"Item 123", 100);
		
	}
}
