package Ex04;

public class Chief extends Manual{

	private int numstaff;
	
	public Chief() {
		
	}

	public Chief(String name, String birthday, float income, int numstaff) {
		super(name, birthday, income);
		this.numstaff = numstaff;
	}

	public int getNumstaff() {
		return numstaff;
	}

	public void setNumstaff(int numstaff) {
		this.numstaff = numstaff;
	}

	@Override
	public String toString() {
		return "Chief [numstaff=" + numstaff + ", toString()=" + super.toString() + "]";
	}
    
	public void DisplayChief() {
		DisplayManual();
		System.out.printf("%-10d" , numstaff);
		System.out.println("\n");
	}
	
	public void Chieftotal() {
		System.out.printf("%f\n",  income * 220000);
	}
}
