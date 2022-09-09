package bean;

public class CDinfo {
	private int idCD;
	private String typeCD;
	private String singer;
	private int numberofsongs;
	private double price;
	
	public CDinfo() {
	}

	public CDinfo(int idCD, String typeCD, String singer, int numberofsongs, double price) {
		this.idCD = idCD;
		this.typeCD = typeCD;
		this.singer = singer;
		this.numberofsongs = numberofsongs;
		this.price = price;
	}

	public int getIdCD() {
		return idCD;
	}

	public void setIdCD(int idCD) {
		this.idCD = idCD;
	}

	public String getTypeCD() {
		return typeCD;
	}

	public void setTypeCD(String typeCD) {
		this.typeCD = typeCD;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CDinfo [idCD=" + idCD + ", typeCD=" + typeCD + ", singer=" + singer + ", numberofsongs=" + numberofsongs
				+ ", price=" + price + "]";
	}
	
	
}
