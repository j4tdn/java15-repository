package bean;

import java.time.LocalDate;

import common.Gender;
import common.Rank;

public class Student {
	private int id;
	private String name;
	private Gender gender;
	private LocalDate birthDate;
	private String className;
	private double point;
	
	
	public Student() {
	}

	public Student(int id, String name, Gender gender, LocalDate birthDate, String className, double point) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.birthDate = birthDate;
		this.className = className;
		this.point = point;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}
	public Rank setRank() {
		if(this.getPoint() >= 8.0) {
			return Rank.A;
		}else if(this.getPoint() >= 7.0 && this.getPoint() < 8.0) {
			return Rank.B;
		}else if(this.getPoint() >= 5.0 && this.getPoint() < 7.0) {
			return Rank.C;
		}
		return Rank.D;
	}
	private long getStudentship() {
		if(this.setRank().equals(Rank.A)) {
			return 250000;
		}else if(this.setRank().equals(Rank.B)) {
			return 200000;
		}
		return 0;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", birthDate=" + birthDate
				+ ", className=" + className + ", point=" + point + ", rank=" +
				this.setRank() + ", studentship=" + this.getStudentship()
				+ "]";
	}
	
	
	
}
