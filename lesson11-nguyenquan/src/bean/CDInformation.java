package bean;


public class CDInformation {
	private int id;
	private String type;
	private String singer;
	private int numberofsongs;
	private float price;

	public CDInformation() {
		
	}

	public CDInformation(int id, String type, String singer, int numberofsongs, float price) {
		
		this.id = id;
		this.type = type;
		this.singer = singer;
		this.numberofsongs = numberofsongs;
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

	public int getNumberofsongs() {
		return numberofsongs;
	}

	public void setNumberofsongs(int numberofsongs) {
		this.numberofsongs = numberofsongs;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", type=" + type + ", singer=" + singer + ", numberofsongs="
				+ numberofsongs + ", price=" + price + "]\n";
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof CDInformation)) {
			return false;
		}
		CDInformation that = (CDInformation)obj;
		return getId() == that.getId();
	}
	

}
