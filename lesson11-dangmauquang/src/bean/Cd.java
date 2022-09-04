package bean;

public class Cd {
	private int cdId;
	private String cdType;
	private String singer;
	private int numberOfSong;
	private double price;
	
	public Cd() {
	}

	public Cd(int cdId, String cdType, String singer, int numberOfSong, double price) {
		super();
		this.cdId = cdId;
		this.cdType = cdType;
		this.singer = singer;
		this.numberOfSong = numberOfSong;
		this.price = price;
	}

	public int getCdId() {
		return cdId;
	}

	public void setCdId(int cdId) {
		this.cdId = cdId;
	}

	public String getCdType() {
		return cdType;
	}

	public void setCdType(String cdType) {
		this.cdType = cdType;
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

	public void setNumberOfSong(char numberOfSong) {
		this.numberOfSong = numberOfSong;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "\nCD [cdId=" + cdId + ", cdType=" + cdType + ", singer=" + singer + ", numberOfSong=" + numberOfSong
				+ ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		
		if(!(o instanceof Cd)) {
			return false;
		}
		
		Cd that = (Cd) o;
		return getCdId() == that.getCdId();
	}
}
