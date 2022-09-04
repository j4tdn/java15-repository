package bean;

import java.util.Objects;

public class Warehouse {
	private String whId;
	private String address;
	public Warehouse() {
		// TODO Auto-generated constructor stub
	}
	public Warehouse(String whId, String address) {
		this.whId = whId;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Warehouse [whId=" + whId + ", address=" + address + "]";
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
		if(this == o) {
			return true;
		}
		if(!(o instanceof Warehouse)) {
			return false;
		}
		Warehouse that = (Warehouse)o;
		return getWhId().equals(that.getWhId());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getWhId(), getAddress());
	}
	
}
