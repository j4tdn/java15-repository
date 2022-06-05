package ex05;

public class Customer {
	private String idCustomer;
	private String name;
	private String phone;
	private String address;
	
	public Customer() {
	}

	public Customer(String id_Customer, String name, String phone, String address) {
		super();
		this.idCustomer = id_Customer;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getId_Customer() {
		return idCustomer;
	}

	public void setId_Customer(String id_Customer) {
		this.idCustomer = id_Customer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Book [id_Customer=" + idCustomer + ", name=" + name + ", phone=" + phone + ", address=" + address
				+ "]";
	}
	
	
}
