package been;

import java.util.Objects;

public class Warehouse {
	private String whId;
	private String address;

	public Warehouse() {
	}

	public Warehouse(String whId, String address) {
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
		// Mặc định: So sánh địa chỉ của đối tượng
		if (this == o) {
			return true;
		}
		if (!(o instanceof Warehouse)) {
			return false;
		}
		Warehouse that = (Warehouse) o;
		return getWhId().equals(that.getWhId());

	}

	// 2 đối tượng là equals nếu trùng id và address
	// ==> trùng hashcode

	@Override
	public int hashCode() {
		// Mặc định: Địa chỉ của đối tượng
		return Objects.hash(getWhId());
	}

	@Override
	public String toString() {
		return "Warehouse [whId=" + whId + ", address=" + address + "]";
	}
}