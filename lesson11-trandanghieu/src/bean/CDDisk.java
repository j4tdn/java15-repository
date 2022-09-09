package bean;

public class CDDisk {
	private int id;
	private String type;
	private String singer;
	private int numberofsong;
	private float price;

	public CDDisk() {
	}

	public CDDisk(int id, String type, String singer, int numberofsong, float price) {
		this.id = id;
		this.type = type;
		this.singer = singer;
		this.numberofsong = numberofsong;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getNumberofsong() {
		return numberofsong;
	}

	public void setNumberofsong(int numberofsong) {
		this.numberofsong = numberofsong;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return " \n CDDisk [id=" + id + ", type=" + type + ", singer=" + singer + ", numberofsong=" + numberofsong
				+ ", price=" + price + "]";
		
		
	}

}
