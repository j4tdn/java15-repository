package structure;

import bean.Item;

public class Ex04 {
    public static void main(String[] args) {
    	// Vaiables: age, price, letter, itemA
    	// ==>> 100: Biến lưu trữ, nằm ở STACK
    	
    	// Values: 18, 22.520, 'X'
    	// ==> Primitive: Giá trị sẽ nằm ở STACK
    	
    	//Primitive Type
    	int age = 18;
    	double price = 22.520;
    	char letter = 'X';
    	System.out.println("Age: "+ age);
    	System.out.println("Price: " + price);
    	System.out.println("Letter: " + letter);
    	
    	
    	
    	
     // Object Type
     // new Item() --> Khởi tạo đối tượng, ô nhớ ở HEAP để lưu trữ giá trị
     // khi a = b thì sẽ thực thi bên phải trước và gán cho bên trái
     //mỗi ô nhớ có 1 địa chỉ, mỗi ô nhớ sẽ được gán vs 
    	Item itemA = new Item();
    	itemA.itemId = 123;
    	itemA.name = "Laptop Lenovo X123";
    	itemA.price = 2200;
   
    //khi gọi, in ra biến kiểu dữ liệu đối tượng thì tự động nó sẽ gọi h
    // hàm toString của class 'Object'
    // Class Object: Mặc định là hca của tất cả các class trong Java
    //    toSing: in ra giá trị thông tin của đối tượng hiện tại
    	
    // Nếu trong class Item định nghĩa - override lại hàm toString
    // Thì ItemA itemB sẽ gọi T
    	System.out.println("ItemA: " + itemA);
    // System.out.println("ItemA: " + itemA.toString());
   
    	
    // getClass().getName() + "@" + Integer.toHexString(hashCode())
    	Item itemB = new Item();
    	itemB.itemId = 234;
    	itemB.name = "LG X234";
    	itemB.price = 5200;
    	System.out.println("ItemB: " + itemB);
    	
    	Item itemC = new Item(567, "Iphone X", 6000);
    	System.out.println("Item-C: " + itemC);
  
    	
    	
    	
    }
}
