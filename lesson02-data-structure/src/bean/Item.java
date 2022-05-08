package bean;



public class Item {
  //cấu trúc dữ liệu -->biến, thuộc tính
  //thuật toán -->hàm, phương thức
	public int itemId;
	public String name;
	public double price;
	
	//itemA.toString()
	//itemB.toString()
public Item() {
	
}
	
	public Item(int itemIdPr, String namePr, double pricePr) {
		this.itemId = itemIdPr;
		this.name = namePr;
		this.price = pricePr;
	}
	
	public String toString() {
		return this.itemId + ", " + this.name+ ", " + this.price;
		
	}
	
}
