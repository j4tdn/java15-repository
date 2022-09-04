package been;

public class CD {
	private int id;
	private String name;
	private String singer;
	private int numberOfSong;
	private double price;
	
	public CD() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getNumberOfSong() {
		return numberOfSong;
	}

	public void setNumberOfSong(int numberOfSong) {
		this.numberOfSong = numberOfSong;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public CD(int id, String name, String singer, int numberOfSong, double price) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.numberOfSong = numberOfSong;
		this.price = price;
	}

	@Override
	public String toString() {
		return "CD [id=" + id + ", name=" + name + ", singer=" + singer + ", numberOfSong=" + numberOfSong + ", price="
				+ price + "]";
	}
	
}
