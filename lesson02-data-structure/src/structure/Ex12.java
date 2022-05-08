package structure;

import bean.CustomInteger;
import bean.Item;

public class Ex12 {
	public static void main(String[] args) {
		//kiểu đối tượng
		
		//kiểu có sẵn của Java: Integer, Float, ..
		Integer a = 5;
		Integer b = new Integer(55);
		
		
		//kiểu do mình tạo ra: Item, Employee, ...
		//CustomInteger c = 8;
		CustomInteger d = new CustomInteger(8);
		
		Item item = new Item(123, "Item 123", 100);
	}
}
