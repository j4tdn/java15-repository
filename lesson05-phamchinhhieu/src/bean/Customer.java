package bean;

public class Customer {
	String idcus, name, phone, address;
	ReferenceBooks refcus;
	TextBook textcus;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String idcus, String name, String phone, String address, ReferenceBooks refcus, TextBook texcus) {
		super();
		this.idcus = idcus;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.refcus = refcus;
		this.textcus = texcus;
	}

	public String getIdcus() {
		return idcus;
	}

	public void setIdcus(String idcus) {
		this.idcus = idcus;
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

	public ReferenceBooks getRefcus() {
		return refcus;
	}

	public void setRefcus(ReferenceBooks refcus) {
		this.refcus = refcus;
	}

	public TextBook getTexcus() {
		return textcus;
	}

	public void setTexcus(TextBook texcus) {
		this.textcus = texcus;
	}
	
	
	
}
