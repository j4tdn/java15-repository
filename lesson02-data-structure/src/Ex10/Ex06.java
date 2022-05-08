package Ex10;

import bean.Item;

public class Ex06 {
	
	public static void main(String[] args) {
		// final --> cannot update value at STACK(không thể cập nhật dữ liệu ở stack)
		final float PI = 3.14f;
		
		// wrong update
		// PI = 6.28f;
		
	    final Item itemX = new Item(123, "Item 123", 250);
	    //final là final ở stack nên ko cập nhật được giá trị ở stack
	    // nhưng giá trị nằm ở head thì vẫn cập nhật được 
		//item x g�?i là biến(thuộc kiểu dữ liệu đối tượng)
		//new item(123,   ,  )g�?i là đối tượng --> bao nhiêu ô nhớ thì có bao nhiêu đối tượng
		// vế trái = vế phải thực hiện vế phải rồi gán kết quả cho vế trái
		//sout --> ctrl + space = System.out.println("");
		// system.ident ctrl +space --> System.identityHashCode
		
		System.out.println("ItemX address: " + System.identityHashCode(itemX));
		Item itemY = new Item(234, "Item 234", 360);
	    System.out.println("ItemY address: " + System.identityHashCode(itemY));
	  
	    // itemX = itemY;
	    // toán tử bằng hoạt động 100% trên stack 
	   System.out.println("Item address: " + System.identityHashCode(itemX));
	   itemX.name = "Updated Item";
	   //khi in ra 1 biến mà biến là kiểu đối tượng thì mặt định của hàm tostring
	   System.out.println(itemX);
	}
	
    
}
