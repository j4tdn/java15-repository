package map;

import bean.Item;

public class Ex00HashCodeEquals {
	public static void main(String[] args) {
		//Object -> hashcode, equals
		
		//mặc định
		//identifyHashCode(static): luôn luôn là địa chỉ của đối tượng
		//hashcode (non – static): mặc định - địa chỉ ô nhớ mà JVM cấp phát đối tượng. có thể override
		// equals: mặc định - so sánh 2 địa chỉ ô nhớ, trả về true nêu 2 đối tượng cùng địa chỉ
		
		Item item1 = new Item(1, "Item 1", 100, 101);
		System.out.println(System.identityHashCode(item1));
		System.out.println(item1.hashCode());
		
		//sử dụng/override hashcode trong các cấu trúc dữ liệu mã băm như : set, map, HashTable
		
		Item item2 = new Item(1, "Item 1", 100, 101);
		System.out.println(item1.equals(item2));
		
		// sử dụng/override equals: List, Set, Map
	}
}
