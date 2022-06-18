package exam;



public class Manager extends People {
	
	private int amountstaff;


	public Manager() {
		super();
	}


	public Manager(String fullname, String birthday, int coefficient, int amountstaff) {
		super(fullname, birthday, coefficient);
		this.amountstaff = amountstaff;
	}



	@Override
	public long salary() {
		return (coefficient ) * 2200000;
	}


	@Override
	public void showinfo() {
		System.out.println("Manager   :"+"Full name :"+ fullname + "	Birthday :"+ birthday +
				"	Coefficient :" +coefficient + "   Amountstaff : "+ amountstaff);		
	}
	
	
	
}