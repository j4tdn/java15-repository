package map;

import bean.Item;

public class Ex00HashCodeEquals {
	public static void main(String[] args) {
		// Object --> hashcode, equals
		
		// Mặc định
		// identityHashCode(static); luôn luôn là địa chỉ của đối tượng
		// hàm static không override được
		// hashcode(non-static): địa chỉ ô nhơ mà JVM cấp phát đối tượng
		//						có thể override
		// equals: so sánh 2 địa chỉ ô nhớ, trả về true nếu cùng địa chỉ
		
		Item item1 = new Item(1, "Item 1", 100 , 101);
		
		System.out.println(System.identityHashCode(item1));
		System.out.println(item1.hashCode()); // 32 ( hashed value)
		
		// sử dụng override hashcode trong các CTDL: Set, Map, Hashtable
		
		Item item2 = new Item(1, "Item 1", 100 , 101);
		
		System.out.println(item1.equals(item2)); // false true(override)
		
		// sử dụng/ override equals: List, Set, Map
		
		// lưu ý: số thuộc tính trong hashcode và equals phải giống nhau
	}
}
