package main;

public class FootBall {
	private String deGea;
	private String carrick;

	public FootBall(String deGea, String carrick) {

		this.deGea = deGea;
		this.carrick = carrick;
	}

	@Override
	public String toString() {
		return "FootBall [deGea=" + deGea + ", carrick=" + carrick + "]";
	}
	

}
