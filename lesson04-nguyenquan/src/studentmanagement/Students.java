package studentmanagement;

public class Students {
	private int MSSV;
	private String  name;
	private float pointLT;
	private float pointTH;

	public Students() {

	}

	
	
	public Students(int mSSV, String name, float pointLT, float pointTH) {
		super();
		MSSV = mSSV;
		this.name = name;
		this.pointLT = pointLT;
		this.pointTH = pointTH;
	}
	
	
// getter and setter
	public int getMSSV() {
		return MSSV;
	}

	public void setMSSV(int mSSV) {
		MSSV = mSSV;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPointLT() {
		return pointLT;
	}

	public void setPointLT(float pointLT) {
		this.pointLT = pointLT;
	}

	public float getPointTH() {
		return pointTH;
	}

	public void setPointTH(float pointTH) {
		this.pointTH = pointTH;
	}
	
	public float pointCenter() {
		float result ;
		result = (this.pointLT +this.pointTH) / 2;
		return result;
	}
//ToString
	@Override
	public String toString() {
		return "Students [MSSV=" + MSSV + ", name=" + name + ", pointLT=" + pointLT + ", pointTH=" + pointTH + ",pointCenter=" + pointCenter() + "]";
	}


}
