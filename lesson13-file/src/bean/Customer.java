package bean;

import java.io.Serializable;

import common.FileTransfer;

public class Customer implements FileTransfer, Serializable {
	private static final long serialVersionUID = 3671952858993036665L;
	public Customer() {
		
	}
	
	private int id;
	private String name;
	private int age;
	private String address;
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
		return getId() + ","
			+  getName() + ","
			+  getAge() + ","
			+  getAddress() + ",";
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
}
