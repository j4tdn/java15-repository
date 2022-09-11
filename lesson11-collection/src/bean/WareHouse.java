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
	public boolean equals(Object o) {
		// Mặc định so sánh địa chỉ đối tượng
		if (this == o) {
			return true;
		}
		if (!(o instanceof WareHouse)) {
			return false;
		}
		WareHouse that = (WareHouse) o;
		return getWhId().equals(that.getWhId()) && getAddress().equals(that.getAddress());

	}

	@Override
	public int hashCode() {
		return Objects.hash(getWhId(), getAddress());
	}

	@Override
	public String toString() {
		return "WareHouse [whId=" + whId + ", address=" + address + "]";
	}

}
