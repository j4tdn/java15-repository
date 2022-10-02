package bean;

import java.io.Serializable;

import common.FileTransfer;

public class Customer implements FileTransfer , Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7388520360677462544L;
	private int id;
	private String name;
	private int age;
	private String address;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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
    public String toLine() {
    	return  getId() + ", " + getName()+", " +getAge()+", " + getAddress();
    }
    
    public static Customer toObject(String line) {
    	String[] elements = line.split(", ");
    	if (elements.length !=4) {
			System.out.println(line + "... has ... wrong format !!!");
			return null;
		}
    	return new Customer(
    			Integer.parseInt(elements[0]), 
    			elements[1], 
    			Integer.parseInt(elements[2]),
    			elements[3]);
    }
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
