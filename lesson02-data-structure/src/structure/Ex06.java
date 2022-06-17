// THứ 6 Ngày 08 Tháng 4 

package structure;

import bean.Item;

public class Ex06 {

	public static void main(String[] args) {
	final	float PI = 3.14f;// hằng số
	
	
		System.out.println();
		
		//PI = 6.18f;
		
		final Item itemX = new Item(123, "Item 123", 250);
		
		Item itemY = new Item(234, "Item 234", 360);
		// bao nhiêu o nhớ trên head được tạo ra tương ứng với bấy nhiêu đuối tượng
		// lấy địa chỉ của đối tượng gán cho biến ở stack
		// toán tử bằng hoạt động hoàn toàn trên stack
		
		//itemX = itemY;
		//cập nhâtj giá trị cho biến 
		//itemX = itemY;
		//itemX.name = "Update Item";
		System.out.println("ItemY address: " + System.identityHashCode(itemY));
		itemX.name = "Update Item";
		System.out.println(itemX);// 8h 50 ? chưa hiểu 
		
		
	}

}
