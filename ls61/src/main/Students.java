package main;

import java.util.Objects;

public class Students implements Comparable<Students>{
	private String studentNumber;
	private String name;
	private int yearOfBirth;
	private double pointAverage;
	

	public Students(String studentNumber) {
	
		this.studentNumber = studentNumber;
	}

	public Students(String studentNumber, String name, int yearOfBirth, double pointAverage) {

		this.studentNumber = studentNumber;
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.pointAverage = pointAverage;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		studentNumber = studentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public double getPointAverage() {
		return pointAverage;
	}

	public void setPointAverage(double pointAverage) {
		this.pointAverage = pointAverage;
	}

	@Override
	public String toString() {
		return "Students [studentNumber=" + studentNumber + ", name=" + name + ", yearOfBirth=" + yearOfBirth
				+ ", pointAverage=" + pointAverage + "]";
	}

	@Override
	public int compareTo(Students o) {
		
		return this.studentNumber.compareTo(o.studentNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, pointAverage, studentNumber, yearOfBirth);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return  Objects.equals(studentNumber, other.studentNumber);
	}
	

}
