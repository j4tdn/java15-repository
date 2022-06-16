package been;

public class President extends People {
	private float copositon;
	
	public President() {
		
	}

	public President(String name, String date, float cosalary, float copositon) {
		super(name, date, cosalary);
		this.copositon = copositon;
	}

	public float getCopositon() {
		return copositon;
	}

	public void setCopositon(float copositon) {
		this.copositon = copositon;
	}

	@Override
	public String toString() {
		return super.toString() + "copositon=" + copositon ;
	}
	public float payRoll() {
		return ((this.getCopositon() * 3000000 + this.getCosalary()));
	}
	
	
}
