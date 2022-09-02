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
		// Mặc định: so sánh địa chỉ của đối tượng
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof WareHouse)) {
			return false;
		}
		WareHouse that = (WareHouse) obj;
		return getWhId().equals(that.getWhId()) && getAddress().equals(that.getAddress());
		// 2 đối tượng equals khi trùng id và address
		// => Trùng hashCode();
	}

	@Override
	public String toString() {
		return "WareHouse [whId=" + whId + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(getWhId(), getAddress());
	}

}
