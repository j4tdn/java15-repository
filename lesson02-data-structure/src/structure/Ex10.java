package structure;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hoán vị 2 phần tử
		CustomInteger a = new CustomInteger(12);
		CustomInteger b = new CustomInteger(36);
		System.out.println("a b: "+ a + b);
		
		System.out.println("<===swap===>: ");
	swap(a,b);
	System.out.println("a b: "+ a + b);
	
	
	}
		// static để làm gì
		private static void swap( CustomInteger a, CustomInteger b) {
			
			int temp = a.value;
			a.value = b.value;
			b.value = temp;
			System.out.println("a b: "+ a + b);

		}
		 // trên integer dưới integer ko hoán vị vì :
	// khhi nào dùng kiểu nguyên thủy khi giá trị đó luôn có giá trị
		// khi dùng kiểu dữ liệu đối tượng :+ko bắt buộc null hoặc có giá trị
					//					   :+ nhiều thuộ tính , giá trị ko có bắt buộc
		// khi cần hỗ trợ các phương thức xử lí
		
										   

}
