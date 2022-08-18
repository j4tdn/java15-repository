package bean;

import common.Rank;

public class Student {
	private int studentId;
	private String name;
	private Rank rank;
	
	public Student() {
	}

	public Student(int studentId, String name, Rank rank) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.rank = rank;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		
		if(!(o instanceof Student)) {
			return false;
		}
		
		Student that = (Student) o;
		
		return getStudentId() == that.getStudentId();
	}

	@Override
	public String toString() {
		return "\nStudent [studentId=" + studentId + ", name=" + name + ", rank=" + rank + "]";
	}
	
}