package bean;

public class CDDetail {
	private int idCD;
	private String typesOfCd;
	private String singerName;
	private int numberOfSongs;
	private float price;
	
	public CDDetail() {
		
	}

	public CDDetail(int idCD, String typesOfCd, String singerName, int numberOfSongs, float price) {
		super();
		this.idCD = idCD;
		this.typesOfCd = typesOfCd;
		this.singerName = singerName;
		this.numberOfSongs = numberOfSongs;
		this.price = price;
	}

	public int getIdCD() {
		return idCD;
	}

	public void setIdCD(int idCD) {
		this.idCD = idCD;
	}

	public String getTypesOfCd() {
		return typesOfCd;
	}

	public void setTypesOfCd(String typesOfCd) {
		this.typesOfCd = typesOfCd;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public int getNumberOfSongs() {
		return numberOfSongs;
	}

	public void setNumberOfSongs(int numberOfSongs) {
		this.numberOfSongs = numberOfSongs;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CDDetail [idCD=" + idCD + ", typesOfCd=" + typesOfCd + ", singerName=" + singerName + ", numberOfSongs="
				+ numberOfSongs + ", price=" + price + "]";
	}
	
}
