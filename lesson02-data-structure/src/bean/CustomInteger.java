package bean;

public class CustomInteger {
    // từ 1 class có thể tạo ra nhiều đối tượng
	// đối tượng được lưu trữ trên head
	public int value;
	//value của đối tượng
	
	public CustomInteger(int value) {
	//hàm khởi tạo để tạo ra đối tượng
	// hàm khởi tạo không có giá trị trả về
	// hàm khởi tạo phải cùng tên với class
	// value của hàm ngoài truyền vào
	   this.value = value;
    // biến kiểu đối tượng in ra hàm tostring
}
	
    @Override
    public String toString() {
    	return "" + this.value;
    	// đối tượng nào chấm hàm tostring thì this . tới đối tượng đó
    	
}
    }
    
