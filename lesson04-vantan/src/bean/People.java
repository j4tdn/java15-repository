package bean;

import java.time.LocalDate;

public abstract class People {
	private String name;
	private LocalDate birthday;
	private int coefficoen;
	
	public People() {
	}

	public People(String name, LocalDate birthday, int coefficoen) {
		this.name = name;
		this.birthday = birthday;
		this.coefficoen = coefficoen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public int getCoefficoen() {
		return coefficoen;
	}

	public void setCoefficoen(int coefficoen) {
		this.coefficoen = coefficoen;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", birthday=" + birthday + ", coefficoen=" + coefficoen + "]";
	}
	public abstract float salary();
		 
	
}
