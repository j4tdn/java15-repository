package bean;

public class Manager extends People {
	private int numofemp;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, String date, float cosalary, int numofemp) {
		super(name, date, cosalary);
		this.numofemp = numofemp;
	}

	public int getNumofemp() {
		return numofemp;
	}

	public void setNumofemp(int numofemp) {
		this.numofemp = numofemp;
	}	
	@Override
	public float payRoll() {
		return this.getCosalary() *2200000;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "numofemp = " + numofemp;
	}
	
		
	
}
