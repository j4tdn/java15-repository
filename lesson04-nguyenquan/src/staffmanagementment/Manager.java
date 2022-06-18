package staffmanagementment;

import java.time.LocalDate;

public class Manager extends Person {
	private int staffMembers;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, LocalDate dateOfBirth, float coefficientsSalary, int staffMembers) {
		super(name, dateOfBirth, coefficientsSalary);
		this.staffMembers = staffMembers;
	}

	public int getStaffMembers() {
		return staffMembers;
	}

	public void setStaffMembers(int staffMembers) {
		this.staffMembers = staffMembers;
	}

	@Override
	public String toString() {
		return "Manager [staffMembers=" + staffMembers + ", toString()=" + super.toString() + "]";
	}
	@Override
	public float calculationOfWages() {
		return getCoefficientsSalary() * 2200000;
	}

}
