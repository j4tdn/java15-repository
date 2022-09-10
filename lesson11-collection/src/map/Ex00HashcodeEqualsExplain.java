package map;

import java.util.Map;

import bean.Item;

public class Ex00HashcodeEqualsExplain {
	public static void main(String[] args) {
		//Object class contains --> hashcode, equals
		
		//Mặc định
		//identityHashCode(item1): static luôn luôn là địa chỉ của đối tượng
		//Hashcode : địa chỉ ô nhớ mà JVM cấp phát đối tượng
		//			có thể override
		//equals: so sánh 2 địa chỉ ô nhớ
		
		Item item1 = new Item(1, "Item 1", 100, 101); 
		
		System.out.println(System.identityHashCode(item1));
		System.out.println(item1.hashCode());	//1023487453
		
		//Sử dụng/override hashcode trong các cấu trúc dữ liệu mã băm như Set, Map, HashTable
		Item item2 = new Item(1, "Item 1", 100, 101); 
		System.out.println(item1.equals(item2));
	}
}
