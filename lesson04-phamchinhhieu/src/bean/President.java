package bean;



public class President extends People{
	private float coposition;
	
	public President() {
		// TODO Auto-generated constructor stub
	}

	public President(String name, String date, float cosalary, float coposition) {
		super(name, date, cosalary);
		this.coposition = coposition;
	}

	public float getCoposition() {
		return coposition;
	}

	public void setCoposition(float coposition) {
		this.coposition = coposition;
	}
	
	@Override
	public String toString() {
		return super.toString() + "coposition = " + coposition;
	}
	
	@Override
	public float payRoll() {
		return ((this.getCosalary() + this.getCoposition())* 3000000);
	}
	
}
