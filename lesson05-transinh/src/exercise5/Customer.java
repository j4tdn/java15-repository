package exercise5;

public class Customer {
	private String id;
	private String name;
	private String numberphone;
	private String address;
	
	public Customer() {
		
	}
	
	public Customer(String id, String name, String numberphone, String address) {
		this.id = id;
		this.name = name;
		this.numberphone = numberphone;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumberphone() {
		return numberphone;
	}

	public void setNumberphone(String numberphone) {
		this.numberphone = numberphone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", numberphone=" + numberphone + ", address=" + address + "]";
	}
	
	
	
}