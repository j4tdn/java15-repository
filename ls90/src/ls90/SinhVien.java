package ls90;

public class SinhVien implements Comparable<SinhVien>{
	private int studentCode;
	private String name;
	private String classs;
	private double average;
	public SinhVien(int studentCode, String name, String classs, double average) {

		this.studentCode = studentCode;
		this.name = name;
		this.classs = classs;
		this.average = average;
	}
	public int getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClasss() {
		return classs;
	}
	public void setClasss(String classs) {
		this.classs = classs;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public String getTen() {
		String s = this.name.trim();
		int vt = s.lastIndexOf(" ");
		
		return s.substring(vt+1);
	}
	@Override
	public int compareTo(SinhVien o) {
		String thisName = this.getTen();
		String oName = o.getTen();
		
		return thisName.compareTo(oName);
	}
	

	

}
