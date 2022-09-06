package bean;

import java.util.Objects;

public class Warehouse {
 private String WhId;
 private String address;
 public Warehouse() {
	// TODO Auto-generated constructor stub
}
public Warehouse(String whId, String address) {
	
	WhId = whId;
	this.address = address;
}
public String getWhId() {
	return WhId;
}
public void setWhId(String whId) {
	WhId = whId;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Warehouse)) {
			return false;
		}
		Warehouse that = (Warehouse)obj;
		return getAddress().equals(that.getAddress())&& getWhId().equals(that.getWhId());
	}
@Override
	public int hashCode() {
		return Objects.hash(getWhId(),getAddress());
	}
@Override
public String toString() {
	return "Warehouse [WhId=" + WhId + ", address=" + address + "]";
}

}
