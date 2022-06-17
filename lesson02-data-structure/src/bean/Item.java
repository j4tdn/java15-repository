package bean;

public class Item {
/**
 * kiểu dữ liệu Item , tự định nghĩa 
 * mã mh 
 * tên mh 
 * giá bán
 * 
 */
	public int itemId;
	public String name;
	public double price;// giá bán
	
		public Item() {
			// hàm khởi tạo
		}
	public Item(int itemIdPr,String namePr, double pricePr) {
		this.itemId = itemIdPr;
		this.name = namePr;
		this.price = pricePr;
		
		
	}
	//itemA.toString()
	//itemB.toString()
	
	@Override
	// đang định ngĩa lại từ class cha
		public String toString() {
			// TODO Auto-generated method stub
			return this.itemId + ","+ this.name+","+ this.price+",";
			//itemA.tostring---> this là itemA
			//itemb..........--> this là itemB
			
		}
}
