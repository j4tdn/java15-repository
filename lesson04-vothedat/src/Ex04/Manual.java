package Ex04;

public class Manual {
	private String name;
	private String birthday;
	public float income;

	public Manual() {
	}

	public Manual(String name, String birthday, float income) {
		this.name = name;
		this.birthday = birthday;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public float getIncome() {
		return income;
	}

	public void setIncome(float income) {
		this.income = income;
	}

	@Override
	public String toString() {
		return "Manual{" + "Ho ten" + name + ", Ngay sinh'" + birthday + " " +", Thu nhap'" + income + '}';
	}
    
	public void DisplayManual() {
		System.out.printf("%-22s %-10s %-10f ", name, birthday, income);
	}
	
}
