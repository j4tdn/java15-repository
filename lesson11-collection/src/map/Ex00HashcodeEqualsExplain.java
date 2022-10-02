package map;

import been.Item;

public class Ex00HashcodeEqualsExplain {
	public static void main(String[] args) {
		// Object --> hashcode, equals
		
		// identityHashCode(static): luôn luôn là địa chỉ của dối tượng
		//hashcode: địa chỉ ô nhớ mà JVM cấp phát đối tượng
		//		:   có thể override
		//equals: so sánh 2 địa chỉ ô nhớ
		
		Item item1 = new Item(1, "Item 1", 100, 101);
		
		
		System.out.println(System.identityHashCode(item1));
		System.out.println(item1.hashCode());
		
		// sử dụng/ override hashCode trong các cấu trúc dữ liệu mã băm như : Set, Map, HashTabl
		
		Item item2 = new  Item(1, "Item 2", 100, 101);
		System.out.println(item1.equals(item2));
		
	}
}
