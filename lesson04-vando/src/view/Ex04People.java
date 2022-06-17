package view;

public class Ex04People {
	private String name;
	private int birthDate;
	private float wageRatio;
	
	public Ex04People() {

	}

	public Ex04People(String name, int birthDate, float wageRatio) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.wageRatio = wageRatio;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}

	public float getWageRatio() {
		return wageRatio;
	}

	public void setWageRatio(float wageRatio) {
		this.wageRatio = wageRatio;
	}

	@Override
	public String toString() {
		return "Ex04People [name=" + name + ", birthDate=" + birthDate + ", wageRatio=" + wageRatio + "]";
	}
	
}
