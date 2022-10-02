package Ex04;

public class Candidates {
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
	public Candidates(int id) {
		this.id = id;
		this.point = 0;
	}
	@Override
	public String toString() {
		return "Candidates [id=" + id + ", point=" + point + "]";
	}
}
