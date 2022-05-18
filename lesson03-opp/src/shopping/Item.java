package shopping;

public class Item {
	private String id;
	private String os;
	private String color;
	private double cost;// database: column: null, non-null: extra-info: text
	
	public Item() {
	}
   // Source + Generate Constructor using Fields
	public Item(String id, String os, String color, double cost) {
		super();
		this.id = id;
		this.os = os;
		this.color = color;
		this.cost = cost;
	}
	// Source + Generate hashCode() and equals()
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	// Source + Generate toString()S
	@Override
	public String toString() {
		return "Item [id=" + id + ", os=" + os + ", color=" + color + ", cost=" + cost + "]";
	}
	
}
