
package structure;

import bean.CustomInteger;
import bean.Item;

public class Ex12 {
	public static void main(String[] args) {
		// kieu doi tuong

		// kieu co san cua java : Integer, String, Double ..
		int i = 7;
		Integer a = 5;
		Integer b = new Integer(55);

		// Kieu do minh tao ra : Item, Employee, CustomInteger
		//CustomInteger c = 8;
		CustomInteger d = new CustomInteger(8);

		Item item = new Item(123, "Item 123", 100);
	}
}
