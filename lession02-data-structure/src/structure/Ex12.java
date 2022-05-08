package structure;

import bean.CustomInteger;
import bean.Item;

public class Ex12 {
	public static void main(String[] args) {
		//Kiểu đối tượng
		
		//Kiểu có sẵn Java : Integer, String, Double
		int i = 5;
		Integer a = 5;
		Integer b = new Integer(55);
		//Kiểu do mình tạo ra : Item, Employee
		//CustomInteger c = 8;
		CustomInteger d = new CustomInteger(8);
		Item item = new Item(123, "Item123" , 100);
		
	}
}
