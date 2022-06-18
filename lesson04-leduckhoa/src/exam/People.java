package exam;



public abstract class People {
	

	String fullname;
	 String birthday;
	 int coefficient;
	 
	 public People() {
	}

	public People(String fullname, String birthday, int coefficient) {
		super();
		this.fullname = fullname;
		this.birthday = birthday;
		this.coefficient = coefficient;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}
	 
	public abstract long salary();

	public abstract void showinfo();
	
	 
}