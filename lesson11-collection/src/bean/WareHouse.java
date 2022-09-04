package bean;

import java.util.Objects;

public class WareHouse {
	private String whId;
	private String address;

	public WareHouse() {
		// TODO Auto-generated constructor stub
	}

	public WareHouse(String whId, String address) {
		super();
		this.whId = whId;
		this.address = address;
	}

	public String getWhId() {
		return whId;
	}

	public void setWhId(String whId) {
		this.whId = whId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public boolean equals(Object obj) {
		// Mac dinh : so sanh dia chi cua doi tuong
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof WareHouse)) {
			return false;
		}
		WareHouse that = (WareHouse) obj;
		return this.getWhId().equals(that.getWhId()) && getAddress().equals(that.getAddress());
	}
	@Override
	public int hashCode() {
		// Mac dinh : Dia chi cua doi tuong
		return Objects.hash(getWhId(),getAddress());
	}

	@Override
	public String toString() {
		return "WareHouse [whId=" + whId + ", address=" + address + "]";
	}

}
