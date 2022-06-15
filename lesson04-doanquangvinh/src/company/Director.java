package company;

public class Director extends Human {
	private float titleRatio;

	public Director() {
		// TODO Auto-generated constructor stub
	}

	public Director(String name, int birthDate, float wageRatio, float titleRatio) {
		super(name, birthDate, wageRatio);
		this.titleRatio = titleRatio;
	}

	public float getTitleRatio() {
		return titleRatio;
	}

	public void setTitleRatio(float titleRatio) {
		this.titleRatio = titleRatio;
	}

	@Override
	public String toString() {
		return "Director [toString()=" + super.toString() + "]";
	}

}
