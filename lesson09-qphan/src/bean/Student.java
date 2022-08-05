package bean;

import common.Rank;

public class Student {
	private int id;
	private String name;
	private Rank rank;
	
	public Student() {
	}

	public Student(int id, String name, Rank rank) {
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
	
	// studentX.equals(studentY)
	// equals --> id
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Student)) {
			return false;
		}
		
		Student that = (Student)o;
		
		return getId() == that.getId();
	}

	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + "]";
	}
}
