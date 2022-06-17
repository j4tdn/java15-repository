package view;

public class Ex01Students {
	private int id;
	private String name;
	private float PointLT;
	private float PointTH;

	public Ex01Students() {
	}

	public Ex01Students(int id, String name, float pointLT, float pointTH) {
		super();
		this.id = id;
		this.name = name;
		PointLT = pointLT;
		PointTH = pointTH;
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

	public float getPointLT() {
		return PointLT;
	}

	public void setPointLT(float pointLT) {
		PointLT = pointLT;
	}

	public float getPointTH() {
		return PointTH;
	}

	public void setPointTH(float pointTH) {
		PointTH = pointTH;
	}

	@Override
	public String toString() {
		return "Ex01Students [id = " + id + ", name = " + name + ", PointLT = " + PointLT + ", PointTH = " + PointTH + "]";
	}
	public float averagePoint() {
		return (PointLT + PointTH) / 2;
	}

	
}
