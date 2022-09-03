package bean;

public class CD {
	private int cdCode;
	private String cdName;
	private String singer;
	private int numberOfSong;
	private double price;
	public int getCdCode() {
		return cdCode;
	}
	public void setCdCode(int cdCode) {
		this.cdCode = cdCode;
	}
	public String getCdName() {
		return cdName;
	}
	public void setCdName(String cdName) {
		this.cdName = cdName;
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
	public CD(int cdCode, String cdName, String singer, int numberOfSong, double price) {
		super();
		this.cdCode = cdCode;
		this.cdName = cdName;
		this.singer = singer;
		this.numberOfSong = numberOfSong;
		this.price = price;
	}
	@Override
	public String toString() {
		return "\n CD [cdCode=" + cdCode + ", cdName=" + cdName + ", singer=" + singer + ", numberOfSong=" + numberOfSong
				+ ", price=" + price + "]";
	}
	
}
