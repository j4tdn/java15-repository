package shopping;

public class Item {
	private String id;
	private String os;
	private String color;

	private double cost;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(String id, String color, String os, double cost) {
		super();
		this.id = id;
		this.color = color;
		this.os = os;
		this.cost = cost;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", color=" + color + ", os=" + os + ", cost=" + cost + "]";
	}
	
}
