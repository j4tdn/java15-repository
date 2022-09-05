package bean;

public class Warehouse {
	private String whId;
	private String address;
	
	public Warehouse() {
	}

	public Warehouse(String whId, String address) {
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
	public String toString() {
		return "Warehouse [whId=" + whId + ", address=" + address + "]";
	}

	
}
