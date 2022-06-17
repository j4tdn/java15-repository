// NGÀY 3 THÁNG 4 CLASS
package structure;

import bean.Item;

public class Ex03App {//04
	public static void main(String[] args) {
		//primitive type nguyên thủy
		// 100% biến  lưu trử , nằm ở stack
		//vd: 19 ,....
		// giá trị kiểu nguyên thủy nằm ở stack
		// giá trị của kiểu đối tượng nằm ở heap
		//			: giá trị null là chưa khởi tạo ô nhớ trên heap
		
		int age =  18;
		double price =22.520;
		char letter = 'X';
		System.out.println("Age: " + age);
		System.out.println("Price: " + price);
		System.out.println("Letter: " +letter);
		
		
		
		// object type kiểu đối tương
	
	Item itemA = new Item();
	itemA.itemId = 123;
	itemA.name = "laptop lenovo x123";
	itemA.price= 200000;
	// khởi tạo đối tượng ô nhớ ở heap để lưu trữ giá trị
	// ItemA: bean.Item@76ccd017 địa chỉ ô nhớ
	System.out.println("ItemA: " + itemA);
	// mặc ddinmhj khi in ra biến kiểu dữ liệu đối tượng thì tự độngnó sẽ gọi hàm tên là 
	// hàm tên là toString của class object
	//class object mặc định là cha của tất cả các class trong java
	// nếu trong class itemm ddingj nghĩa lại hàm tostring 
	//thì item A sẽ gọi toSting trong class item
	//System.out.println("ItemA: " + itemA.toString());
		//get class.getname+@tohexstring(hashcode)
	Item itemB = new Item();
	
	// new gọi khởi tạo đối tuuowng
	itemB.name = " chi do ";
	itemB.itemId = 2222;
	itemB.price = 671236;
	
	System.out.println("Item: "+itemB);
	
	Item itemC = new Item(6726,"hsdu",237);
	System.out.println("Item: "+itemC);
	// item a = null ko trỏ đến ô nhớ nào trên head
	// thêm từ khóa final để trở thành hằng số
	// hằng sô vẫn thay đổi được ở kiểu dữ liệu đối tượng 
	
	
	}

}
