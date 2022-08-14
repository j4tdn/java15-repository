package bean;

import common.Rank;

public class Student {
	private int id;
	private String name;
	private Rank rank;
	public Student() {
		
	}
	public Student(int id, String name, Rank rank) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
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
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Student)) {
			return false;
		}
		Student that = (Student)obj;
		return getId() == that.getId();
	
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rank=" + rank + "]";
	}
	
}
