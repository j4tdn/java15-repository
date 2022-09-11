package bean;

import java.time.LocalDate;

public class Students {
	private String name;
	private LocalDate birthDay;
	private String id;
	private double average;
	
	public Students() {
	}

	public Students(String name, LocalDate birthDay, String id, double average) {
		this.name = name;
		this.birthDay = birthDay;
		this.id = id;
		this.average = average;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", birthDay=" + birthDay + ", id=" + id + ", average=" + average + "]";
	}
	
	
	
	
}
