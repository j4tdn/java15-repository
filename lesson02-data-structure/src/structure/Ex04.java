package structure;

import bean.Item;

public class Ex04 {
	public static void main(String[] args) {
		
		int age=18;
		double price=22.520;
		char letter='X';
		System.out.println("Age: " +age);
		System.out.println("Price: " +price);
		System.out.println("Letter: " +letter);
		
		
		
		Item itemA= new Item(); // new Item khởi tạo ô nhớ ở HEAP để lưu trữ giá trị

		itemA.itemId= 123;
		itemA.name= "Laptop Lenovo X 123";
		itemA.price= 2.0;
		
		System.out.println("ItemA: " +itemA);
		
		Item itemB = new Item();
		itemB.name = "LG X234";
		System.out.println("ItemB : "+ itemB);
		
		Item itemC = new Item(123, "LG", 456.0);
		System.out.println("ItemC : "+ itemC);
				
	}

}
