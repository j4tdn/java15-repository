package persistence;

public class Employee {
	
	public static String PROP_ID = "id";
	public static String PROP_NAME = "name";
	public static String PROP_EMAIL = "email";
	public static String PROP_PHONE = "phone";
	public static String PROP_ADDRESS = "address";
	public static String PROP_PASSWORD = "password";
	public static String PROP_TITLE_ID = "tId";
	
	private Integer id;
	private String name;
	private String email;
	private String phone;
	private String address;
	private String password;
	private Title title; // mapping N-1
	
	public Employee() {
	}
	
	public Employee(Integer id, String name, String email, String phone, String address, Title title) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.title = title;
	}

	public Employee(Integer id, String name, String email, String phone, String address, String password, Title title) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.password = password;
		this.title = title;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address="
				+ address + ", password=" + password + ", title=" + title + "]";
	}
}
