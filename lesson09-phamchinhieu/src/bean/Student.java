package bean;

import common.Rank;

public class Student {
	int id;
	String name;
	Rank rank;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, Rank rank) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + "]";
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
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
}
