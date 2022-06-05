package Ex05;

public class Customer {
	
	//Khách hàng: Mã khách hàng, họ tên, số điện thoại, địa chỉ
	private int id;
	private String name;
	private int phone;
	private String address;
	
	public Customer() {
		
	}

	public Customer(int id, String name, int phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}