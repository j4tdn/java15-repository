package Ex04;

public class Staff extends Manual{

	private String deparment;
	
	public Staff() {
		
	}

	public Staff(String name, String birthday, float income, String department) {
		super(name, birthday, income);
		this.deparment = department;
	}

	public String getDeparment() {
		return deparment;
	}

	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}

	@Override
	public String toString() {
		return "Staff [deparment=" + deparment + ", toString()=" + super.toString() + "]";
	}
	
	public void DisplayStaff() {
		DisplayManual();
		System.out.printf("%-10s" , deparment);
		System.out.println("\n");
	}
	
	public float Stafftotal() {
		float total = 125000 * income;
		return total;
	}
}
