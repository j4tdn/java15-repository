package bean;

public class CDDetail {
	private int id;
	private String typesOfCd;
	private String singerName;
	private int musicNumbers;
	private float price;

	public CDDetail() {
		// TODO Auto-generated constructor stub
	}

	public CDDetail(int id, String typesOfCd, String singerName, int musicNumbers, float price) {
		super();
		this.id = id;
		this.typesOfCd = typesOfCd;
		this.singerName = singerName;
		this.musicNumbers = musicNumbers;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getMusicNumbers() {
		return musicNumbers;
	}

	public void setMusicNumbers(int musicNumbers) {
		this.musicNumbers = musicNumbers;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
    @Override
    public boolean equals(Object obj) {
    	if (obj == null) {
			return false;
		}
    	if (!(obj instanceof CDDetail)) {
			return false;
		}
    	CDDetail that = (CDDetail) obj;
    	return this.getId() == that.getId();
    }
	@Override
	public String toString() {
		return "CDDetail [id=" + id + ", typesOfCd=" + typesOfCd + ", singerName=" + singerName + ", musicNumbers="
				+ musicNumbers + ", price=" + price + "]";
	}
    
}
