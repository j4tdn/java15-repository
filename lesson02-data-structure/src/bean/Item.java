package bean;

public class Item {
    private int itemID;
    private String name;
    private double price;

    public Item() {
    	
    }
    public Item(int itemID, String name, double price){
        this.itemID = itemID;
        this.name = name;
        this.price = price;
    }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.itemID + " " + this.name + " " + this.price;
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
    
    
}
