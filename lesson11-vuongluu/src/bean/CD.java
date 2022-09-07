package bean;

import java.util.Objects;

public class CD {
	String CDId;
	String typeId;
	String singleName;
	int totalOfsongs;
	float price;
	public CD() {
		// TODO Auto-generated constructor stub
	}
	
	
	public CD(String cDId, String typeId, String singleName, int totalOfsongs, float price) {
		this.CDId = cDId;
		this.typeId = typeId;
		this.singleName = singleName;
		this.totalOfsongs = totalOfsongs;
		this.price = price;
	}


	public String getCDId() {
		return CDId;
	}

	public void setCDId(String cDId) {
		CDId = cDId;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getSingleName() {
		return singleName;
	}

	public void setSingleName(String singleName) {
		this.singleName = singleName;
	}

	public int getTotalOfsongs() {
		return totalOfsongs;
	}

	public void setTotalOfsongs(int totalOfsongs) {
		this.totalOfsongs = totalOfsongs;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getCDId());
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(!(o instanceof CD)) {
			return false;
		}
		
		CD that = (CD) o;
		return CDId.equals(that.getCDId());
	}
	
	@Override
	public String toString() {
		return "CD [CDId=" + CDId + ", typeId=" + typeId + ", singleName=" + singleName + ", totalOfsongs="
				+ totalOfsongs + ", price=" + price + "]";
	}
	
}
