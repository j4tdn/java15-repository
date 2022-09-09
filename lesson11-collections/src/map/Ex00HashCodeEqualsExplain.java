package map;

import bean.Item;

public class Ex00HashCodeEqualsExplain {
	public static void main(String[] args) {
		// Object --> hashcode() , equals()

		// Mặc định
		// identityHashCode(static): luôn luôn là địa chỉ của đối tượng
		// hashcode(non-static): địa chỉ ô nhớ mà JVM cấp phát đối tượng
		// : có thể overide
		// equals: so sánh 2 địa chỉ ô nhớ, trả về true nếu 2 địa chỉ cùng ô nhớ

		Item itemA = new Item(1, "Item 1", 100, 101);
		System.out.println(System.identityHashCode(itemA)); // 263025902
		System.out.println(itemA.hashCode()); // 263025902 32(hashed value)
		
		// sử dụng/override hashcod trong các cấu trúc dữ liệu mã băm như: Set, Map, HashTable
		
		Item itemB = new Item(1, "Item 1", 100, 101);
		System.out.println(itemA.equals(itemB));
		
		// sử dụng/override equals: List, Set, Map
		
		// lưu ý: số thuộc tính trong hashcode và equals phải giống nhau
		
		
	}
}
