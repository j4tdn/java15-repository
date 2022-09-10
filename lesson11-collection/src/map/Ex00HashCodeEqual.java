package map;

import bean.Item;

public class Ex00HashCodeEqual {
	public static void main(String[] args) {
		// Object -> hashcode , equals

		// Mac dinh
		// identityHashCode(static) : luon luon la dia chi cua doi tuong
		// hashcode(non-static) : dia chi o nho ma JVM da cap phat cho doi tuong , co
		// the override
		// equals : so sanh dia chi o nho , tra ve true neu 2 doi tuong cung dia chi
		Item item1 = new Item(1, "Item 1", 100, 101);
		System.out.println(System.identityHashCode(item1)); // 1023487453
		System.out.println(item1.hashCode()); // 1023487453 32(hashed value)
		// neu chua override lai ham hashcode thi 2 phuong thuc nhu nhau
		// su dung/ override hashcode trong cau truc du lieu ma bem nhu : Set , Map , HashTable
		Item item2 = new Item(1, "Item 1", 100, 101);
		System.out.println(item1.equals(item2));
		// su dung override equals : List(contains , remove) , Set(add) , Map(put)
		// luu y : so thuoc tinh trong hashcode va equals phai giong nhau
	}
}
