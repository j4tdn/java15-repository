package persistence;

public class Employee {
	public static String PROP_ID = "id";
	public static String PROP_NAME = "name";
	public static String PROP_EMAIL = "email";
	public static String PROP_PHONE = "phone";
	public static String PROP_ADDRESS = "address";
	public static String PROP_PASSWORD = "password";
	public Employee(Integer id, String name, String email, String phone, String address, Title tittle) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.tittle = tittle;
	}

	public static String PROP_TITLE_ID = "title";
	private Integer id;
	private String name;
	private String email;
	private String phone;
	private String address;
	private String password;
	private Title tittle;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String name, String email, String phone, String address, String password,
			Title tittle) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.password = password;
		this.tittle = tittle;
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

	public Title getTittle() {
		return tittle;
	}

	public void setTittle(Title tittle) {
		this.tittle = tittle;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address="
				+ address + ", password=" + password + ", tittle=" + tittle + "]";
	}
	
}
