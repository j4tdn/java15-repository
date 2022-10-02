package bean;

public class Student {
	private int id;
	private String name;
	private double dtb;
	private String gioitinh;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, float dtb, String gioitinh) {
		super();
		this.id = id;
		this.name = name;
		this.dtb = dtb;
		this.gioitinh = gioitinh;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDtb() {
		return dtb;
	}

	public void setDtb(float dtb) {
		this.dtb = dtb;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dtb=" + dtb + ", gioitinh=" + gioitinh + "]";
	}
		
}
