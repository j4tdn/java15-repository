package bean;

public class Employee {
	private String name;
	private int age;
	private String address;
	
	
	public Employee() {
	}


	public Employee(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "\nEmployee [name=" + name + ", age=" + age + ", address=" + address + "]";
	}


//	@Override
//	public int compareTo(Employee o) {
//		return this.getAge() - o.getAge();
//	}
	
	
	
}
