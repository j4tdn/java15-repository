package structure;

import bean.Item;

public class Ex04 {
	public static void main(String[] args) {
		// Variables ( bien ) : age , price , age , itemA
		// 100% variables locate in Stack and value also locate in Stack ( Primitive
		// Type )
		// Primitive type
		int age = 18;
		double price = 22.250d;
		char letter = 'X';
		System.out.println("Age" + age);
		System.out.println("Price" + price);
		System.out.println("Letter" + letter);
		// Object type
		// Id save at Stack and Value save at HEAP
		// null nam o HEAP
		// new Item(); => Khởi tạo đối tượng , ô nhớ ở HEAP để lưu trữ giá trị
		// Thực thi code bên phải trước và truyền về cho bên trái
		Item itemA = new Item(123,"sIUUU",222222);
		itemA.ItemId = 123;
		itemA.Name = "Ronaldo SIuuuu";
		itemA.Price = 222222222;
		// khi goi , in ra bien kieu du lieu doi tuong thi no se goi ra ham to String
		// cua class' object'
		// Neu trong class Item dinh nghia lai ham toString thi itemA itemB se goi ham
		// toString trong clas Item
		System.out.println("ItemA" + itemA);
		Item itemB = new Item(0,"MEssi Goat",0);
		itemB.Name = "MEssi Goat";
		System.out.println("ItemB" + itemB);
		Item itemC = new Item(567, "IphoneX", 60000);
		System.out.println(" ItemC : " + itemC);

	}
}
