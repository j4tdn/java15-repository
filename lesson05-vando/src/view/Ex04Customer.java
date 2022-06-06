package view;

public class Ex04Customer {
	private String Id, fullname, phonenumber, address;

	public Ex04Customer() {
	
	}

	public Ex04Customer(String id, String fullname, String phonenumber, String address) {
		Id = id;
		this.fullname = fullname;
		this.phonenumber = phonenumber;
		this.address = address;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Ex04Customer [Id=" + Id + ", fullname=" + fullname + ", phonenumber=" + phonenumber + ", address="
				+ address + "]";
	}
	
	
}
