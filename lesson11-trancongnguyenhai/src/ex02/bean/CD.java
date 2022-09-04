package ex02.bean;

public class CD {
	private int id;
	private String type;
	private String single;
	private int numOfSong;
	private float price;

	public CD() {
		
	}

	public CD(int id, String type, String single, int numOfSong, float price) {
		this.id = id;
		this.type = type;
		this.single = single;
		this.numOfSong = numOfSong;
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

	public String getSingle() {
		return single;
	}

	public void setSingle(String single) {
		this.single = single;
	}

	public int getNumOfSong() {
		return numOfSong;
	}

	public void setNumOfSong(int numOfSong) {
		this.numOfSong = numOfSong;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CD [id=" + id + ", type=" + type + ", single=" + single + ", numOfSong=" + numOfSong + ", price="
				+ price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CD)) {
			return false;
		}
		CD that = (CD) obj;
		return getId() == that.getId();
	}

}
