package Ex04;

public class Director extends Manual{
       
	private float plus;
	
	public Director(){
		
	}

	public Director(String name, String birthday, float income, float plus) {
		super(name, birthday, income);
		this.plus = plus;
	}

	public float getPlus() {
		return plus;
	}

	public void setPlus(float plus) {
		this.plus = plus;
	}

	@Override
	public String toString() {
		return super.toString() + ", plus = " + plus;
	}
	
	public void DisplayDirector() {
		DisplayManual();
		System.out.printf("%-10f", plus);
		System.out.println("\n");
	}
	
	public void Directotal() {
		System.out.printf("%f\n", (plus + income)*300000);
	}
}
