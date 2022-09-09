package map;

import bean.Item;

public class Ex00HashCodeEqualsExplain {
	public static void main(String[] args) {
		// Object --> hashcode, equals
		
		// Mặc định
		// identityHashCode(static): luôn luôn là địa chỉ của đối tượng
		// hashcode(non-static): địa chỉ ô nhớ mà JVM cấp phát cho đối tượng
		//					   : có thể override
		// equals: so sánh 2 địa chỉ ô nhớ, trả về true nếu 2 đối tượng cùng địa chỉ
		
		Item item1 = new Item(1, "Item 1", 100, 101);
		System.out.println(System.identityHashCode(item1));
		System.out.println(item1.hashCode()); // hashed value
		
		// override hashcode trong các cấu trúc dữ liệu mã băm như Set, Map, HashTable
		
		Item item2 =  new Item(1, "Item 1", 100, 101);
		System.out.println(item1.equals(item2)); // false true (override)
		
		// sử dụng/ override equals: List(contains, remove), Set(add), Map(put)
		
		// lưu ý: số thuộc tính trong equals và hashcode phải giống nhau
	}
}
