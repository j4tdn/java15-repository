package bean;

import java.util.Scanner;

import common.ICat;

public class Cat implements ICat{
	private String name;
	private int id;
	private String color;
	
	

	public Cat() {
	}
	
	public Cat(String name, int id, String color) {
		this.name = name;
		this.id = id;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", id=" + id + ", color=" + color + "]";
	}

	@Override
	public void input() {
		Scanner ip = new  Scanner(System.in);
		System.out.println("Enter Name");
		this.name = ip.nextLine();
		System.out.println("Enter id");
		this.id = Integer.parseInt(ip.nextLine());
		System.out.println("Enter color");
		this.color = ip.nextLine();
		
	}

	@Override
	public void show() {
		System.out.println(toString());
	}
	
	
}
