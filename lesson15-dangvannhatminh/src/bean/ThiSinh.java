package bean;

public class ThiSinh {
	private int id;
	private int point;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public ThiSinh(int id) {
		this.id = id;
		this.point = 0;
	}
	@Override
	public String toString() {
		return "ThiSinh [id=" + id + ", point=" + point + "]";
	}
	
}
