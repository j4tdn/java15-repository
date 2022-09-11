package map;

import bean.Item;

public class Ex00_HashcodeEqualsExplain {
	public static void main(String[] args) {
		//object --> hashcode, equals
		//identityHashCode|(static) : luôn luôn là địa chỉ của đối tượng
		//hash code(non-static)
		Item item1 = new Item(1, "Item 1", 100, 101);
		
		System.out.println(System.identityHashCode(item1));
		System.out.println(item1.hashCode());
		
		//sử dụng/override hashcode trong cấu trúc dữ liệu bưng như: Set, Map, HashTable
		
		Item item2  = new Item(1, "Item 1", 100, 101);
		System.out.println(item1.equals(item2));
		
		//sử dụng/override equals: List, Set, Map
		
		//lưu ý: số thuộc tính trong hashcode và equals phải giống nhau
	}
}
