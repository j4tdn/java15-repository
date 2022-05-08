package bean;
/**
 * Kieu du lieu Item , self-defination
 * + ItemId
 * + Name
 * + Price
 * @author MSI GL65
 *
 */
public class Item {
	// trong class java gom 2 phan
	// cau truc du lieu ( attribute )
	// thuat toan -> Ham , phuong thuc
	public int ItemId;
	public String Name;
	public double Price;
	public Item () {};
public Item (int ItemIdPr , String NamePr , double PricePr) {
	this.ItemId = ItemIdPr;
	this.Name = NamePr;
	this.Price = PricePr;
	//Pr =parameter
	// 1 class se co cac thuoc tinh
	// 1 doi tuong tao ra tu cac class do se co thong tin cua cac class nay
};
	@Override
	/**
	 * itemA.toString()
	 * itemB.toString()
	 * itemA , itemB : doi tuong cua class Item
	 * itemA.toString -> this la itemA
	 * itemB.toString -> this la itemB
	 */
	public String toString() {
		// TODO Auto-generated method stub
		return this.ItemId + ", " + this.Name + "," + this.Price ;
	}
}
