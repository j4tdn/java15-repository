package exam;

public class Staff extends People {

	private String workunit;

	public Staff() {
		super();
	}

	public Staff(String fullname, String birthday, int coefficient, String workunit) {
		super(fullname, birthday, coefficient);
		this.workunit = workunit;
	}

	public String getWorkunit() {
		return workunit;
	}

	public void setWorkunit(String workunit) {
		this.workunit = workunit;
	}



	

	@Override
	public long salary() {
		return (coefficient) * 1250000;
	}

	@Override
	public void showinfo() {
		System.out.println("Staff	:"+"Full name :"+ fullname + "	Birthday :"+ birthday +
				"	Coefficient :" +coefficient + "	Workunit : "+ workunit);
	}

}