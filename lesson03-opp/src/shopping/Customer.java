package shopping;

import java.util.Objects;

public class Customer {
        private String id;
        private String name;
        private String phone;
        private String address;
     /// ctrl+ space = public Customer()
        // constructor...
        // getter, setter..
        
        public Customer() {
		}
     /// Source + Generate Constructor using fields
	public Customer(String id, String name, String phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	/// Source + Generate getters and setters to create:
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
	/// Source + Generate toString()
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
	
}

