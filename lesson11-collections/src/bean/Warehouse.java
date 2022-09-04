package bean;

import java.util.Objects;

public class Warehouse {
	private String whID;
	private String address;

	public Warehouse() {
	}

	public String getWhID() {
		return whID;
	}

	public void setWhID(String whID) {
		this.whID = whID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Warehouse(String whID, String address) {
		this.whID = whID;
		this.address = address;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Warehouse)) {
			return false;
		}
		Warehouse that = (Warehouse) obj;
		return getWhID().equals(that.getWhID()) && getAddress().equals(that.getAddress());
	}
// 2 đối tượng equals nếu trùng id và address
	// trùng hashcode 
	@Override
	public int hashCode() {
		// mặc định là địa chỉ của đối tượng aa
		return Objects.hash(getWhID(), getAddress());
	}

	@Override
	public String toString() {
		return "Warehouse [whID=" + whID + ", address=" + address + "]";
	}

}
