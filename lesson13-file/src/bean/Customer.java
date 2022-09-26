package bean;

import java.io.Serializable;

import common.FileTransfer;

public class Customer implements FileTransfer, Serializable {
	private static final long serialVersionUID = 8850948998201363543L;

	private int id;
	private String name;
	private int age;
	// not save to serialize data
	private transient String address;

	public Customer() {
	}

	public Customer(String line) {
		String[] elements = line.split(", ");
		if (elements.length != 4) {
			System.out.println(line + "... has ... wrong format !!!");
		} else {
			this.id = Integer.parseInt(elements[0]);
			this.name = elements[1];
			this.age = Integer.parseInt(elements[2]);
			this.address = elements[3];
		}

	}

	public Customer(int id, String name, int age, String address) {
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

	public static Customer transfer(String line) {
		String[] elements = line.split(", ");
		if (elements.length != 4) {
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
	public String toLine() {
		return getId() + ", " + getName() + ", " + getAge() + ", " + getAddress();
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
