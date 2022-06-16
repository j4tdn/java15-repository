package ex01;

public class Students {
	private int studentcode;
	private String name;
	private float scoreLT;
	private float scoreTH;
	
	public Students() {

	}

	public Students(int studentcode, String name, float scoreLT, float scoreTH) {
		super();
		this.studentcode = studentcode;
		this.name = name;
		this.scoreLT = scoreLT;
		this.scoreTH = scoreTH;
	}

	public int getStudentcode() {
		return studentcode;
	}

	public void setStudentcode(int studentcode) {
		this.studentcode = studentcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getScoreLT() {
		return scoreLT;
	}

	public void setScoreLT(float scoreLT) {
		this.scoreLT = scoreLT;
	}

	public float getScoreTH() {
		return scoreTH;
	}

	public void setScoreTH(float scoreTH) {
		this.scoreTH = scoreTH;
	}

	@Override
	public String toString() {
		return "studentcode=" + studentcode + ", name=" + name + ", scoreLT=" + scoreLT + ", scoreTH="
				+ scoreTH ;
	}
	
	public float scoreTB() {
		return (scoreLT+scoreTH)/2;
	}
	
}
