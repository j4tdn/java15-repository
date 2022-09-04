package ex02;

public class ItemCD {
	private int idCD;
	private String type;
	private String single;
	private Double price;
	public ItemCD(int idCD, String type, String single, Double price) {
		this.idCD = idCD;
		this.type = type;
		this.single = single;
		this.price = price;
	}
	public int getIdCD() {
		return idCD;
	}
	public void setIdCD(int idCD) {
		this.idCD = idCD;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSingle() {
		return single;
	}
	public void setSingle(String single) {
		this.single = single;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "\nItemCD [idCD=" + idCD + ", type=" + type + ", single=" + single + ", price=" + price + "]";
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(!(o instanceof ItemCD)){
			return false;
		}
		ItemCD that = (ItemCD)o;
		return getIdCD() == that.getIdCD();
	}
	
	
	
}
