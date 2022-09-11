package map;

import bean.Item;

public class Ex00HashcodeEqualExplain {
	public static void main(String[] args) {
		
		
		
		// hashcode: địa chỉ ô nhớ mà JVM cấp phát cho đối tượng
		//equal: soanhs 2 địa chỉ ô nhớ, trả về true nế 2 đội tượng cùng địa chỉ
		Item item1 = new Item(1, "Item 1", 100, 101);
		
		
		System.out.println(System.identityHashCode(item1));
		System.out.println(item1.hashCode());
		
		
		//sử dung/ override hashcode trong các cấu trúc dữ liệu mảng băm như: set, map, hashtable
		
		Item item2 = new Item(1, "Item 1", 100, 101);
		
		System.out.println(item1.equals(item2));
		
		//sử dụng/ override equal: List, set, map
		
		//lưu ý: số thuộc tính trong hashcode và equal phải giống nhau
	}
}
