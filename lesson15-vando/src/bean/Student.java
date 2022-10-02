package bean;

import java.io.Serializable;

public class Student implements Serializable{
	private int id;
	private String name;
	private double point;
	private Sex sex;

	
	public Student() {
	}


	public Student(int id, String name, double point, Sex sex) {
		super();
		this.id = id;
		this.name = name;
		this.point = point;
		this.sex = sex;
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


	public double getPoint() {
		return point;
	}


	public void setPoint(double point) {
		this.point = point;
	}


	public Sex getSex() {
		return sex;
	}


	public void setSex(Sex sex) {
		this.sex = sex;
	}
	
	public String toLine() {
		return getId() + ", " + getName() + ", " + getPoint() + ", " + getSex();
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", point=" + point + ", sex=" + sex + "]";
	}
	
}
