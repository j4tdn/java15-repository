package bean;

import java.util.Objects;

public class WareHouse {
	private String whId;
	private String address;
	
	public WareHouse() {
		
	}

	public WareHouse(String whId, String address) {
		this.whId = whId;
		this.address = address;
	}

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
	
	@Override
	public boolean equals(Object o) {
		//Mặc định: so sánh địa chỉ của đối tượng
		if(this == o) return true;
		if(!(o instanceof WareHouse)) {
			return false;
		}
		WareHouse that = (WareHouse)o;
		return getWhId().equals(that.getWhId()) && getAddress().equals(that.getAddress());
	}
	
	//2 đối tượng là equals nếu trùng id và address
	//==> trùng hashcode
	
	@Override
	public int hashCode() {
		//Mặc định : Đại chỉ của đối tượng
		return Objects.hash(getWhId(), getAddress());
	}
	
	
}
