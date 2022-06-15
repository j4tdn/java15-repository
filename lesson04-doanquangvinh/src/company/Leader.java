package company;

public class Leader extends Human {
    private int numberOfStaffs;

	public Leader(String name, int birthDate, float wageRatio, int numberOfStaffs) {
		super(name, birthDate, wageRatio);
		this.numberOfStaffs = numberOfStaffs;
	}

	public int getNumberOfStaffs() {
		return numberOfStaffs;
	}

	public void setNumberOfStaffs(int numberOfStaffs) {
		this.numberOfStaffs = numberOfStaffs;
	}

	@Override
	public String toString() {
		return "Leader [toString()=" + super.toString() + "]";
	}
    
    
    
}
