package exercises_testlesson05_05;

public class customer {
	protected int id;
	protected String name;
	protected int phonenumber;
	protected String address;
	
	public customer(int id, String name, int phonenumber, String address) {
		
		this.id = id;
		this.name = name;
		this.phonenumber = phonenumber;
		this.address = address;
	}

	@Override
	public String toString() {
		return "customer [id=" + id + ", name=" + name + ", phonenumber=" + phonenumber + ", address=" + address + "]";
	}
	
	
	
}
