package bean;

import java.util.Objects;

public class WareHouse {
	@Override
	public String toString() {
		return "WareHouse [whId=" + whId + ", address=" + address + "]";
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

	private String whId;
	private String address;
	
	public WareHouse() {
		
	}

	public WareHouse(String whId, String address) {
		super();
		this.whId = whId;
		this.address = address;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof WareHouse)) {
			return false;
		}
		WareHouse that = (WareHouse)obj;
		return getWhId().equals(that.getWhId()) && getAddress().equals(that.getAddress());
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(getWhId(), getAddress());
	}
}
