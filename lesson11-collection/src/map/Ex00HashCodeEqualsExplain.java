package map;

import bean.Item;

public class Ex00HashCodeEqualsExplain {
	public static void main(String[] args) {
		// Object --> hashcode, equals

		// Mặc định
		//System.identityHashCode(static):luôn luôn là địa chỉ đối tượng
		// hashcode (nonstatic): địa chỉ ô nhớ mà JVM cấp phát đối tượng, có thể overide
		// equals: so sánh 2 địa chỉ ô nhớ, trả về true nếu 2 đối tượng cùng địa chỉ ô
		// nhớ

		Item item1 = new Item(1, "Item1", 100, 101);
		System.out.println(System.identityHashCode(item1));
		System.out.println(item1.hashCode()); //32 hashed value
		
		// sử dụng overide hashcode trong các cấu trúc dữ liệu mã băm như: set map hashtable
		Item item2= new Item(1, "Item1", 100, 101);
		
		System.out.println(item1.equals(item2)); // false true(overide)
		// sử dụng/ overide equals: List(contain,remove),Set(add),Map
		// số thuộc tính trong hashcode và equals phải giống nhau
		
		
		
		
		

	}
}
