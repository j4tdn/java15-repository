package view;

public class Ex04Director extends Ex04People {
	private float titleRatio;
	
	public Ex04Director() {

	}

	public Ex04Director(String name, int birthDate, float wageRatio, float titleRatio) {
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
		return "Ex04Director [titleRatio=" + titleRatio + ", toString()=" + super.toString() + "]";
	}
	
	
}
